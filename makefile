CC=javac
JAR=jar
EXE=java
PROJECT_NAME=TetrisGA
MAIN=Game
BIN=./bin
TestFileDir=./TestFiles
JAR_FILE=${PROJECT_NAME}.jar
MANIFEST_FILE=Manifest.txt
MANIFEST_CONTENT="Main-Class: ${MAIN}"
GIT_ROOT=.
M="Automated commit with MakeFile"

make: *.java
	$(CC) *.java

jar: make
	echo ${MANIFEST_CONTENT} > ${MANIFEST_FILE}
	$(JAR) cmvf $(MANIFEST_FILE) $(JAR_FILE) *.class 
	mkdir -p ${BIN}
	mv $(JAR_FILE) ${BIN} 

run: 
	$(EXE) $(MAIN) $(INPUT_FILE)

exec:
	${EXE} -${JAR} ${BIN}/${JAR_FILE}

clean:
	-rm -f *.class $(MANIFEST_FILE)

wipe: clean
	-rm -f -r ${BIN}

again: make
	clear
	make run

git:
	git add ${GIT_ROOT}
	git commit -m $(M)
	git push

status:
	git status;
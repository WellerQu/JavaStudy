# 设置要生成的jar包名
JAR_PKG = HelloWorld.jar

# 设置项目入口点
ENTRY_POINT = com.nixon.Test

# 是否需要资源目录
HAS_RES_DIR = yes

# 源文件列表
SOURCE_FILES = \
src/com/nixon/Test.java

# 设置java编译器
JAVAC = javac

# 设置编译选项
JFLAGS = -encoding UTF-8

########### 编译动作 ############

build: $(SOURCE_FILES:.java=.class)

%.class: %.java
	$(JAVAC) -cp bin -d bin $(JFLAGS) $<

rebuild: clean build

.PHONY: new clean run jar

new:
ifeq ("$(HAS_RES_DIR)", "yes")
	mkdir -pv src bin res
else
	mkdir -pv src bin
endif

clean:
	rm -rfv bin/*

run:
	java -cp bin $(ENTRY_POINT)

runJar:
	java -jar $(JAR_PKG)

jar:
ifeq ("$(HAS_RES_DIR)","yes")
	jar cvfe $(JAR_PKG) $(ENTRY_POINT) -C bin . res
else
	jar cvfe $(JAR_PKG) $(ENTRY_POINT) -C bin .
endif

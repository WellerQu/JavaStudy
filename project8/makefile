# 若目录不存在,则创建目录
define MKDIR_EXPORTS
	test -d $(JAR_DIR) || mkdir -pv $(JAR_DIR)
endef

define MKDIR_BIN
	test -d $(OUTPUT_BIN) || mkdir -pv $(OUTPUT_BIN)
endef

# 设置要生成的jar包名
JAR_DIR = exports
JAR_PKG = $(JAR_DIR)/Music.jar
# JAR_PKG := HelloWorld.jar

# 输出.class文件的bin目录
OUTPUT_BIN = bin

# 设置项目入口点
ENTRY_POINT = polymorphism.music.Music;

# 是否需要资源目录
HAS_RES_DIR = yes

# 扩展jar
EXTENTION_JAR = \
.
#$(JAVA_HOME)/lib

# 源文件列表
SOURCE_FILES = \
src/polymorphism/music/Note.java\
src/polymorphism/music/Instrument.java\
src/polymorphism/music/Wind.java\
src/polymorphism/music/Music.java\

# 设置java编译器
JAVAC = javac

# 设置编译选项
JFLAGS = -encoding UTF-8

########### 编译动作 ############

vpath %.class $(OUTPUT_BIN)
vpath %.java src

# 第一个目标(target)会被认为是默认目标, 
# 即直接执行`make`使用的是build目标
build: $(SOURCE_FILES:.java=.class)
#	@say 编译完成

# 把SOURCE_FILES中所有以.java结尾的字符串替换为.class 
# 对结尾的定义: 空格或结束符

%.class: %.java
	$(JAVAC) -Xlint:unchecked -cp $(OUTPUT_BIN):$(EXTENTION_JAR) -d $(OUTPUT_BIN) $(JFLAGS) $<

rebuild: clean build

# 使用PHONY目标,避免同名文件相冲突,不会检查clean文件存在与否,
# 都要执行清除操作
.PHONY: new clean run jar runJar

new:
	@echo initialize project success
ifeq ("$(HAS_RES_DIR)", "yes")
	mkdir -pv src $(OUTPUT_BIN) res
else
	mkdir -pv src $(OUTPUT_BIN)
endif

# ifeq or ifneq or ifdef

run:
	@echo --------------------- running ----------------------
	java -cp $(OUTPUT_BIN) $(ENTRY_POINT)
	@echo ---------------------   end   ----------------------
#	@say 运行完成

runJar:
	java -jar $(JAR_PKG)

jar:
ifeq ("$(HAS_RES_DIR)","yes")
	$(MKDIR_EXPORTS)
	jar cvfe $(JAR_PKG) $(ENTRY_POINT) -C $(OUTPUT_BIN) . res
else
	$(MKDIR_EXPORTS)
	jar cvfe $(JAR_PKG) $(ENTRY_POINT) -C $(OUTPUT_BIN) .
endif

clean:
	rm -rfv $(OUTPUT_BIN)/*
	rm -fv  $(JAR_PKG)
#	@say 清理完成



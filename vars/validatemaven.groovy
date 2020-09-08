def pom = readMavenPom file: "${workspace}/pom.xml"
def currPomversion = "${pom.version}"
def fileExt = findFiles(glob: '**/**')
for (int i=o; i<filesExt.size(); i++) {
      if("${fileExt[i].name}".contains("pom.xml"){
      def readPom = readFile file: "${fileExt[i]"
      def lines = readPom.readLines()
      def lineNo = 0
      for (line in lines){
          lineNo ++
          if(line.comtains("<version>${pomversion}</version>")){
            sh script: "sed -i 's/$currPomversion}/${Relnumber}/g' ${filesExt[i]}"
          }
        }  

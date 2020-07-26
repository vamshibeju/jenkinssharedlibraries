def call(){
  sh 'ls'
  sh 'pwd'
  sh 'jenkinssharedlibraries/vars/creatingxmlpython.py'
}

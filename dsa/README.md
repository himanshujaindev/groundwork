# data-structures-algorithms
DSA in Python and Java


### Coding Profile
- **[leetcode.com/himanshujaindev](https://leetcode.com/u/himanshujaindev/)**


### Installation and Setup
1. Download JDK - [here](https://www.oracle.com/in/java/technologies/downloads/)
```
❯ javac -version
javac 24

❯ java -version
java version "24" 2025-03-18
Java(TM) SE Runtime Environment (build 24+36-3646)
Java HotSpot(TM) 64-Bit Server VM (build 24+36-3646, mixed mode, sharing)

uv-based python virtual env
❯ setup_venv 3.12
```

2. VS Code Extension - [java](https://marketplace.visualstudio.com/items?itemName=Oracle.oracle-java), [py-format](https://marketplace.visualstudio.com/items?itemName=ms-python.black-formatter)

<img width="400" alt="py-extension" src="https://github.com/user-attachments/assets/b7b511d0-8514-4d56-a938-f2feb82339be" />
<img width="400" alt="java-extension" src="https://github.com/user-attachments/assets/034e0831-b44c-4d83-bdd3-238a050cee98" />

3. Enable Format on Save option
4. Update Keyboard shortcut:<br>
    a. Start Debugging = ```⌘+'```<br>
    b. Run Without Debugging = ```⌘+⏎```<br>
       (Applicable for java and py)
5. Set git user:
```
git config --global --edit
(filename: ~/.gitconfig)
git commit --amend --reset-author
git config --global user.name
git config --global user.email
git log
Author: himanshujaindev <dev.himanshujain@gmail.com>
```

### Folder Structure
```
brew install tree
```
```
(tree -P '*.java|*.py') | sed '1s/^/```\n/' | sed '$a\
```' > FILES.md
```


### Keyboard Shortcuts (VSCode)

1. Format: ```⌘+S```
2. Debug (workbench.action.debug.start): ```⌘+'```
3. Run (workbench.action.debug.run): ```⌘+⏎```


### Todo Before Commit

- Format the document
- Update the directory tree
- Follow the naming convention


### Naming Convention

- Folder Name = Upper Camel Case -> ```DataStructures```
- File Name | Class Name = Small Underscore Case -> ```min_heap.java```
- Method Name | Variable Name = Small Camel Case -> ```printHeap()```


### Resources
1. https://neetcode.io/practice
2. https://takeuforward.org
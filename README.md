<pre>
  ____               _     ____        _
 |  _ \  _   _  ___ | |_  / ___| ___  | |  ___   _ __
 | |_) || | | |/ __|| __|| |    / _ \ | | / _ \ | '__|
 |  __/ | |_| |\__ \| |_ | |___| (_) || || (_) || |
 |_|     \__,_||___/ \__| \____|\___/ |_| \___/ |_|
</pre>


## Introduction
* The maven project to System.out.println colorful message easily.
* Related project in Ruby, [puts_color](https://github.com/tobegit3hub/puts_color)



## Usage
Add this in the pom.xml of your project:

    <repositories>
      <repository>
        <id>PutsColor</id>
        <url>https://raw.github.com/tobegit3hub/PutsColor/master/release</url>
      </repository>
    </repositories>

    <dependencies>
      <dependency>
        <groupId>cn.chendihao</groupId>
        <artifactId>PutsColor</artifactId>
        <version>0.1.0</version>
      </dependency>
    </dependencies>

Or deploy the project in local repository:

    mvn clean package install

Then you can simply call:

    PutsColor.put_red("")
    PutsColor.put_green("")
    PutsColor.put_yellow("")
    PutsColor.put_blue("")
    PutsColor.put_purple("")
    PutsColor.put_cyan("")
    PutsColor.put_grey("")
        
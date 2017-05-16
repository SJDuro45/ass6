<?php
        $op = $_POST["op"];
        if($op == "uploadNames"){
            $namelist = $_POST["namelist"];
            $cmd = "java -classpath /var/www/cgi-bin/:/var/www/cgi-bin/mysql-connector-java-5.1.23-bin.jar name.Server $op $namelist";
        } else {
            $skill = $_POST["skill"];
            $day = $_POST["day"];
            $hour = $_POST["hour"];
            $cmd = "java -classpath /var/www/cgi-bin/:/var/www/cgi-bin/mysql-connector-java-5.1.23-bin.jar name.Server $op $skill $day $hour";
}
	$str = shell_exec($cmd);
        print($str);
?>
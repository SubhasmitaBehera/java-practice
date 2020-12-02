package fileIO.filepermission;

import java.io.FilePermission;
import java.io.IOException;
import java.security.PermissionCollection;

public class FilePermissionDemo {
    public static void main(String[] args) throws IOException {
        FilePermission file1 = new FilePermission("C:\\Users\\BABLU\\Desktop\\file.txt", "read,write,delete");
        FilePermission file2 = new FilePermission("C:\\Users\\BABLU\\Desktop\\file.txt", "read");
        PermissionCollection permission = file1.newPermissionCollection();
        permission.add(file1);
        String action = file1.getActions();
        System.out.println("Action taken on the file1 : "+action);
        System.out.println("Hashcode is  : "+file1.hashCode());
        System.out.println("is file1 has same permission as file2 : "+file1.implies(file2));

    }
}


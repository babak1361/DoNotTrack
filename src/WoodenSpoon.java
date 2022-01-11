public class WoodenSpoon {
    public static void main(String[] args) {
        System.out.println("Hello World");

    }
}
/*
## How to Remove version control from The project you did not intented to keep track of.

1. Create a new project called `DoNotTrack`
2. Create `.gitignore` file at root directory
3. Create a java class under `src` called `WoodenSpoon`
4. Enable version control to create new repo
5. Make 4 commits
6. Oops did not actually want to track this project
7. All you have to do is
   1. remove `.git` folder to remove the local repo
   2. let intelliJ know this is not a git repo anymore
 */
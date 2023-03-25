abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class mybook extends Book{
    String title;
    public void setTitle(String b){
        this.title=b;
    }
    public String getTitle(){
        return title;
    }
}

class bookname{
    public static void main(String[] args){
        mybook b1=new mybook();
        b1.setTitle("A tale of two cities");
        System.out.println("The title is:"+b1.getTitle());
    }
}


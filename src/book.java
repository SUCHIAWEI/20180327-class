public class book {
    private  String name , author , publisher , isbn ;
    private int price ;



    public book(String name1 ,String author1,String publisher1,String isbn1,int price1){
        this.setName(name1);
        this.setAuthor(author1);
        this.setPublisher(publisher1);
        this.setIsbn(isbn1);
        this.setPrice(price1);
    }
    public void setName (String name1){ this.name =name1;}
    public String getName() { return name; }

    public void setAuthor (String author1){ this.author =author1;}
    public String getAuthor() { return author; }

    public void setPublisher (String publisher1){ this.publisher =publisher1;}
    public String getPublisher() { return publisher; }

    public void setIsbn (String isbn1){ this.isbn =isbn1;
    if (isbn.length()<13){
        isbn="error we need 13 number";}
    else {isbn =isbn1;}
    }
    public String getIsbn() { return isbn; }

    public void setPrice (int price1){ this.price =price1;
    if (price<0){
        System.out.println("error");
    }}
    public int getPrice() { return price; }

    public void showInfo(){
        System.out.println(this.name+"\t"+this.author+"\t"+this.publisher+"\t"+this.isbn+"\t"+this.price);
    }

}

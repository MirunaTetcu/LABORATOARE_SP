public class BMPImageLoader implements ImageLoader{

    private String imageName;

    public BMPImageLoader(String imageName)
    {
        this.imageName = imageName;
    }
    public void loadImage(String str) {
        // TODO Auto-generated method stub
        System.out.println("Loaded image: " + str);
    }

}
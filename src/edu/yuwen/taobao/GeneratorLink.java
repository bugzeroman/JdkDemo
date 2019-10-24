package edu.yuwen.taobao;

class GeneratorLink {
    private static String DEMAIN = "https://taoquan.taobao.com/coupon/unify_apply.htm?";// TAOBAO.JU.BASEURL
    private String[] urlelements;

    public GeneratorLink(String... parameters) {
        this.urlelements = parameters;
    }

    public String link() {
        return GeneratorLink.DEMAIN + String.join("&", this.urlelements);
    }

    public static void main(String[] args) {
        System.out.println(new GeneratorLink("sellerId=725677994&activityId=b309471ab299474c800ec0426f788ba4").link());
    }
}

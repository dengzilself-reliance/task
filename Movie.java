package ArryayList;

public class Movie {  //  电影类
    private String name; //电影名
    private double score;//电影评分
    private String actor; //演员

    /**
     * 无参数构造器
     */
    public Movie() {
    }

    /**
     *  有参数构造器  存电影元素
     * @param name 电影名
     * @param score 电影评分
     * @param actor 演员
     */
    public Movie(String name, double score, String actor) {
        this.name = name;
        this.score = score;
        this.actor = actor;
    }

    /**
     *
     * @return 返回 电影名
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name 设置电影名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return 放回 电影评分
     */
    public double getScore() {
        return score;
    }

    /**
     *
     * @param score 设置 电影评分
     */
    public void setScore(double score) {
        this.score = score;
    }

    /**
     *
     * @return 返回 演员
     */
    public String getActor() {
        return actor;
    }

    /**
     *
     * @param actor 设置 演员
     */
    public void setActor(String actor) {
        this.actor = actor;
    }
}

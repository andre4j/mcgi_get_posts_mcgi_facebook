package andre4j.mcgi_get_posts_mcgi_facebook.domain.model;

public class PostModel {
    private String datePublish;
    private String typeOfPost;
    private String description;
    private String linkOfPost;

    public PostModel() {}

    public PostModel(String datePublish, String typeOfPost, String description, String linkOfPost) {
        this.datePublish = datePublish;
        this.typeOfPost = typeOfPost;
        this.description = description;
        this.linkOfPost = linkOfPost;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((datePublish == null) ? 0 : datePublish.hashCode());
        result = prime * result + ((typeOfPost == null) ? 0 : typeOfPost.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((linkOfPost == null) ? 0 : linkOfPost.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PostModel other = (PostModel) obj;
        if (datePublish == null) {
            if (other.datePublish != null)
                return false;
        } else if (!datePublish.equals(other.datePublish))
            return false;
        if (typeOfPost == null) {
            if (other.typeOfPost != null)
                return false;
        } else if (!typeOfPost.equals(other.typeOfPost))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (linkOfPost == null) {
            if (other.linkOfPost != null)
                return false;
        } else if (!linkOfPost.equals(other.linkOfPost))
            return false;
        return true;
    }

    public String getDatePublish() {
        return datePublish;
    }

    public void setDatePublish(String datePublish) {
        this.datePublish = datePublish;
    }

    public String getTypeOfPost() {
        return typeOfPost;
    }

    public void setTypeOfPost(String typeOfPost) {
        this.typeOfPost = typeOfPost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLinkOfPost() {
        return linkOfPost;
    }

    public void setLinkOfPost(String linkOfPost) {
        this.linkOfPost = linkOfPost;
    }

    @Override
    public String toString() {
        return "PostModel [datePublish=" + datePublish + ", typeOfPost=" + typeOfPost + ", description=" + description
                + ", linkOfPost=" + linkOfPost + "]";
    }
}
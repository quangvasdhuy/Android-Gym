package android.com.example.customnavigation.Model;

import java.io.Serializable;
import java.util.List;

public class DataModel implements Serializable
{
    private List<Data> data;

    private String status;

    private String message1;

    public List<Data> getData ()
    {
        return data;
    }

    public void setData (List<Data> data)
    {
        this.data = data;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String getMessage1 ()
    {
        return message1;
    }

    public void setMessage1 (String message1)
    {
        this.message1 = message1;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [data = "+data+", status = "+status+", message1 = "+message1+"]";
    }

    public static class Data
    {
        private String image;

        private String name;

        private String description;

        private String linkVideo;

        private String id;

        private String rep;



        public Data(String id, String rep, String name, String description, String image, String linkVideo) {
            this.image = image;
            this.name = name;
            this.description = description;
            this.id = id;
            this.rep = rep;
            this.linkVideo = linkVideo;
        }

        public String getImage ()
        {
            return image;
        }

        public void setImage (String image)
        {
            this.image = image;
        }

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        public String getDescription ()
        {
            return description;
        }

        public void setDescription (String description)
        {
            this.description = description;
        }

        public String getLinkVideo ()
        {
            return linkVideo;
        }

        public void setLinkVideo (String linkVideo)
        {
            this.linkVideo = linkVideo;
        }

        public String getId ()
        {
            return id;
        }

        public void setId (String id)
        {
            this.id = id;
        }

        public String getRep ()
        {
            return rep;
        }

        public void setRep (String rep)
        {
            this.rep = rep;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [image = "+image+", name = "+name+", description = "+description+", linkVideo = "+linkVideo+", id = "+id+", rep = "+rep+"]";
        }
    }
}

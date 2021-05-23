package DRW;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class disney {

    /*
     * Complete the 'getTopTitles' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING contentData
     *  2. STRING brandPreferences
     *  3. STRING contentTypePreferences
     *
     * Two utility methods have been provided:
     *  1. convertPreferences - converts a json string of preferences to a Map<String, String>
     *  2. convertContentData - converts a json string of content data to a List<Content>
     */

	
	
	public static void main(String[] args) {
		
		String contentData="[{\"title\": \"Disney Mickey Mouse Clubhouse: Mickey Goes Fishing\",\"brand\": \"Disney\",\"availability\": [\"US\"],\"availableDate\": \"2019-09-11T22:00:00.000Z\",\"isKidsContent\": true,\"popularityScore\": 75,\"contentType\": \"series\"},{\"title\": \"Disney High School Musical: The Musical: The Series: Act Two\",\"brand\": \"Disney\",\"availability\": [\"US\", \"FR\", \"ES\"],\"availableDate\": \"2019-01-10T08:00:00.000Z\",\"isKidsContent\": false,\"popularityScore\": 97,\"contentType\": \"series\"},{\"title\": \"The Imagineering Story: To Infinity and Beyond\",\"brand\": \"Disney\",\"availability\": [\"US\", \"FR\", \"DE\"],\"availableDate\": \"2019-12-13T08:00:00.000Z\",\"isKidsContent\": false,\"popularityScore\": 76,\"contentType\": \"series\"},{\"title\": \"Diving with Dolphins\",\"brand\": \"Disney\",\"availability\": [\"US\", \"CA\", \"ES\"],\"availableDate\": \"2019-04-03T07:00:00.000Z\",\"isKidsContent\": true,\"popularityScore\": 89,\"contentType\": \"movie\"},{\"title\": \"Encore!:  Grease - 1990 - Hackensack, Nj\",\"brand\": \"Disney\",\"availability\": [\"US\", \"CA\", \"FR\", \"ES\"],\"availableDate\": \"2019-11-29T08:00:00.000Z\",\"isKidsContent\": false,\"popularityScore\": 78,\"contentType\": \"series\"},{\"title\": \"Timmy Failure: Mistakes Were Made\",\"brand\": \"Disney\",\"availability\": [\"US\", \"CA\", \"FR\", \"ES\", \"DE\"],\"availableDate\": \"2019-02-04T11:00:00.000Z\",\"isKidsContent\": false,\"popularityScore\": 80,\"contentType\": \"movie\"},{\"title\": \"Forky Asks a Question: What is a Pet?\",\"brand\": \"Pixar\",\"availability\": [\"US\", \"DE\"],\"availableDate\": \"2019-12-27T08:00:00.000Z\",\"isKidsContent\": true,\"popularityScore\": 75,\"contentType\": \"short\"}]";
		String brandPreferences="{\"Disney\": \"adore\", \"Pixar\": \"like\", \"Marvel\": \"indifferent\"}";
		String  contentTypePreferences="{\"short\": \"like\"}";
		getTopTitles(contentData,brandPreferences,contentTypePreferences);
	}
	
	
	
    public static List<String> getTopTitles(String contentData, String brandPreferences, String  contentTypePreferences) {
      //content data list
    	List<Content> contentDataList= new ArrayList<Content>();
        contentDataList= convertContentData(contentData);
    //get brand preferences Map
        Map<String, String> BrandMap=  convertBrand(brandPreferences);
    //get content type preferences
        Map<String, String> contentMap= convertPreferences(contentTypePreferences);
        
        
        //filter the list based on the availibility in us and date before 01/01/2020
        List<Content> contentDataListFiltered=new ArrayList<Content>();;
        for(Content tmpcontent:contentDataList) {
        	try {
        	List<String>  availablecities=tmpcontent.getAvailability();
        	Date availableDate=tmpcontent.getAvailableDate();
        	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        	Date cutoffDate=simpleDateFormat.parse("2020-01-02T00:00:00.000Z");
        	if(availablecities.contains("US") && availableDate.compareTo(cutoffDate)<0) {
        		contentDataListFiltered.add(tmpcontent);
        	}
        	}catch(Exception e) {
        		System.out.println("Answer:"+e);
        	}
        }
 // scores map
        Map<String, Integer> scores=new HashMap<String, Integer>();
        scores.put("dislike",-20);
        scores.put("indifferent",0);
        scores.put("like",10);
        scores.put("adore",30);
        scores.put("love",50);
        
        
//  get map 
        for(Content tmpContent: contentDataListFiltered) {
        	int score=tmpContent.getPopularityScore();
        	int brandscore;
        	int contentscore;
        	String tmpBrand;
        	String tmpcontentType;
        	String tmppreference;
        	//calculate brad score
        	tmpBrand=tmpContent.getBrand();
        	tmppreference=BrandMap.getOrDefault(tmpBrand, "indifferent");
        	brandscore=scores.get(tmppreference);
        	//calculate contentscore
        	tmpcontentType=tmpContent.getContentType();
        	tmppreference=contentMap.getOrDefault(tmpcontentType, "indifferent");
        	contentscore=scores.get(tmppreference);
        	score=score+brandscore+contentscore;
        	tmpContent.popularityScore=score;
        }
        
        int len=Math.max(5,contentDataListFiltered.size());
       Collections.sort(contentDataListFiltered);
        List<String> ans=new ArrayList<String>();
        for(int i=0;i<len;i++)
        	ans.add(contentDataListFiltered.get(i).getTitle());
        
return ans;
    }
    
    public static Map<String, String> convertPreferences(final String preferences) {
        final Type typeToken = new TypeToken<Map<String, String>>(){}.getType();
        final Map<String, String> convertedValue = new GsonBuilder().create().fromJson(preferences, typeToken);
        if (convertedValue == null) {
            return Collections.emptyMap();
        } else {
            return convertedValue;
        }
    }



    public static Map<String, String> convertBrand(final String brand) {
        final Type typeToken = new TypeToken<Map<String, String>>(){}.getType();
        final Map<String, String> convertedValue = new GsonBuilder().create().fromJson(brand, typeToken);
        if (convertedValue == null) {
            return Collections.emptyMap();
        } else {
            return convertedValue;
        }
    }

    public static Map<String, String> convert(final String preferences) {
        final Type typeToken = new TypeToken<Map<String, String>>(){}.getType();
        final Map<String, String> convertedValue = new GsonBuilder().create().fromJson(preferences, typeToken);
        if (convertedValue == null) {
            return Collections.emptyMap();
        } else {
            return convertedValue;
        }
    }

    public static List<Content> convertContentData(final String contentData) {     
        final Type typeToken = new TypeToken<List<Content>>(){}.getType();
   
        final List<Content> convertedValue = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
            .create()
            .fromJson(contentData, typeToken);

        if (convertedValue == null) {
            return Collections.emptyList();
        } else {
            return convertedValue;
        }
    }

    public static class Content implements Comparable{
        private String title;
        private String brand;
        private List<String> availability;
        private Date availableDate;
        private Boolean isKidsContent;
        private Integer popularityScore;
        private String contentType;
        public String getTitle() {
            return this.title;
        }
        public String getBrand() {
            return this.brand;
        }
        public List<String> getAvailability() {
            return this.availability;
        }
        public Date getAvailableDate() {
            return this.availableDate;
        }
        public Boolean isKidsContent() {
            return this.isKidsContent;
        }
        public Integer getPopularityScore() {
            return this.popularityScore;
        }
        public String getContentType()  {
            return this.contentType;
        }
		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			Content c2=(Content) o;
			if(this.popularityScore>c2.popularityScore)
				return -1;
			else if (this.popularityScore<c2.popularityScore)	
				return 1;
			return this.getTitle().compareTo(c2.getTitle());
		}
    }

}

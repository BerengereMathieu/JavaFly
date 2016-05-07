package javafly.mosaic.environment;

import java.awt.Color;
import java.util.List;
import java.util.Map;

public class Environment {
	
	Integer getLabelCardinality(int idx){
		return labels.get(idx).cardinality;
	}
	
	Color getLabelColor(int idx){
		return labels.get(idx).color;
	}
	
	Integer getCommunitySize(int idx){
		return communities.get(idx).getSize();
	}

	Integer getCommunityLabelIdx(int idx){
		return communities.get(idx).getLabelIdx();
	}
	
	Integer getCommunityBbArea(int idx){
		int width=communities.get(idx).getBbXMax()-communities.get(idx).getBbXMin()+1;
		int height=communities.get(idx).getBbYMax()-communities.get(idx).getBbYMin()+1;
		return width*height;
	}
	
	List<List<Integer>> island;
	List<Label> labels;
	Map<Integer,Community> communities;
	Integer nextCommunitiesKey;

}

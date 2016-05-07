package javafly.mosaic.environment;

import java.awt.Color;
import java.util.List;
import java.util.Map;

public class Environment {

	
	List<List<Integer>> island;
	List<Label> labels;
	List<Integer> labelSitesUsed;
	Map<Integer,Community> communities;
	Integer nextCommunitiesKey;
	
	
	
	/**
	 * 
	 * @param labelIdx label of the community
	 * @param x abscissa of the first site of the community
	 * @param y ordinate of the first site of the community
	 * @return
	 */
	Integer addCommunity(int labelIdx,int x,int y){
		communities.put(nextCommunitiesKey, new Community(labelIdx,x,y));
		nextCommunitiesKey++;
		return nextCommunitiesKey-1;
	}
	
	Integer getLabelIdxMax(){
		return labels.size()-1;
	}
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

	public Integer getLabelSitesUsed(int idx) {
		return labelSitesUsed.get(idx);
	}
	
	

}

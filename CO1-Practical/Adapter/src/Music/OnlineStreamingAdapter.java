package Music;

public class OnlineStreamingAdapter implements MediaSource {
	 private OnlineStreamingService onlineService;
	    public OnlineStreamingAdapter(OnlineStreamingService onlineService) {
	        this.onlineService = onlineService;
	    }
	    public void play() {
	        onlineService.streamMusic();
	    }	
}

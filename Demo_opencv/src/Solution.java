
import com.xuggle.xuggler.IContainer;

class Solution
{
	public static void main(String args[])
	{
		IContainer container = IContainer.make();
		int result = container.open("/home/shivam/Desktop/test.mp4", IContainer.Type.READ, null);
		System.out.println(result);
		int numStreams = container.getNumStreams();
		long duration = container.getDuration();
		long fileSize = container.getFileSize();
		long bitRate = container.getBitRate();
		
		System.out.println(numStreams);
		
		
		
	}
}
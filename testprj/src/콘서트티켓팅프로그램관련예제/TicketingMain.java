package 콘서트티켓팅프로그램관련예제;

public class TicketingMain {

	public static void main(String[] args) {
		String FolderPath = "res/Concert";
	
		String[] FilePath = {
				"res/Concert/sectorA.txt",
				"res/Concert/sectorB.txt",
				"res/Concert/sectorS.txt",
				"res/Concert/sectorV.txt",
		};

		//폴더 자동 생성
		Init.InitFolder(FolderPath);
		for(int i = 0; i<FilePath.length; i++) {
			Init.InitFile(FilePath[i]);
		}
	}

}

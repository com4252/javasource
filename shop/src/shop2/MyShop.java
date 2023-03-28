package shop2;

import java.util.List;
import java.util.Scanner;

//배열로 선언된 부분 => ArrayList로 변경(프로그램 수정)

public class MyShop implements IShop{

	//쇼핑몰 이름
	private String title;
	//user 정보 저장 배열
	UserDTO[] users = new UserDTO[2];
	//product 정보 저장 배열
	Product products[] = new Product[4];
	//구매한 제품을 저장 배열(cart)
	Product carts[] = new Product[10];
	
	//선택된 user 저장
	private int selUser;
	
	//UserDAO 객체 생성
	UserDAO userDAO = new UserDAO();
	ProductDAO productDAO = new ProductDAO();
	
	
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {

		// user 정보 입력받아서 suser 테이블에 저장
		System.out.println("***** User 입력 *****");
		//userId,name,payNo를 입력받기
		System.out.print("userId 입력>>");
		int userId = Integer.parseInt(sc.nextLine());
		System.out.print("name 입력 >>");
		String name = sc.nextLine();
		System.out.print("payNo 입력 >>");
		int payNo = Integer.parseInt(sc.nextLine());
		

		System.out.println(userDAO.insert(userId, name, payNo)?"user 추가성공":"user 추가실패");
	}
	
	public void userList() {
		System.out.println("*******User 목록*******");
		System.out.println("userId\tname\tpayNo");
		System.out.println("-----------------------");
		List<UserDTO> list = userDAO.getList();
		for (UserDTO userDTO : list) {
			System.out.print(userDTO.getUserId()+"\t");
			System.out.print(userDTO.getName()+"\t");
			System.out.print(userDTO.getPayNo()+"\t");
		}
	}
	
	
	@Override
	public void genProduct() {
		// 상품 정보 입력받아서 product 테이블 저장
		System.out.println("***** Product 입력 *****");
		
		
		//상품정보 입력받기 => ProductDTO에 담기
		//productId, pName, price, content를 입력받기
		System.out.print("product_id >>");
		int productId = Integer.parseInt(sc.nextLine());
		System.out.print("pname >>");
		String pName = sc.nextLine();
		System.out.print("price >>");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print("content >>");
		String content = sc.nextLine();
		ProductDTO dto = new ProductDTO(productId,pName,price,content);
		
		System.out.println(productDAO.insert(dto)?"상품추가성공":"상품추가실패");
		
		
		
		
		
		
	}

	@Override
	public void start() {
		System.out.println(title + " : 메인화면 - 계정 선택");
		System.out.println("======================");

		for (int i = 0; i < users.length; i++) {
//			System.out.printf("[%d] %s(%s)\n",i,users[i].getName(),users[i].getPayType());
//		}
		System.out.println("[x]종  료");
		System.out.println("선택 : ");
		String sel = sc.nextLine();
		System.out.println("## "+sel+" 선택 ##");
		System.out.println();
		
		//0,1 =>productList()호출
		//다른걸 입력 시 => 메뉴를 확인해주세요.
		switch (sel) {
		case "x": case "X" :
			System.exit(0); //프로그램 종료
			break;
		case "0" : case "1" :
			selUser = Integer.parseInt(sel);
			productList();
			break;
		default: 
			System.out.println("메뉴를 확인해 주세요\n");
			start();
			break;
		}
		}
	}
	public void productList() {
		System.out.println();
		System.out.println(title + " : 상품 목록 - 상품 선택");
		System.out.println("============================");
		
		//products 배열 출력
		for (int i = 0; i < products.length; i++) {
			System.out.printf("[%d]",i);
			products[i].printDetail();
			products[i].printExtra();
		}
		System.out.println("[h] 메인 화면");
		System.out.println("[c] 체크 아웃");
		System.out.println("선택 : ");
		String sel = sc.nextLine();
		//상품선택 0~3 => cart 제품 추가
		switch (sel) {
			case "0": case "1": case "2": case"3": 
				for (int i = 0; i < carts.length; i++) {
					if(carts[i]==null) {
						//Integer.parseInt("0")==> 0
						carts[i] = products[Integer.parseInt(sel)];
						break;
					}
				}
				productList();
				break;
			case "h": case "H":
				start();
				break;
			case "c": case "C":
				checkOut();
				break;
		default:
			System.out.println("입력값을 확인해 주세요");
			productList();
			break;
		}
		//h=>start메소드 호출, c => checkOut()호출
	}
	
	public void checkOut() {
		System.out.println(title + " : 체크아웃");
		System.out.println("============================");
		
		//carts 출력
		int total = 0; //제품가격 합계
		for (int i = 0; i < carts.length; i++) {
			if(carts[i] !=null) {
				System.out.printf("[%d] %s(%d)\n",i,carts[i].getName(),carts[i].getPrice());
				total += carts[i].getPrice();
			}
		}
		
		System.out.println("=========================");
//		System.out.println("결제 방법 : "+users[selUser].getPayType());
		System.out.println("결제 금액 : "+total);
		System.out.println("[p] 이전, [q] 결제완료");
		System.out.println("선택 : ");
		String sel = sc.nextLine();
		
		//p일 때 productList()호출
		switch (sel) {
			case "p": case "P": 
			productList();
			break;
			case "q": case "Q": 
			System.out.println("결제 완료");
			System.exit(0);
			break;
		default:
			System.out.println("잘못된 입력입니다");
			checkOut();
			break;
		}
		//q일 때 결제가 완료되었습니다. 프로그램종료
		// 잘못입력시 checkOut()호출
	}
}

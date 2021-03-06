package example3Day4;

public class UserManager implements UserService {

	private Confirmation confirmation;
	
	public UserManager(Confirmation confirmation) {
		super();
		this.confirmation = confirmation;
	}

	@Override
	public void add(User user) {
		if (confirmation.confirm(user)) {
		System.out.println(user.getFirstName()+ " isimli kullanıcı sisteme eklendi.");
		}else {
			System.out.println("Kimlik numaranızı kontrol ediniz.");
		}
		
	}

	@Override
	public void update(User user) {
		if (confirmation.confirm(user)) {
			System.out.println(" Kullanıcı bilgileri güncellendi.");
			}else {
				System.out.println("Kullanıcı bilgilerini kontrol ediniz.");
			}	
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + ": isimli kullanıcının bilgileri silindi.");
	}

}

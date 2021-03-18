package address.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import address.dto.AddressDto;
import address.service.AddressService;



@Controller
public class AddressController {

	@RequestMapping("/")
	public String index() {
		return "/address/index";
	}
	
	@Autowired
	private AddressService addressService;
	
//	목록
	@RequestMapping("/address/addressList")
	public ModelAndView addressList() throws Exception {
		ModelAndView mv = new ModelAndView("/address/addressList");
		List<AddressDto> list = addressService.selectAddressList();
		mv.addObject("data", list);
		
		return mv;
	}
	
//	글 확인
	@RequestMapping("/address/addressDetail")
	public ModelAndView addressDetail(@RequestParam int num) throws Exception {
		ModelAndView mv = new ModelAndView("/address/addressDetail");
		
		AddressDto address = addressService.selectAddressDetail(num);
		mv.addObject("address", address);
		
		return mv;
	}
	
//	글 작성
	@RequestMapping("/address/addressWrite")
	public String adressWrite() throws Exception {
		return "/address/addressWrite";
	}
	
//	새 글 작성, 출력
	@RequestMapping("/addres/insertAddress")
	public String insertAddress(AddressDto address, MultipartHttpServletRequest files) throws Exception {
		addressService.insertAddress(address, files);
		return "redirect:/address/addressList";
	}
}

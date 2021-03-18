package address.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import address.dto.AddressDto;

@Mapper
public interface AddressMapper {

	List<AddressDto> selectAddressList() throws Exception;
	
	AddressDto selectAddressDetail(int num) throws Exception;
	
	void insertAddress(AddressDto address) throws Exception;
	
}

package com.fastcampus.java.ifs;

import com.fastcampus.java.model.network.Header;

public interface CrudInterface<Req, Res> {

    Header<Res> create(Header<Req> req);

    Header<Res> read(Long id);

    Header<Res> update(Header<Req> req);

    Header delete(Long id);
}

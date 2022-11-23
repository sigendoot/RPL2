package com.toko.bunga.service;

import com.toko.bunga.dao.TokoBungaDao;
import com.toko.bunga.model.TokoBunga;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Asep Hikmat
 */
@Service("TokoBungService")
@Transactional(readOnly = true)
public class TokoBungaServiceImpl implements TokoBungaService{
    @Autowired
    private TokoBungaDao tokoBungaDao;

    @Override
    public void save(TokoBunga tokobunga) {
        tokoBungaDao.save(tokobunga);
    }

    @Override
    public void update(TokoBunga tokobunga) {
        tokoBungaDao.update(tokobunga);
    }

    @Override
    public void delete(TokoBunga tokobunga) {
        tokoBungaDao.delete(tokobunga);
    }

    @Override
    public List<TokoBunga> getList() {
        return tokoBungaDao.getList();
    }
    
}

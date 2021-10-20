package dao;

import cn.nmtweb.bean.CorpusItem;

public interface DoCorpusDao {
    public boolean addToCorpus(CorpusItem corpusItem);
    public boolean createHuTranCor(String storeDirectoryRealPath);
}

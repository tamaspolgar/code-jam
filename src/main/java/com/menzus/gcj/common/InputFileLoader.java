package com.menzus.gcj.common;

import java.io.IOException;
import java.util.Iterator;

public interface InputFileLoader {
    Iterator<String> getLineIterator() throws IOException;
}

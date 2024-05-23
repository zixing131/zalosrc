package com.zing.zalo.leveldb.exception;

import androidx.annotation.Keep;
import fn0.AbstractC19060k;
import on0.AbstractC24342w;

@Keep
/* loaded from: classes.dex */
public class LevelDBException extends RuntimeException {
    public static final C8943a Companion = new C8943a(null);
    private static final String[] REPAIR_CORRUPTION = {"bad block contents", "not an sstable (bad magic number)", "truncated block read", "block checksum mismatch", "corrupted compressed block contents", "bad block type", "FileReader invoked with unexpected value", "bad entry in block", "corrupted internal key in DBIter", "corrupted key for", "file is too short to be an sstable", "IO error"};

    /* renamed from: com.zing.zalo.leveldb.exception.LevelDBException$a */
    /* loaded from: classes4.dex */
    public static final class C8943a {
        private C8943a() {
        }

        public /* synthetic */ C8943a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final boolean m47718a(String str) {
            boolean m127149O;
            if (str == null) {
                return false;
            }
            String[] strArr = LevelDBException.REPAIR_CORRUPTION;
            int length = strArr.length;
            int i11 = 0;
            while (i11 < length) {
                String str2 = strArr[i11];
                i11++;
                m127149O = AbstractC24342w.m127149O(str, str2, false, 2, null);
                if (m127149O) {
                    return true;
                }
            }
            return false;
        }
    }

    @Keep
    public LevelDBException(String str) {
        super(str);
    }

    public final boolean isRepairCorruption(String str) {
        return Companion.m47718a(str);
    }

    public LevelDBException() {
    }
}

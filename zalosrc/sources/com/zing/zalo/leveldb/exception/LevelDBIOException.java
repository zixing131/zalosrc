package com.zing.zalo.leveldb.exception;

import androidx.annotation.Keep;
import fn0.AbstractC19074t;
import on0.AbstractC24342w;

@Keep
/* loaded from: classes4.dex */
public final class LevelDBIOException extends LevelDBException {
    private LevelDBException baseException;
    private boolean isLockByPid;
    private int lockPid;

    public LevelDBIOException() {
    }

    public final LevelDBException getBaseException() {
        return this.baseException;
    }

    public final int getLockPid() {
        return this.lockPid;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        LevelDBException levelDBException = this.baseException;
        if (levelDBException != null) {
            AbstractC19074t.m100205c(levelDBException);
            return levelDBException.getMessage();
        }
        return super.getMessage();
    }

    public final boolean isLockByPid() {
        return this.isLockByPid;
    }

    @Keep
    public LevelDBIOException(String str) {
        super(str);
        boolean m127149O;
        int m127178g0;
        if (str == null) {
            return;
        }
        m127149O = AbstractC24342w.m127149O(str, " by pid ", false, 2, null);
        this.isLockByPid = m127149O;
        if (m127149O) {
            m127178g0 = AbstractC24342w.m127178g0(str, " by pid ", 0, false, 6, null);
            int i11 = m127178g0 + 8;
            if (i11 <= 0 || i11 >= str.length()) {
                this.isLockByPid = false;
                return;
            }
            String substring = str.substring(i11);
            AbstractC19074t.m100207e(substring, "(this as java.lang.String).substring(startIndex)");
            int length = substring.length() - 1;
            int i12 = 0;
            boolean z11 = false;
            while (i12 <= length) {
                boolean z12 = AbstractC19074t.m100209g(substring.charAt(!z11 ? i12 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z12) {
                    i12++;
                } else {
                    z11 = true;
                }
            }
            this.lockPid = Integer.parseInt(substring.subSequence(i12, length + 1).toString());
            String substring2 = str.substring(0, m127178g0);
            AbstractC19074t.m100207e(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            this.baseException = new LevelDBException(substring2);
        }
    }
}

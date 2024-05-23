package a30;

import android.text.TextUtils;
import com.zing.zalo.data.entity.chat.message.MessageId;

/* renamed from: a30.f */
/* loaded from: classes5.dex */
public class C0107f {

    /* renamed from: c */
    private static C0107f f625c;

    /* renamed from: b */
    private MessageId f627b = null;

    /* renamed from: a */
    private final C0106e f626a = new C0106e(100);

    private C0107f() {
    }

    /* renamed from: a */
    public static synchronized C0107f m476a() {
        C0107f c0107f;
        synchronized (C0107f.class) {
            try {
                if (f625c == null) {
                    f625c = new C0107f();
                }
                c0107f = f625c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0107f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public Integer m477b(MessageId messageId) {
        try {
            if (messageId != null) {
                if (!TextUtils.isEmpty(messageId.m41046j()) && this.f626a.containsKey(messageId.m41046j())) {
                    return (Integer) this.f626a.get(messageId.m41046j());
                }
                if (!TextUtils.isEmpty(messageId.m41044h())) {
                    return (Integer) this.f626a.get(messageId.m41046j());
                }
                return null;
            }
            return (Integer) this.f626a.get("");
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public synchronized void m478c(MessageId messageId, int i11) {
        try {
            try {
                if (messageId != null) {
                    this.f626a.put(messageId.m41044h(), Integer.valueOf(i11));
                    if (!TextUtils.isEmpty(messageId.m41046j())) {
                        this.f626a.put(messageId.m41046j(), Integer.valueOf(i11));
                    }
                } else {
                    this.f626a.put("", Integer.valueOf(i11));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

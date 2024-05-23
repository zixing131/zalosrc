package p716zh;

import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19074t;
import hu.C20131e;
import java.io.File;
import java.util.Random;
import me0.AbstractC23041d2;
import mm0.AbstractC23352g;
import p461qu.AbstractC25495a;

/* renamed from: zh.o */
/* loaded from: classes3.dex */
public final class C32042o {

    /* renamed from: a */
    public static final C32042o f147549a = new C32042o();

    private C32042o() {
    }

    /* renamed from: b */
    private final String m154585b(String str, boolean z11) {
        File file = new File(m154587c(), str);
        if (!file.exists() && z11) {
            file.mkdirs();
        }
        return file.getPath() + File.separator;
    }

    /* renamed from: a */
    public final String m154586a(int i11) {
        int nextInt;
        int i12;
        Random random = new Random();
        StringBuilder sb2 = new StringBuilder();
        for (int i13 = 0; i13 < i11; i13++) {
            int nextInt2 = random.nextInt(3);
            if (nextInt2 == 1) {
                i12 = random.nextInt(26) + 97;
            } else if (nextInt2 == 2) {
                i12 = random.nextInt(26) + 65;
            } else {
                if (nextInt2 == 0) {
                    nextInt = random.nextInt(10);
                } else {
                    nextInt = random.nextInt(10);
                }
                i12 = nextInt + 48;
            }
            sb2.append((char) i12);
        }
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: c */
    public final String m154587c() {
        File file = new File(C20131e.f99303a.m104949e(), "group");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getPath() + File.separator;
    }

    /* renamed from: d */
    public final String m154588d(String str) {
        if (AbstractC25495a.m132079d(str)) {
            AbstractC19074t.m100205c(str);
            return m154585b(str, true);
        }
        return C20131e.f99303a.m104949e();
    }

    /* renamed from: e */
    public final String m154589e(String str, MessageId messageId, String str2) {
        String str3;
        AbstractC19074t.m100208f(str2, "photoUrl");
        String m154588d = m154588d(str);
        if (messageId == null || (str3 = messageId.m41044h()) == null) {
            str3 = "";
        }
        return m154588d + AbstractC23352g.m122788d(str2 + str3) + AbstractC23041d2.m118220s(str2);
    }
}

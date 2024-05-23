package p006a0;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.zing.zalo.C8011e;
import com.zing.zalo.C8937j0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.SensitiveDataException;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import pm0.C24848g0;

/* renamed from: a0.a */
/* loaded from: classes2.dex */
public final class C0012a {

    /* renamed from: a */
    private ClipboardManager f28a;

    /* renamed from: b */
    private SensitiveData f29b;

    public C0012a(ClipboardManager clipboardManager, SensitiveData sensitiveData) {
        AbstractC19074t.m100208f(clipboardManager, "manager");
        this.f28a = clipboardManager;
        this.f29b = sensitiveData;
        m13d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:            if (r0.m35528c().length() == 0) goto L6;     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m13d() {
        String str;
        SensitiveData sensitiveData = this.f29b;
        if (sensitiveData != null) {
            AbstractC19074t.m100205c(sensitiveData);
        }
        AbstractC20110a.a aVar = AbstractC20110a.f98889a;
        new Exception("Access sensitive clipboard data without define sourceId").printStackTrace();
        aVar.mo104551d(String.valueOf(C24848g0.f119245a), new Object[0]);
        this.f29b = new SensitiveData("unknown", "unknown", null, 4, null);
        SensitiveData sensitiveData2 = this.f29b;
        String str2 = null;
        if (sensitiveData2 != null) {
            str = sensitiveData2.m35528c();
        } else {
            str = null;
        }
        if (!C8937j0.m47663l(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SourceId ");
            SensitiveData sensitiveData3 = this.f29b;
            if (sensitiveData3 != null) {
                str2 = sensitiveData3.m35528c();
            }
            sb2.append(str2);
            sb2.append(" does not have permission to access sensitive clipboard data");
            throw new SensitiveDataException(sb2.toString());
        }
    }

    /* renamed from: a */
    public final void m14a(ClipboardManager.OnPrimaryClipChangedListener onPrimaryClipChangedListener) {
        this.f28a.addPrimaryClipChangedListener(onPrimaryClipChangedListener);
    }

    /* renamed from: b */
    public final ClipData m15b() {
        m13d();
        C8011e m47657e = C8937j0.m47657e();
        SensitiveData sensitiveData = this.f29b;
        AbstractC19074t.m100205c(sensitiveData);
        m47657e.m43183b(sensitiveData);
        return this.f28a.getPrimaryClip();
    }

    /* renamed from: c */
    public final void m16c(ClipData clipData) {
        AbstractC19074t.m100208f(clipData, "clip");
        m13d();
        C8011e m47657e = C8937j0.m47657e();
        SensitiveData sensitiveData = this.f29b;
        AbstractC19074t.m100205c(sensitiveData);
        m47657e.m43183b(sensitiveData);
        this.f28a.setPrimaryClip(clipData);
    }
}

package p585vs;

import am.InterfaceC0949z;
import android.text.TextUtils;
import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19074t;

/* renamed from: vs.a */
/* loaded from: classes4.dex */
public final class C28609a {

    /* renamed from: a */
    public String f132634a;

    /* renamed from: b */
    public long f132635b;

    /* renamed from: c */
    public long f132636c;

    /* renamed from: d */
    public long f132637d;

    /* renamed from: e */
    public long f132638e;

    /* renamed from: f */
    public boolean f132639f;

    public C28609a(String str, long j11, long j12) {
        AbstractC19074t.m100208f(str, "threadId");
        this.f132634a = str;
        this.f132635b = j11;
        this.f132636c = j12;
        this.f132637d = 0L;
        this.f132638e = 0L;
    }

    /* renamed from: a */
    public final boolean m143024a(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "messageId");
        if (this.f132637d >= messageId.m41047k() && this.f132638e >= messageId.m41045i()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m143025b() {
        return this.f132637d > 0 || this.f132638e > 0;
    }

    public C28609a(String str, long j11, long j12, long j13, long j14, boolean z11) {
        AbstractC19074t.m100208f(str, "threadId");
        this.f132634a = str;
        this.f132635b = j11;
        this.f132636c = j12;
        this.f132637d = j13;
        this.f132638e = j14;
        this.f132639f = z11;
    }

    public C28609a(InterfaceC0949z interfaceC0949z) {
        AbstractC19074t.m100208f(interfaceC0949z, "cursor");
        this.f132634a = "";
        try {
            String string = interfaceC0949z.getString(interfaceC0949z.getColumnIndex("thread_id"));
            AbstractC19074t.m100207e(string, "getString(...)");
            this.f132634a = string;
            String string2 = interfaceC0949z.getString(interfaceC0949z.getColumnIndex("last_global_msg_id"));
            AbstractC19074t.m100207e(string2, "getString(...)");
            long j11 = 0;
            this.f132635b = TextUtils.isEmpty(string2) ? 0L : Long.parseLong(string2);
            String string3 = interfaceC0949z.getString(interfaceC0949z.getColumnIndex("last_client_msg_id"));
            AbstractC19074t.m100207e(string3, "getString(...)");
            this.f132636c = TextUtils.isEmpty(string3) ? 0L : Long.parseLong(string3);
            String string4 = interfaceC0949z.getString(interfaceC0949z.getColumnIndex("last_read_global_msg_id"));
            AbstractC19074t.m100207e(string4, "getString(...)");
            this.f132637d = TextUtils.isEmpty(string4) ? 0L : Long.parseLong(string4);
            String string5 = interfaceC0949z.getString(interfaceC0949z.getColumnIndex("last_read_client_msg_id"));
            AbstractC19074t.m100207e(string5, "getString(...)");
            if (!TextUtils.isEmpty(string5)) {
                j11 = Long.parseLong(string5);
            }
            this.f132638e = j11;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}

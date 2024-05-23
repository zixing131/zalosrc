package p716zh;

import android.content.Context;
import android.content.res.Resources;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C18005u0;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import p132ej.C18446h;
import p348mi.AbstractC23306f;

/* renamed from: zh.p1 */
/* loaded from: classes3.dex */
public final class C32058p1 {

    /* renamed from: a */
    private final C31973j5 f147605a;

    /* renamed from: b */
    private final String f147606b;

    /* renamed from: c */
    private final long f147607c;

    /* renamed from: d */
    private final long f147608d;

    /* renamed from: e */
    private boolean f147609e;

    /* renamed from: f */
    private ContactProfile f147610f;

    public C32058p1(C31973j5 c31973j5, String str, long j11, long j12) {
        AbstractC19074t.m100208f(c31973j5, "group");
        AbstractC19074t.m100208f(str, "deleteType");
        this.f147605a = c31973j5;
        this.f147606b = str;
        this.f147607c = j11;
        this.f147608d = j12;
        c31973j5.m153788u0();
    }

    /* renamed from: a */
    public final ContactProfile m154667a() {
        int i11;
        String string;
        int i12;
        Context m35500c = MainApplication.Companion.m35500c();
        ContactProfile contactProfile = new ContactProfile(1, this.f147605a.m153781r());
        contactProfile.f42446v = this.f147605a.m153756e();
        contactProfile.f42437s = this.f147605a.m153793y();
        C18446h c18446h = new C18446h(this.f147608d);
        c18446h.m97743D(20);
        contactProfile.m40409i1(c18446h);
        if (AbstractC19074t.m100204b(this.f147606b, "1")) {
            Resources resources = m35500c.getResources();
            if (this.f147605a.m153747Y()) {
                i12 = AbstractC8020f0.str_msg_info_community_deleted_reason_owner_deleted_community;
            } else {
                i12 = AbstractC8020f0.str_msg_info_group_deleted_reason_owner_deleted_group;
            }
            string = resources.getString(i12);
        } else {
            Resources resources2 = m35500c.getResources();
            if (this.f147605a.m153747Y()) {
                i11 = AbstractC8020f0.str_msg_info_community_deleted_reason_kicked_out;
            } else {
                i11 = AbstractC8020f0.str_msg_info_group_deleted_reason_kicked_out;
            }
            string = resources2.getString(i11);
        }
        contactProfile.m40401d1(string);
        return contactProfile;
    }

    /* renamed from: b */
    public final String m154668b() {
        return this.f147606b;
    }

    /* renamed from: c */
    public final long m154669c() {
        return this.f147607c;
    }

    /* renamed from: d */
    public final ContactProfile m154670d() {
        return this.f147610f;
    }

    /* renamed from: e */
    public final C31973j5 m154671e() {
        return this.f147605a;
    }

    /* renamed from: f */
    public final long m154672f() {
        return this.f147608d;
    }

    /* renamed from: g */
    public final C17945a0 m154673g() {
        int i11;
        String string;
        int i12;
        Context m35500c = MainApplication.Companion.m35500c();
        C18005u0.a aVar = new C18005u0.a();
        if (AbstractC19074t.m100204b(this.f147606b, "1")) {
            Resources resources = m35500c.getResources();
            if (this.f147605a.m153747Y()) {
                i12 = AbstractC8020f0.str_msg_info_community_deleted_reason_owner_deleted_community;
            } else {
                i12 = AbstractC8020f0.str_msg_info_group_deleted_reason_owner_deleted_group;
            }
            string = resources.getString(i12);
        } else {
            Resources resources2 = m35500c.getResources();
            if (this.f147605a.m153747Y()) {
                i11 = AbstractC8020f0.str_msg_info_community_deleted_reason_kicked_out;
            } else {
                i11 = AbstractC8020f0.str_msg_info_group_deleted_reason_kicked_out;
            }
            string = resources2.getString(i11);
        }
        AbstractC19074t.m100205c(string);
        aVar.m95730l(string);
        aVar.m95719a("action.chat.delete", "", m35500c.getResources().getString(AbstractC8020f0.str_msg_info_group_deleted_action_delete_thread));
        aVar.m95726h(new ArrayList());
        C18005u0 m95721c = aVar.m95721c();
        MessageId.C7932a c7932a = MessageId.Companion;
        String m103086b = AbstractC23306f.m120599M0().m103086b();
        String m154674h = m154674h();
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        C17945a0 m95365a = new C17945a0.w(c7932a.m41064b(m103086b, "", m154674h, str), 20).m95359K(this.f147607c).m95368d(m95721c).m95365a();
        AbstractC19074t.m100207e(m95365a, "build(...)");
        m95365a.m94951M9();
        return m95365a;
    }

    /* renamed from: h */
    public final String m154674h() {
        return "group_" + this.f147605a.m153781r();
    }

    /* renamed from: i */
    public final boolean m154675i() {
        return this.f147609e;
    }

    /* renamed from: j */
    public final void m154676j(boolean z11) {
        this.f147609e = z11;
    }
}

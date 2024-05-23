package com.zing.zalo.p077ui.toolstorage.detail;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailPage;
import com.zing.zalo.p077ui.toolstorage.detail.VoiceViewerItem;
import com.zing.zalo.utils.ToastUtils;
import dj.C17945a0;
import dj.C17964g1;
import dj.C17969i0;
import eg0.C18426a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23041d2;
import me0.AbstractC23280z4;
import mg.C23288a;
import mm0.AbstractC23350e;
import on0.AbstractC24342w;
import p487rl.C25821b;
import p716zh.AbstractC32201z4;

/* loaded from: classes6.dex */
public final class VoiceViewerItem implements Parcelable {
    public static final C13379a CREATOR = new C13379a(null);

    /* renamed from: p */
    private String f68585p;

    /* renamed from: q */
    private MessageId f68586q;

    /* renamed from: r */
    private String f68587r;

    /* renamed from: s */
    private long f68588s;

    /* renamed from: t */
    private String f68589t;

    /* renamed from: u */
    private long f68590u;

    /* renamed from: v */
    private boolean f68591v;

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.VoiceViewerItem$a */
    /* loaded from: classes6.dex */
    public static final class C13379a implements Parcelable.Creator {
        private C13379a() {
        }

        public /* synthetic */ C13379a(AbstractC19060k abstractC19060k) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public VoiceViewerItem createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new VoiceViewerItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public VoiceViewerItem[] newArray(int i11) {
            return new VoiceViewerItem[i11];
        }
    }

    public VoiceViewerItem(String str, MessageId messageId, String str2, long j11, String str3, long j12) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "localPath");
        AbstractC19074t.m100208f(str3, "m4aUrl");
        this.f68585p = str;
        this.f68586q = messageId;
        this.f68587r = str2;
        this.f68588s = j11;
        this.f68589t = str3;
        this.f68590u = j12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m75059j(VoiceViewerItem voiceViewerItem) {
        String str;
        String str2;
        int m127178g0;
        int m127178g02;
        AbstractC19074t.m100208f(voiceViewerItem, "this$0");
        try {
            String str3 = voiceViewerItem.f68587r;
            if (!TextUtils.isEmpty(str3) && AbstractC23041d2.m118194A(str3)) {
                m127178g0 = AbstractC24342w.m127178g0(str3, "/", 0, false, 6, null);
                int i11 = m127178g0 + 1;
                m127178g02 = AbstractC24342w.m127178g0(str3, ".", 0, false, 6, null);
                str = str3.substring(i11, m127178g02);
                AbstractC19074t.m100207e(str, "substring(...)");
            } else {
                str = "";
            }
            if (AbstractC32201z4.m155246g(str)) {
                str2 = str + AbstractC23041d2.m118220s(voiceViewerItem.f68589t);
            } else {
                str2 = AbstractC32201z4.m155243d(voiceViewerItem.f68588s) + AbstractC23041d2.m118220s(voiceViewerItem.f68589t);
            }
            AbstractC23280z4.m120300L(str3, str2, true, null);
            ToastUtils.showMess(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_msg_already_save_in));
        } catch (Exception e11) {
            ToastUtils.showMess(MainApplication.Companion.m35500c().getString(AbstractC8020f0.error_general));
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: b */
    public final String m75060b(ToolStorageDetailPage.EnumC13333a enumC13333a) {
        String m41044h;
        AbstractC19074t.m100208f(enumC13333a, "accessFlow");
        if (enumC13333a == ToolStorageDetailPage.EnumC13333a.f68485s) {
            return this.f68585p;
        }
        MessageId messageId = this.f68586q;
        if (messageId == null || (m41044h = messageId.m41044h()) == null) {
            return "";
        }
        return m41044h;
    }

    /* renamed from: c */
    public final long m75061c() {
        return this.f68590u;
    }

    /* renamed from: d */
    public final String m75062d() {
        return this.f68587r;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final MessageId m75063e() {
        return this.f68586q;
    }

    /* renamed from: f */
    public final long m75064f() {
        return this.f68588s;
    }

    /* renamed from: g */
    public final boolean m75065g() {
        return this.f68591v;
    }

    /* renamed from: h */
    public final VoiceViewerItem m75066h(C13380a c13380a) {
        String m75081a;
        String m75081a2;
        AbstractC19074t.m100208f(c13380a, "storageItem");
        try {
            this.f68587r = c13380a.m75088j();
            this.f68586q = c13380a.m75090l();
            if (c13380a.m75102x()) {
                C17945a0 m75089k = c13380a.m75089k();
                if (m75089k != null) {
                    this.f68588s = m75089k.m94974P4();
                    C17969i0 m94929K2 = m75089k.m94929K2();
                    AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentVoice");
                    this.f68589t = ((C17964g1) m94929K2).m95534l();
                    C25821b m75082d = c13380a.m75082d();
                    if (m75082d != null) {
                        m75081a2 = m75082d.m133141d();
                        if (m75081a2 == null) {
                        }
                        this.f68585p = m75081a2;
                    }
                    m75081a2 = c13380a.m75081a();
                    this.f68585p = m75081a2;
                }
            } else if (c13380a.m75082d() != null) {
                C25821b m75082d2 = c13380a.m75082d();
                if (m75082d2 != null) {
                    this.f68588s = m75082d2.m133150m();
                    this.f68589t = "";
                    this.f68585p = m75082d2.m133141d();
                    this.f68591v = true;
                }
            } else if (c13380a.m75089k() != null) {
                C17945a0 m75089k2 = c13380a.m75089k();
                this.f68588s = m75089k2.m94974P4();
                C17969i0 m94929K22 = m75089k2.m94929K2();
                AbstractC19074t.m100206d(m94929K22, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentVoice");
                this.f68589t = ((C17964g1) m94929K22).m95534l();
                C25821b m75082d3 = c13380a.m75082d();
                if (m75082d3 == null || (m75081a = m75082d3.m133141d()) == null) {
                    m75081a = c13380a.m75081a();
                }
                this.f68585p = m75081a;
            }
            this.f68590u = c13380a.m75087i();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return this;
    }

    /* renamed from: i */
    public final void m75067i() {
        C23288a.f113033a.mo13474a(new C18426a(new Runnable() { // from class: wa0.m0
            @Override // java.lang.Runnable
            public final void run() {
                VoiceViewerItem.m75059j(VoiceViewerItem.this);
            }
        }));
    }

    /* renamed from: k */
    public final void m75068k(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f68587r = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "parcel");
        parcel.writeString(this.f68585p);
        parcel.writeParcelable(this.f68586q, i11);
        parcel.writeString(this.f68587r);
        parcel.writeLong(this.f68588s);
        parcel.writeString(this.f68589t);
        parcel.writeLong(this.f68590u);
    }

    public /* synthetic */ VoiceViewerItem(String str, MessageId messageId, String str2, long j11, String str3, long j12, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : messageId, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? 0L : j11, (i11 & 16) == 0 ? str3 : "", (i11 & 32) != 0 ? 0L : j12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VoiceViewerItem(Parcel parcel) {
        this(r2, r3, r4, r5, r7, parcel.readLong());
        AbstractC19074t.m100208f(parcel, "parcel");
        String readString = parcel.readString();
        AbstractC19074t.m100205c(readString);
        MessageId messageId = (MessageId) parcel.readParcelable(MessageId.class.getClassLoader());
        String readString2 = parcel.readString();
        AbstractC19074t.m100205c(readString2);
        long readLong = parcel.readLong();
        String readString3 = parcel.readString();
        AbstractC19074t.m100205c(readString3);
    }
}

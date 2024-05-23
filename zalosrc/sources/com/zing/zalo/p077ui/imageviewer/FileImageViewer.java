package com.zing.zalo.p077ui.imageviewer;

import ac.InterfaceC0733x;
import ag0.AbstractC0837p0;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import b40.C2526d;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.imageviewer.C12063c;
import com.zing.zalo.p077ui.imageviewer.FileImageViewer;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.utils.ToastUtils;
import dj.C17945a0;
import dj.C17990p0;
import gw.AbstractC19646n0;
import hu.AbstractC20130d;
import in.C20629c;
import in.InterfaceC20633g;
import java.io.File;
import me0.AbstractC23041d2;
import me0.AbstractC23161o1;
import p698yz.AbstractC31125u;
import p716zh.AbstractC32201z4;

/* loaded from: classes5.dex */
public class FileImageViewer extends BaseChatImageViewer implements InterfaceC0733x {

    /* renamed from: j3 */
    View f62860j3;

    /* renamed from: k3 */
    RobotoTextView f62861k3;

    /* renamed from: l3 */
    RobotoTextView f62862l3;

    /* renamed from: m3 */
    C17945a0 f62863m3;

    /* renamed from: n3 */
    C17990p0 f62864n3;

    /* renamed from: o3 */
    String f62865o3;

    /* renamed from: p3 */
    String f62866p3;

    /* renamed from: q3 */
    boolean f62867q3;

    /* renamed from: r3 */
    int f62868r3;

    /* renamed from: com.zing.zalo.ui.imageviewer.FileImageViewer$a */
    /* loaded from: classes5.dex */
    class C12044a implements InterfaceC20633g {

        /* renamed from: a */
        final /* synthetic */ RecyclingImageView f62869a;

        /* renamed from: b */
        final /* synthetic */ C12063c.f f62870b;

        /* renamed from: c */
        final /* synthetic */ int f62871c;

        /* renamed from: d */
        final /* synthetic */ C12063c.d.a f62872d;

        C12044a(RecyclingImageView recyclingImageView, C12063c.f fVar, int i11, C12063c.d.a aVar) {
            this.f62869a = recyclingImageView;
            this.f62870b = fVar;
            this.f62871c = i11;
            this.f62872d = aVar;
        }

        @Override // in.InterfaceC20633g
        /* renamed from: a */
        public void mo62757a(String str, long j11) {
            ItemAlbumMobile itemAlbumMobile;
            if (!FileImageViewer.this.mo60294yp()) {
                FileImageViewer fileImageViewer = FileImageViewer.this;
                if (fileImageViewer.f62863m3 != null && str != null && (itemAlbumMobile = fileImageViewer.f62686n1) != null && str.equals(itemAlbumMobile.f42544A)) {
                    FileImageViewer fileImageViewer2 = FileImageViewer.this;
                    if (fileImageViewer2.f62868r3 != j11) {
                        fileImageViewer2.f62868r3 = (int) j11;
                        fileImageViewer2.m67198AQ();
                    }
                }
            }
        }

        @Override // in.InterfaceC20633g
        /* renamed from: b */
        public void mo62758b(String str, int i11) {
            int i12;
            if (!FileImageViewer.this.mo60294yp()) {
                FileImageViewer fileImageViewer = FileImageViewer.this;
                if (fileImageViewer.f62863m3 != null) {
                    fileImageViewer.m67198AQ();
                    if (i11 == 5) {
                        i12 = 4;
                    } else if (i11 == 7) {
                        i12 = 404;
                    } else {
                        i12 = 6;
                    }
                    this.f62872d.mo67298a(this.f62870b, this.f62871c, null, i12);
                }
            }
        }

        @Override // in.InterfaceC20633g
        /* renamed from: c */
        public void mo62759c(String str, String str2, boolean z11) {
            if (!FileImageViewer.this.mo60294yp()) {
                FileImageViewer fileImageViewer = FileImageViewer.this;
                if (fileImageViewer.f62863m3 != null) {
                    fileImageViewer.m67198AQ();
                    FileImageViewer.super.mo66826Ot(this.f62869a, this.f62870b, this.f62871c, this.f62872d);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.imageviewer.FileImageViewer$b */
    /* loaded from: classes5.dex */
    public class C12045b implements InterfaceC20633g {

        /* renamed from: a */
        final /* synthetic */ InterfaceC20633g f62874a;

        C12045b(InterfaceC20633g interfaceC20633g) {
            this.f62874a = interfaceC20633g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static /* synthetic */ void m67204g(InterfaceC20633g interfaceC20633g, String str, String str2, boolean z11) {
            try {
                interfaceC20633g.mo62759c(str, str2, z11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static /* synthetic */ void m67205h(InterfaceC20633g interfaceC20633g, String str, int i11) {
            try {
                interfaceC20633g.mo62758b(str, i11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public static /* synthetic */ void m67206i(InterfaceC20633g interfaceC20633g, String str, long j11) {
            try {
                interfaceC20633g.mo62757a(str, j11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // in.InterfaceC20633g
        /* renamed from: a */
        public void mo62757a(final String str, final long j11) {
            final InterfaceC20633g interfaceC20633g = this.f62874a;
            if (interfaceC20633g != null) {
                FileImageViewer.this.f62656T1.post(new Runnable() { // from class: com.zing.zalo.ui.imageviewer.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        FileImageViewer.C12045b.m67206i(InterfaceC20633g.this, str, j11);
                    }
                });
            }
        }

        @Override // in.InterfaceC20633g
        /* renamed from: b */
        public void mo62758b(final String str, final int i11) {
            final InterfaceC20633g interfaceC20633g = this.f62874a;
            if (interfaceC20633g != null) {
                FileImageViewer.this.f62656T1.post(new Runnable() { // from class: com.zing.zalo.ui.imageviewer.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        FileImageViewer.C12045b.m67205h(InterfaceC20633g.this, str, i11);
                    }
                });
            }
        }

        @Override // in.InterfaceC20633g
        /* renamed from: c */
        public void mo62759c(final String str, final String str2, final boolean z11) {
            C17945a0 m102950Z;
            try {
                C17945a0 c17945a0 = FileImageViewer.this.f62863m3;
                if (c17945a0 != null && (m102950Z = AbstractC19646n0.m102950Z(c17945a0.mo95039W2(), FileImageViewer.this.f62863m3.m95029V3())) != null && !m102950Z.m95219o8() && !m102950Z.m95091b6()) {
                    m102950Z.m95147gc(str2, true, false);
                    final InterfaceC20633g interfaceC20633g = this.f62874a;
                    if (interfaceC20633g != null) {
                        FileImageViewer.this.f62656T1.post(new Runnable() { // from class: com.zing.zalo.ui.imageviewer.y
                            @Override // java.lang.Runnable
                            public final void run() {
                                FileImageViewer.C12045b.m67204g(InterfaceC20633g.this, str, str2, z11);
                            }
                        });
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yQ */
    public static /* synthetic */ void m67196yQ(ItemAlbumMobile itemAlbumMobile, String str) {
        C17945a0 c17945a0;
        String str2;
        try {
            if (itemAlbumMobile.m40496C() != null) {
                c17945a0 = AbstractC19646n0.m102950Z(itemAlbumMobile.f42579d0, itemAlbumMobile.m40496C());
            } else {
                c17945a0 = null;
            }
            C17945a0 c17945a02 = c17945a0;
            if (c17945a02 != null) {
                String m95283w2 = c17945a02.m95283w2(false, false);
                if (!TextUtils.isEmpty(m95283w2)) {
                    if (c17945a02.m94893G1(m95283w2)) {
                        str2 = m95283w2;
                        c17945a02.m95056X9(str2, AbstractC23041d2.m118212k(m95283w2), true, true, new SensitiveData("gallery_save_photo_detail", "photo_download"));
                        return;
                    }
                    m95283w2 = AbstractC32201z4.m155241b(c17945a02.m95029V3().m41045i(), m95283w2);
                }
                str2 = str;
                c17945a02.m95056X9(str2, AbstractC23041d2.m118212k(m95283w2), true, true, new SensitiveData("gallery_save_photo_detail", "photo_download"));
                return;
            }
            ToastUtils.showMess(AbstractC23161o1.m119318c(1001, ""));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zQ */
    public /* synthetic */ void m67197zQ() {
        C20629c m107448k = C20629c.m107448k();
        String str = this.f62686n1.f42544A;
        m107448k.m107452f(str, str);
    }

    /* renamed from: AQ */
    void m67198AQ() {
        String str;
        int i11;
        String str2 = "";
        this.f62866p3 = "";
        long j11 = this.f62864n3.f91113B;
        if (j11 < 0) {
            str = "";
        } else {
            str = AbstractC23041d2.m118226y(j11);
        }
        if (!TextUtils.isEmpty(this.f62864n3.f91115D)) {
            str2 = this.f62864n3.f91115D.toUpperCase();
        }
        if (!TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(this.f62866p3)) {
                this.f62866p3 += " • ";
            }
            this.f62866p3 += str2;
        }
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(this.f62866p3)) {
                this.f62866p3 += " • ";
            }
            this.f62866p3 += str;
        }
        C12063c.f m66845YM = m66845YM();
        if (m66845YM != null && (i11 = m66845YM.f62952c) == 2 && mo66884tN(m66845YM.f62951b, i11) && this.f62868r3 > 0) {
            if (!TextUtils.isEmpty(this.f62866p3)) {
                this.f62866p3 += " • ";
            }
            this.f62866p3 += this.f62868r3 + "%";
        }
        this.f62862l3.setText(this.f62866p3);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: BO */
    public void mo66695BO() {
        int lastIndexOf;
        super.mo66695BO();
        try {
            this.f62865o3 = "";
            this.f62866p3 = "";
            this.f62867q3 = false;
            this.f62868r3 = 0;
            C17945a0 c17945a0 = null;
            this.f62863m3 = null;
            this.f62864n3 = null;
            ItemAlbumMobile itemAlbumMobile = this.f62686n1;
            if (itemAlbumMobile != null && itemAlbumMobile.m40496C() != null) {
                ItemAlbumMobile itemAlbumMobile2 = this.f62686n1;
                c17945a0 = AbstractC19646n0.m102950Z(itemAlbumMobile2.f42579d0, itemAlbumMobile2.m40496C());
            }
            if (c17945a0 != null && !c17945a0.m95219o8() && (c17945a0.m94929K2() instanceof C17990p0)) {
                this.f62863m3 = c17945a0;
                C17990p0 c17990p0 = (C17990p0) c17945a0.m94929K2();
                this.f62864n3 = c17990p0;
                String str = c17990p0.f91011p;
                this.f62865o3 = str;
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f62864n3.f91115D) && (lastIndexOf = this.f62865o3.lastIndexOf(this.f62864n3.f91115D)) > 0 && this.f62864n3.f91115D.length() + lastIndexOf == this.f62865o3.length()) {
                    this.f62865o3 = this.f62865o3.substring(0, lastIndexOf - 1);
                }
                this.f62861k3.setText(this.f62865o3);
                m67198AQ();
                return;
            }
            ToastUtils.showMess(AbstractC23161o1.m119318c(1001, ""));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: CM */
    public void mo66812CM() {
        if (this.f62693u1) {
            m66891yM(AbstractC6918a0.menu_photo_download, AbstractC16803z.icn_header_download_white);
        }
        if (this.f62693u1) {
            m66893zM(AbstractC6918a0.menu_photo_download, AbstractC8020f0.str_menu_photo_download);
        }
        if (this.f62694v1) {
            m66893zM(AbstractC6918a0.menu_share, AbstractC8020f0.share);
        }
        if (this.f62586n2 != 0) {
            m66893zM(AbstractC6918a0.menu_shared_media, AbstractC8020f0.menu_stored_media);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        if (this.f62686n1 != null) {
            AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: j70.h2
                @Override // java.lang.Runnable
                public final void run() {
                    FileImageViewer.this.m67197zQ();
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: KM */
    public C12063c mo66822KM() {
        return super.mo66822KM();
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: NM */
    public void mo66701NM(final ItemAlbumMobile itemAlbumMobile, String str, int i11, final String str2) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: j70.g2
            @Override // java.lang.Runnable
            public final void run() {
                FileImageViewer.m67196yQ(ItemAlbumMobile.this, str2);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.imageviewer.C12063c.d
    /* renamed from: Ot */
    public void mo66826Ot(RecyclingImageView recyclingImageView, C12063c.f fVar, int i11, C12063c.d.a aVar) {
        try {
            int i12 = fVar.f62952c;
            if (i12 == 2) {
                if (this.f62863m3 != null) {
                    File mo66832Rd = mo66832Rd(fVar.f62951b, i12);
                    if (mo66832Rd != null && mo66832Rd.exists()) {
                        super.mo66826Ot(recyclingImageView, fVar, i11, aVar);
                    }
                    m67199wQ(fVar.f62951b, new C12044a(recyclingImageView, fVar, i11, aVar));
                } else {
                    aVar.mo67298a(fVar, i11, null, 1);
                }
            } else {
                super.mo66826Ot(recyclingImageView, fVar, i11, aVar);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        try {
            if (i11 == AbstractC6918a0.menu_photo_download) {
                mo66702OM();
                ItemAlbumMobile itemAlbumMobile = this.f62686n1;
                if (itemAlbumMobile != null && itemAlbumMobile.m40496C() != null) {
                    ItemAlbumMobile itemAlbumMobile2 = this.f62686n1;
                    C2526d.f10270a.m12689M(AbstractC19646n0.m102950Z(itemAlbumMobile2.f42579d0, itemAlbumMobile2.m40496C()), -1, "csc_msg_photo_full", this.f62655T0);
                }
                return true;
            }
            if (i11 == AbstractC6918a0.menu_share) {
                mo66737rP(7, 7, false, "");
                return true;
            }
            if (i11 == AbstractC6918a0.menu_shared_media) {
                m66715gQ("");
                return true;
            }
            return super.mo37491QJ(i11);
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: RN */
    public void m66762EN(int i11) {
        if (i11 == 404) {
            C17945a0 m102950Z = AbstractC19646n0.m102950Z(this.f62863m3.mo95039W2(), this.f62863m3.m95029V3());
            if (m102950Z != null && m102950Z.m95302y1(i11)) {
                ToastUtils.showMess(AbstractC31125u.m151165W(this.f62665Y0, m102950Z));
                return;
            }
            return;
        }
        super.m66762EN(i11);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.imageviewer.C12063c.d
    /* renamed from: Rd */
    public File mo66832Rd(String str, int i11) {
        if (i11 == 2 && this.f62863m3 != null) {
            if (TextUtils.isEmpty(str) || !str.startsWith("/")) {
                str = m67200xQ(this.f62863m3);
            }
            if (this.f62863m3.m94893G1(str)) {
                return new File(str);
            }
            return null;
        }
        return super.mo66832Rd(str, i11);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: dN */
    public int mo50253dN() {
        return AbstractC7409c0.layout_image_viewer_file;
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "FileImageViewer";
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer
    /* renamed from: iQ */
    public void mo66718iQ(String str, int i11, MessageId messageId, boolean z11) {
        super.mo66718iQ(str, i11, messageId, z11);
        if (!TextUtils.isEmpty(str) && str.equals(this.f62696x1) && z11) {
            this.f62691s1 = true;
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: nN */
    public void mo66727nN(Bundle bundle) {
        super.mo66727nN(bundle);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer, android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            if (view.getId() == AbstractC6918a0.btn_share) {
                if (!m66815DM()) {
                    return;
                }
                mo66737rP(7, 7, false, "");
                return;
            }
            super.onClick(view);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: qN */
    public void mo66733qN(View view) {
        super.mo66733qN(view);
        this.f62861k3 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_file_name);
        this.f62862l3 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_file_desc);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer, com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: sO */
    public void mo66738sO() {
        super.mo66738sO();
        m66877pO(this.f62860j3, 0);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer
    /* renamed from: tN */
    public boolean mo66884tN(String str, int i11) {
        if (i11 == 2) {
            return C20629c.m107448k().m107454n(str, str);
        }
        return super.mo66884tN(str, i11);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer
    /* renamed from: tP */
    public int mo66739tP() {
        return 4;
    }

    /* renamed from: wQ */
    void m67199wQ(String str, InterfaceC20633g interfaceC20633g) {
        C17945a0 c17945a0;
        String str2;
        try {
            if (!TextUtils.isEmpty(str) && (c17945a0 = this.f62863m3) != null) {
                String m67200xQ = m67200xQ(c17945a0);
                if (this.f62863m3.m94929K2() instanceof C17990p0) {
                    str2 = ((C17990p0) this.f62863m3.m94929K2()).f91114C;
                } else {
                    str2 = "";
                }
                C20629c.m107448k().m107457q(this.f62863m3.m95029V3(), str, m67200xQ, str, new C12045b(interfaceC20633g), true, str2);
                return;
            }
            if (interfaceC20633g != null) {
                interfaceC20633g.mo62758b(str, 3);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseChatImageViewer
    /* renamed from: xP */
    public boolean mo66744xP(int i11) {
        if (!super.mo66744xP(i11) && i11 != 22) {
            return false;
        }
        return true;
    }

    /* renamed from: xQ */
    public String m67200xQ(C17945a0 c17945a0) {
        return AbstractC20130d.m104905y() + AbstractC19646n0.m102974f0(c17945a0, true);
    }

    @Override // com.zing.zalo.p077ui.imageviewer.BaseImageViewer, com.zing.zalo.p077ui.imageviewer.C12063c.a
    /* renamed from: yr */
    public boolean mo66892yr() {
        C17945a0 c17945a0 = this.f62863m3;
        if (c17945a0 != null && c17945a0.m94893G1(c17945a0.m94983Q3())) {
            return true;
        }
        return false;
    }
}

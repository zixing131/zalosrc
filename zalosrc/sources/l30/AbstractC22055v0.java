package l30;

import ag0.C0824j;
import am.AbstractC0939u;
import android.R;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.Layout;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import au.C2370r0;
import cd0.C3426e;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.C3980m;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.data.mediapicker.model.VideoItem;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.imageviewer.BaseImageViewer;
import com.zing.zalo.p077ui.zviews.StoryDetailsView;
import com.zing.zalo.story.component.StoryBarBtnAdd;
import com.zing.zalo.uicontrol.C16649s0;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import ho0.AbstractC20110a;
import i40.AbstractC20279i;
import id0.C20518d;
import is.AbstractC20833z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kd0.C21693c;
import l30.C22033k0;
import me0.AbstractC23006a0;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23170p;
import me0.AbstractC23217t2;
import me0.AbstractC23268y2;
import me0.C23081g9;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONObject;
import p266jg.AbstractC21244b;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p458qr.C25482o;
import p461qu.AbstractC25495a;
import p542ub.InterfaceC27218a;
import p604wb.C28905e;
import p716zh.C31903ea;
import p716zh.C31980jc;
import p716zh.C32123ta;
import p716zh.C32207za;
import th.AbstractC26683d;
import vg.C28023b6;
import vg.C28050e3;
import vg.C28212v6;

/* renamed from: l30.v0 */
/* loaded from: classes5.dex */
public abstract class AbstractC22055v0 {

    /* renamed from: a */
    private static final SparseArray f108616a = new SparseArray();

    /* renamed from: b */
    public static boolean f108617b = false;

    /* renamed from: c */
    private static int[] f108618c;

    /* renamed from: d */
    private static int[] f108619d;

    /* renamed from: e */
    private static int[] f108620e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l30.v0$a */
    /* loaded from: classes5.dex */
    public class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f108621a;

        a(String str) {
            this.f108621a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                AbstractC23217t2.m119651c(this.f108621a);
                C7960e.m41971c6().m42290V3(this.f108621a, null);
                AbstractC20833z.m108894I();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: l30.v0$b */
    /* loaded from: classes5.dex */
    public class b extends StoryDetailsView.AbstractC15101b0 {

        /* renamed from: a */
        boolean f108622a = true;

        /* renamed from: b */
        final /* synthetic */ C22033k0.h f108623b;

        /* renamed from: c */
        final /* synthetic */ j f108624c;

        /* renamed from: d */
        final /* synthetic */ StoryDetailsView f108625d;

        b(C22033k0.h hVar, j jVar, StoryDetailsView storyDetailsView) {
            this.f108623b = hVar;
            this.f108624c = jVar;
            this.f108625d = storyDetailsView;
        }

        @Override // com.zing.zalo.p077ui.zviews.StoryDetailsView.AbstractC15101b0
        /* renamed from: a */
        public AbstractC20279i.a mo17180a(C31980jc c31980jc) {
            j jVar;
            if (this.f108622a && (jVar = this.f108624c) != null && jVar.getThumbView() != null) {
                AbstractC20279i.a m105893a = AbstractC20279i.m105893a(this.f108624c.getThumbView());
                if (m105893a != null) {
                    m105893a.f100235n = this.f108624c.getThumbRoundCorner();
                }
                return m105893a;
            }
            return null;
        }

        @Override // com.zing.zalo.p077ui.zviews.StoryDetailsView.AbstractC15101b0
        /* renamed from: b */
        public void mo17181b(boolean z11) {
            View view;
            C31980jc m84683NN;
            AbstractC20279i.a mo17180a = mo17180a(null);
            if (mo17180a != null && (view = mo17180a.f100222a) != null) {
                view.setVisibility(0);
                if (!z11 && (m84683NN = this.f108625d.m84683NN()) != null && m84683NN.m153825r() != null) {
                    View view2 = mo17180a.f100222a;
                    if (view2 instanceof RecyclingImageView) {
                        AbstractC22055v0.m115145e((RecyclingImageView) view2, m84683NN.m153825r().f148146l);
                    }
                }
            }
        }

        @Override // com.zing.zalo.p077ui.zviews.StoryDetailsView.AbstractC15101b0
        /* renamed from: c */
        public void mo17182c(boolean z11) {
            View view;
            AbstractC20279i.a mo17180a = mo17180a(null);
            if (mo17180a != null && (view = mo17180a.f100222a) != null) {
                view.setVisibility(4);
            }
        }

        @Override // com.zing.zalo.p077ui.zviews.StoryDetailsView.AbstractC15101b0
        /* renamed from: e */
        public void mo17197e(C31980jc c31980jc) {
            boolean z11;
            if (c31980jc != null && this.f108623b.mo17216b().equals(c31980jc.f147023p)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f108622a = z11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l30.v0$c */
    /* loaded from: classes5.dex */
    public class c extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ RecyclingImageView f108626l1;

        /* renamed from: m1 */
        final /* synthetic */ RecyclingImageView f108627m1;

        c(RecyclingImageView recyclingImageView, RecyclingImageView recyclingImageView2) {
            this.f108626l1 = recyclingImageView;
            this.f108627m1 = recyclingImageView2;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            if (c3979l != null && c3979l.m18849m()) {
                this.f108626l1.setVisibility(8);
                return;
            }
            this.f108626l1.setVisibility(0);
            if (this.f108627m1 != null) {
                if (AbstractC22055v0.m115154n() == 1) {
                    this.f108627m1.setImageResource(AbstractC16803z.story_newstory_bg);
                } else if (AbstractC22055v0.m115154n() == 0) {
                    this.f108627m1.setImageResource(AbstractC16803z.icon_story_newstory_bg);
                } else if (AbstractC22055v0.m115154n() == 2) {
                    this.f108627m1.setImageResource(AbstractC16803z.story_newstory_bg_profile);
                }
            }
        }
    }

    /* renamed from: l30.v0$d */
    /* loaded from: classes5.dex */
    public class d implements C22033k0.i {

        /* renamed from: a */
        final /* synthetic */ g f108628a;

        /* renamed from: b */
        final /* synthetic */ ZaloView f108629b;

        /* renamed from: c */
        final /* synthetic */ int f108630c;

        /* renamed from: d */
        final /* synthetic */ C3426e f108631d;

        /* renamed from: e */
        final /* synthetic */ int f108632e;

        d(g gVar, ZaloView zaloView, int i11, C3426e c3426e, int i12) {
            this.f108628a = gVar;
            this.f108629b = zaloView;
            this.f108630c = i11;
            this.f108631d = c3426e;
            this.f108632e = i12;
        }

        @Override // l30.C22033k0.i
        /* renamed from: O */
        public void mo45897O() {
            g gVar = this.f108628a;
            if (gVar != null) {
                gVar.mo46561O();
            }
        }

        @Override // l30.C22033k0.i
        /* renamed from: a */
        public void mo45898a(String str, C22033k0.g gVar) {
            g gVar2 = this.f108628a;
            if (gVar2 != null) {
                gVar2.mo46562a(str, gVar);
            }
        }

        @Override // l30.C22033k0.i
        /* renamed from: b */
        public void mo45899b(Bundle bundle, C22033k0.h hVar) {
            C17487o0 c17487o0;
            int i11;
            int i12;
            if (!this.f108629b.m92672lJ()) {
                return;
            }
            if (this.f108629b.m92676n2() != null) {
                c17487o0 = this.f108629b.m92676n2().mo35579p();
            } else {
                c17487o0 = null;
            }
            C17487o0 c17487o02 = c17487o0;
            if (c17487o02 != null) {
                if (this.f108629b.m92676n2().mo35585v() != null && this.f108629b.m92676n2().mo35585v().getId() != 0) {
                    i11 = this.f108629b.m92676n2().mo35585v().getId();
                } else {
                    i11 = R.id.content;
                }
                if (this.f108629b.m92676n2() != null && this.f108629b.m92676n2().mo35576n3()) {
                    i11 = AbstractC6918a0.chat_head_full_container;
                }
                int i13 = i11;
                if (bundle != null) {
                    bundle.putInt("srcType", this.f108630c);
                    if (this.f108631d == null) {
                        bundle.putBoolean("EXTRA_FLAG_VIEW_SELECTED_USER_STORY_ONLY", true);
                    }
                }
                ZaloView zaloView = this.f108629b;
                if ((zaloView instanceof BaseImageViewer) && zaloView.m92676n2().mo35576n3()) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                StoryDetailsView storyDetailsView = (StoryDetailsView) c17487o02.mo57057c2(i13, StoryDetailsView.class, bundle, this.f108632e, null, i12 ^ 1, true);
                C3426e c3426e = this.f108631d;
                if (c3426e != null) {
                    storyDetailsView.m84675EP(c3426e);
                }
            }
        }
    }

    /* renamed from: l30.v0$e */
    /* loaded from: classes5.dex */
    public class e implements C22033k0.i {

        /* renamed from: a */
        final /* synthetic */ g f108633a;

        /* renamed from: b */
        final /* synthetic */ ZaloView f108634b;

        /* renamed from: c */
        final /* synthetic */ int f108635c;

        /* renamed from: d */
        final /* synthetic */ C3426e f108636d;

        /* renamed from: e */
        final /* synthetic */ int f108637e;

        /* renamed from: f */
        final /* synthetic */ float f108638f;

        /* renamed from: g */
        final /* synthetic */ float f108639g;

        e(g gVar, ZaloView zaloView, int i11, C3426e c3426e, int i12, float f11, float f12) {
            this.f108633a = gVar;
            this.f108634b = zaloView;
            this.f108635c = i11;
            this.f108636d = c3426e;
            this.f108637e = i12;
            this.f108638f = f11;
            this.f108639g = f12;
        }

        @Override // l30.C22033k0.i
        /* renamed from: O */
        public void mo45897O() {
            g gVar = this.f108633a;
            if (gVar != null) {
                gVar.mo46561O();
            }
        }

        @Override // l30.C22033k0.i
        /* renamed from: a */
        public void mo45898a(String str, C22033k0.g gVar) {
            g gVar2 = this.f108633a;
            if (gVar2 != null) {
                gVar2.mo46562a(str, gVar);
            }
        }

        @Override // l30.C22033k0.i
        /* renamed from: b */
        public void mo45899b(Bundle bundle, C22033k0.h hVar) {
            C17487o0 c17487o0;
            int i11;
            int i12;
            if (!this.f108634b.m92672lJ()) {
                return;
            }
            if (this.f108634b.m92676n2() != null) {
                c17487o0 = this.f108634b.m92676n2().mo35579p();
            } else {
                c17487o0 = null;
            }
            C17487o0 c17487o02 = c17487o0;
            if (c17487o02 != null) {
                if (this.f108634b.m92676n2().mo35585v() != null && this.f108634b.m92676n2().mo35585v().getId() != 0) {
                    i11 = this.f108634b.m92676n2().mo35585v().getId();
                } else {
                    i11 = R.id.content;
                }
                if (this.f108634b.m92676n2() != null && this.f108634b.m92676n2().mo35576n3()) {
                    i11 = AbstractC6918a0.chat_head_full_container;
                }
                int i13 = i11;
                if (bundle != null) {
                    bundle.putInt("srcType", this.f108635c);
                    if (this.f108636d == null) {
                        bundle.putBoolean("EXTRA_FLAG_VIEW_SELECTED_USER_STORY_ONLY", true);
                    }
                }
                ZaloView zaloView = this.f108634b;
                if ((zaloView instanceof BaseImageViewer) && zaloView.m92676n2().mo35576n3()) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                StoryDetailsView storyDetailsView = (StoryDetailsView) c17487o02.mo57057c2(i13, StoryDetailsView.class, bundle, this.f108637e, null, i12 ^ 1, true);
                C3426e c3426e = this.f108636d;
                if (c3426e != null) {
                    storyDetailsView.m84675EP(c3426e);
                    return;
                }
                float f11 = this.f108638f;
                if (f11 >= 0.0f) {
                    float f12 = this.f108639g;
                    if (f12 >= 0.0f) {
                        storyDetailsView.m84674DP(f11, f12);
                    }
                }
            }
        }
    }

    /* renamed from: l30.v0$f */
    /* loaded from: classes5.dex */
    public class f extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C32123ta f108640a;

        f(C32123ta c32123ta) {
            this.f108640a = c32123ta;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e m41971c6 = C7960e.m41971c6();
            String str = CoreUtility.f89233i;
            C32123ta c32123ta = this.f108640a;
            String str2 = c32123ta.f148138h;
            String jSONObject = c32123ta.m155082i0().toString();
            C32123ta c32123ta2 = this.f108640a;
            m41971c6.m42074B8(str, str2, jSONObject, c32123ta2.f148128c, c32123ta2.f148157w);
        }
    }

    /* renamed from: l30.v0$g */
    /* loaded from: classes5.dex */
    public interface g {
        /* renamed from: O */
        void mo46561O();

        /* renamed from: a */
        void mo46562a(String str, C22033k0.g gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l30.v0$h */
    /* loaded from: classes5.dex */
    public static class h implements Comparator {

        /* renamed from: p */
        boolean f108641p;

        public h(boolean z11) {
            this.f108641p = z11;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C32123ta c32123ta, C32123ta c32123ta2) {
            long j11;
            long j12 = 0;
            if (c32123ta != null) {
                j11 = c32123ta.f148150p;
            } else {
                j11 = 0;
            }
            if (c32123ta2 != null) {
                j12 = c32123ta2.f148150p;
            }
            if (j11 > j12) {
                if (!this.f108641p) {
                    return -1;
                }
                return 1;
            }
            if (j11 < j12) {
                if (this.f108641p) {
                    return -1;
                }
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: l30.v0$i */
    /* loaded from: classes5.dex */
    public interface i extends j {
        /* renamed from: n */
        void mo17225n(C32123ta c32123ta, C23528a c23528a);
    }

    /* renamed from: l30.v0$j */
    /* loaded from: classes5.dex */
    public interface j {
        int getPopulatePosition();

        C16719g getThumbModule();

        int getThumbRoundCorner();

        View getThumbView();
    }

    /* renamed from: l30.v0$k */
    /* loaded from: classes5.dex */
    public static class k {

        /* renamed from: a */
        public int f108642a;

        /* renamed from: b */
        public int f108643b;

        /* renamed from: c */
        public int f108644c;

        /* renamed from: d */
        public int f108645d;

        /* renamed from: e */
        public boolean f108646e = false;

        /* renamed from: f */
        public int f108647f;
    }

    /* renamed from: l30.v0$l */
    /* loaded from: classes5.dex */
    public static abstract class l {
        /* renamed from: a */
        public void mo48298a(j jVar) {
        }

        /* renamed from: b */
        public void mo82050b(C32123ta c32123ta, C22033k0.h hVar, i iVar) {
        }

        /* renamed from: c */
        public abstract void mo47172c(C31980jc c31980jc, n nVar, int i11);
    }

    /* renamed from: l30.v0$m */
    /* loaded from: classes5.dex */
    public static class m implements C32207za.c {
        @Override // p716zh.C32207za.c
        /* renamed from: a */
        public void mo115168a(long j11) {
            AbstractC23309i.m121915fq(j11);
        }

        @Override // p716zh.C32207za.c
        /* renamed from: b */
        public long mo115169b() {
            return AbstractC23309i.m121001H5();
        }

        @Override // p716zh.C32207za.c
        /* renamed from: c */
        public long mo115170c() {
            return AbstractC23309i.m121038I5();
        }

        /* renamed from: d */
        public void m115171d(long j11) {
            AbstractC23309i.m121877eq(j11);
        }
    }

    /* renamed from: l30.v0$n */
    /* loaded from: classes5.dex */
    public interface n extends j {
        /* renamed from: p */
        void mo17230p(C31980jc c31980jc, C23528a c23528a);
    }

    /* renamed from: A */
    public static boolean m115111A(C20096c c20096c) {
        if (c20096c != null && c20096c.m104491c() == 18028) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public static boolean m115112B(String str) {
        C31980jc m115161u;
        if (TextUtils.isEmpty(str) || (m115161u = m115161u(str)) == null || !m115161u.f147033z) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public static boolean m115113C(C31980jc c31980jc) {
        return c31980jc != null;
    }

    /* renamed from: D */
    public static boolean m115114D(String str, boolean z11) {
        if (!TextUtils.equals(str, CoreUtility.f89233i) && m115118H(str) && (!z11 || AbstractC26683d.f126396o)) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public static boolean m115115E(String str, boolean z11) {
        if (!TextUtils.equals(str, CoreUtility.f89233i) && m115119I(str) && (!z11 || AbstractC26683d.f126396o)) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public static boolean m115116F(String str, boolean z11) {
        if (!TextUtils.equals(str, CoreUtility.f89233i) && m115118H(str) && (!z11 || AbstractC26683d.f126396o)) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public static boolean m115117G() {
        PowerManager powerManager = (PowerManager) MainApplication.getAppContext().getSystemService("power");
        if (powerManager != null) {
            return powerManager.isPowerSaveMode();
        }
        return false;
    }

    /* renamed from: H */
    public static boolean m115118H(String str) {
        if (!C22013a0.m114928g() || m115161u(str) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    public static boolean m115119I(String str) {
        C31980jc m115161u;
        if (!C22013a0.m114928g() || (m115161u = m115161u(str)) == null || m115161u.m153829v()) {
            return false;
        }
        return true;
    }

    /* renamed from: J */
    public static /* synthetic */ void m115120J(C2370r0 c2370r0, String str, C3979l c3979l) {
        if (c3979l != null) {
            try {
                RecyclingImageView recyclingImageView = (RecyclingImageView) c2370r0.m12394a();
                if (recyclingImageView.getTag().equals(str)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c3979l);
                    recyclingImageView.setImageInfo(new C3980m(arrayList), false);
                    TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{C23278z2.m120136k0().f116261b, new BitmapDrawable(MainApplication.getAppContext().getResources(), c3979l.m18839c())});
                    recyclingImageView.setImageDrawable(transitionDrawable);
                    transitionDrawable.startTransition(300);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:            r3.setImageInfo(r5, false);     */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m115121K(C2370r0 c2370r0, String str, C3977j c3977j, C24003n c24003n, C3979l c3979l) {
        if (c3979l != null) {
            try {
                C21693c c21693c = (C21693c) c2370r0.m12394a();
                if (c21693c.m89133b0().equals(str)) {
                    if (c3979l.m18839c() == null || (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1)) {
                        c21693c.mo111925v1(c24003n.f116261b);
                        return;
                    }
                    c21693c.mo111924u1(c3979l.m18839c());
                    c21693c.m89135c1(new C20518d());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: L */
    public static /* synthetic */ void m115122L(C2370r0 c2370r0, String str, C3979l c3979l) {
        if (c3979l != null) {
            try {
                RecyclingImageView recyclingImageView = (RecyclingImageView) c2370r0.m12394a();
                if (recyclingImageView.getTag().equals(str)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c3979l);
                    recyclingImageView.setImageInfo(new C3980m(arrayList), false);
                    TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{C23278z2.m120136k0().f116261b, new BitmapDrawable(MainApplication.getAppContext().getResources(), c3979l.m18839c())});
                    recyclingImageView.setImageDrawable(transitionDrawable);
                    transitionDrawable.startTransition(300);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: M */
    public static void m115123M(C31980jc c31980jc, ZaloView zaloView, int i11, int i12, C3426e c3426e, g gVar) {
        try {
            C25482o.f122075a.m131993N(c31980jc.f147023p, System.currentTimeMillis());
            C22033k0.m115006h().m115018r(c31980jc, i12, new d(gVar, zaloView, i12, c3426e, i11));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: N */
    public static void m115124N(C31980jc c31980jc, ZaloView zaloView, int i11, int i12, C3426e c3426e, g gVar, float f11, float f12) {
        try {
            C25482o.f122075a.m131993N(c31980jc.f147023p, System.currentTimeMillis());
            C22033k0.m115006h().m115018r(c31980jc, i12, new e(gVar, zaloView, i12, c3426e, i11, f11, f12));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: O */
    public static void m115125O(int i11, String str, boolean z11, boolean z12, ZaloView zaloView, int i12, StoryDetailsView.AbstractC15101b0 abstractC15101b0, g gVar) {
        C17487o0 c17487o0;
        int i13;
        try {
            if (!zaloView.m92672lJ()) {
                return;
            }
            if (zaloView.m92676n2() != null) {
                c17487o0 = zaloView.m92676n2().mo35579p();
            } else {
                c17487o0 = null;
            }
            C17487o0 c17487o02 = c17487o0;
            if (c17487o02 != null) {
                if (zaloView.m92676n2().mo35585v() != null && zaloView.m92676n2().mo35585v().getId() != 0) {
                    i13 = zaloView.m92676n2().mo35585v().getId();
                } else {
                    i13 = R.id.content;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("extra_view_mode", 5);
                bundle.putInt("extra_user_story_position", i11);
                bundle.putString("extra_story_id", str);
                bundle.putBoolean("extra_story_archive_has_more_backward", z11);
                bundle.putBoolean("extra_story_archive_has_more_forward", z12);
                bundle.putInt("srcType", 364);
                StoryDetailsView storyDetailsView = (StoryDetailsView) c17487o02.mo57057c2(i13, StoryDetailsView.class, bundle, i12, null, 0, true);
                if (storyDetailsView != null) {
                    storyDetailsView.m84675EP(abstractC15101b0);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: P */
    public static void m115126P(ZaloView zaloView, Point point, SensitiveData sensitiveData, TrackingSource trackingSource) {
        CameraInputParams m39205o = CameraInputParams.m39205o();
        if (point != null) {
            m39205o.m39216y(point);
        }
        if (sensitiveData != null) {
            m39205o.f41138w0 = sensitiveData;
        } else {
            m39205o.f41138w0 = new SensitiveData("timeline_post_story", "social_timeline");
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("TRACKING_SOURCE_POST_STORY_KEY", trackingSource);
        AbstractC22470k.m116168t(zaloView.m92676n2(), 11116, 1, m39205o, bundle);
    }

    /* renamed from: Q */
    public static StoryDetailsView m115127Q(C22033k0.h hVar, j jVar, InterfaceC27218a interfaceC27218a, Bundle bundle, int i11) {
        return m115128R(hVar, jVar, interfaceC27218a, bundle, i11, null);
    }

    /* renamed from: R */
    public static StoryDetailsView m115128R(C22033k0.h hVar, j jVar, InterfaceC27218a interfaceC27218a, Bundle bundle, int i11, StoryDetailsView.AbstractC15101b0 abstractC15101b0) {
        C17487o0 mo35579p;
        int i12;
        int i13;
        StoryDetailsView storyDetailsView = null;
        if (hVar != null && interfaceC27218a != null && (mo35579p = interfaceC27218a.mo35579p()) != null) {
            if (interfaceC27218a.mo35585v() != null && interfaceC27218a.mo35585v().getId() != 0) {
                i12 = interfaceC27218a.mo35585v().getId();
            } else {
                i12 = R.id.content;
            }
            if (interfaceC27218a.mo35576n3()) {
                i13 = AbstractC6918a0.chat_head_full_container;
            } else {
                i13 = i12;
            }
            storyDetailsView = (StoryDetailsView) mo35579p.mo57057c2(i13, StoryDetailsView.class, bundle, i11, null, 1, true);
            if (abstractC15101b0 != null) {
                storyDetailsView.m84675EP(abstractC15101b0);
            } else {
                storyDetailsView.m84675EP(new b(hVar, jVar, storyDetailsView));
            }
        }
        return storyDetailsView;
    }

    /* renamed from: S */
    public static void m115129S(C28212v6 c28212v6, boolean z11, C23528a c23528a, RecyclingImageView recyclingImageView, RecyclingImageView recyclingImageView2) {
        String str;
        if (c28212v6 != null && c28212v6.m142167f()) {
            str = c28212v6.f131585k;
        } else if (z11 && C22013a0.m114924c().f108394j != null) {
            str = C22013a0.m114924c().f108394j.f108400a;
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            ((C23528a) c23528a.m123612r(recyclingImageView)).m123579C(str, C23278z2.m120093R0(), new c(recyclingImageView2, recyclingImageView));
            return;
        }
        if (recyclingImageView != null) {
            if (m115154n() == 1) {
                recyclingImageView.setImageResource(AbstractC16803z.story_newstory_bg);
            } else if (m115154n() == 0) {
                recyclingImageView.setImageResource(AbstractC16803z.icon_story_newstory_bg);
            } else if (m115154n() == 2) {
                recyclingImageView.setImageResource(AbstractC16803z.story_newstory_bg_profile);
            }
        }
        recyclingImageView2.setVisibility(0);
    }

    /* renamed from: T */
    public static void m115130T(RecyclingImageView recyclingImageView, C32123ta c32123ta, C23528a c23528a, int i11) {
        if (recyclingImageView != null && c32123ta != null && c23528a != null) {
            try {
                if (c32123ta.m155070J()) {
                    C24003n m120133j = C23278z2.m120133j(recyclingImageView.getContext(), AbstractC23006a0.m117930z(), m115158r(recyclingImageView));
                    ((C23528a) c23528a.m123612r(recyclingImageView)).m123613s(AbstractC16803z.bg_feed);
                    C31903ea c31903ea = C31903ea.f146582a;
                    C3979l m153340e = c31903ea.m153340e(c32123ta.f148115R, c32123ta.f148116S, i11, m120133j);
                    if (m153340e != null) {
                        recyclingImageView.setImageInfo(m153340e);
                    } else {
                        String m153342g = c31903ea.m153342g(c32123ta.f148115R, c32123ta.f148116S, i11);
                        recyclingImageView.setTag(m153342g);
                        c31903ea.m153346k(c32123ta.f148115R, c32123ta.f148116S, c32123ta.f148117T, m120133j, i11, new C31903ea.b() { // from class: l30.u0

                            /* renamed from: b */
                            public final /* synthetic */ String f108613b;

                            public /* synthetic */ C22053u0(String m153342g2) {
                                r2 = m153342g2;
                            }

                            @Override // p716zh.C31903ea.b
                            /* renamed from: a */
                            public final void mo46919a(C3979l c3979l) {
                                AbstractC22055v0.m115122L(C2370r0.this, r2, c3979l);
                            }
                        });
                    }
                } else {
                    String str = c32123ta.f148146l;
                    recyclingImageView.setImageDrawable(AbstractC23136l9.m118665N(recyclingImageView.getContext(), AbstractC16803z.bg_feed));
                    if (!TextUtils.isEmpty(str)) {
                        C24003n m120095S0 = C23278z2.m120095S0();
                        m120095S0.f116273n = true;
                        ((C23528a) c23528a.m123612r(recyclingImageView)).m123618x(str, m120095S0);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: U */
    public static void m115131U(RecyclingImageView recyclingImageView, C31980jc c31980jc, C23528a c23528a, int i11) {
        String str = "";
        if (recyclingImageView != null && c31980jc != null && c23528a != null) {
            try {
                C32123ta m153827t = c31980jc.m153827t("");
                if (m153827t != null) {
                    if (m153827t.m155070J()) {
                        C24003n m120133j = C23278z2.m120133j(recyclingImageView.getContext(), AbstractC23006a0.m117930z(), m115158r(recyclingImageView));
                        ((C23528a) c23528a.m123612r(recyclingImageView)).m123613s(AbstractC16803z.bg_feed);
                        C31903ea c31903ea = C31903ea.f146582a;
                        C3979l m153340e = c31903ea.m153340e(m153827t.f148115R, m153827t.f148116S, i11, m120133j);
                        if (m153340e != null) {
                            recyclingImageView.setImageInfo(m153340e);
                            return;
                        }
                        String m153342g = c31903ea.m153342g(m153827t.f148115R, m153827t.f148116S, i11);
                        recyclingImageView.setTag(m153342g);
                        c31903ea.m153346k(m153827t.f148115R, m153827t.f148116S, m153827t.f148117T, m120133j, i11, new C31903ea.b() { // from class: l30.s0

                            /* renamed from: b */
                            public final /* synthetic */ String f108587b;

                            public /* synthetic */ C22049s0(String m153342g2) {
                                r2 = m153342g2;
                            }

                            @Override // p716zh.C31903ea.b
                            /* renamed from: a */
                            public final void mo46919a(C3979l c3979l) {
                                AbstractC22055v0.m115120J(C2370r0.this, r2, c3979l);
                            }
                        });
                        return;
                    }
                    if (c31980jc.m153828u().size() > 0) {
                        str = (String) c31980jc.m153828u().get(0);
                    }
                    recyclingImageView.setImageDrawable(AbstractC23136l9.m118665N(recyclingImageView.getContext(), AbstractC16803z.bg_feed));
                    if (!TextUtils.isEmpty(str)) {
                        ((C23528a) c23528a.m123612r(recyclingImageView)).m123618x(str, C23278z2.m120093R0());
                        return;
                    } else {
                        if (!TextUtils.isEmpty(c31980jc.f147025r)) {
                            ((C23528a) c23528a.m123612r(recyclingImageView)).m123618x(c31980jc.f147025r, C23278z2.m120093R0());
                            return;
                        }
                        return;
                    }
                }
                if (!TextUtils.isEmpty(c31980jc.f147025r)) {
                    ((C23528a) c23528a.m123612r(recyclingImageView)).m123618x(c31980jc.f147025r, C23278z2.m120093R0());
                } else {
                    recyclingImageView.setImageDrawable(AbstractC23136l9.m118665N(recyclingImageView.getContext(), AbstractC16803z.bg_feed));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: V */
    public static void m115132V(C21693c c21693c, C3977j c3977j, C31980jc c31980jc, C23528a c23528a, int i11, boolean z11) {
        String str = "";
        if (c21693c != null && c31980jc != null && c23528a != null && c3977j != null) {
            try {
                C32123ta m153827t = c31980jc.m153827t("");
                if (m153827t != null) {
                    if (m153827t.m155070J()) {
                        C24003n m120133j = C23278z2.m120133j(c21693c.getContext(), AbstractC23006a0.m117930z(), m115159s(c21693c));
                        c21693c.mo111925v1(AbstractC23170p.m119358p(c21693c.getContext()));
                        C31903ea c31903ea = C31903ea.f146582a;
                        C3979l m153340e = c31903ea.m153340e(m153827t.f148115R, m153827t.f148116S, i11, m120133j);
                        if (m153340e != null) {
                            c21693c.mo111924u1(m153340e.m18839c());
                            return;
                        } else {
                            if (!z11) {
                                String m153342g = c31903ea.m153342g(m153827t.f148115R, m153827t.f148116S, i11);
                                c21693c.m89129Y0(m153342g);
                                c31903ea.m153346k(m153827t.f148115R, m153827t.f148116S, m153827t.f148117T, m120133j, i11, new C31903ea.b() { // from class: l30.t0

                                    /* renamed from: b */
                                    public final /* synthetic */ String f108590b;

                                    /* renamed from: c */
                                    public final /* synthetic */ C3977j f108591c;

                                    /* renamed from: d */
                                    public final /* synthetic */ C24003n f108592d;

                                    public /* synthetic */ C22051t0(String m153342g2, C3977j c3977j2, C24003n m120133j2) {
                                        r2 = m153342g2;
                                        r3 = c3977j2;
                                        r4 = m120133j2;
                                    }

                                    @Override // p716zh.C31903ea.b
                                    /* renamed from: a */
                                    public final void mo46919a(C3979l c3979l) {
                                        AbstractC22055v0.m115121K(C2370r0.this, r2, r3, r4, c3979l);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                    }
                    if (c31980jc.m153828u().size() > 0) {
                        str = (String) c31980jc.m153828u().get(0);
                    }
                    String str2 = str;
                    if (!TextUtils.isEmpty(str2)) {
                        AbstractC23268y2.m120033g(c23528a, c3977j2, c21693c, str2, C23278z2.m120093R0(), z11);
                        return;
                    } else if (!TextUtils.isEmpty(c31980jc.f147025r)) {
                        AbstractC23268y2.m120033g(c23528a, c3977j2, c21693c, c31980jc.f147025r, C23278z2.m120093R0(), z11);
                        return;
                    } else {
                        c21693c.mo111925v1(AbstractC23136l9.m118665N(c21693c.getContext(), AbstractC16803z.bg_feed));
                        return;
                    }
                }
                if (!TextUtils.isEmpty(c31980jc.f147025r)) {
                    AbstractC23268y2.m120033g(c23528a, c3977j2, c21693c, c31980jc.f147025r, C23278z2.m120093R0(), z11);
                } else {
                    c21693c.mo111925v1(AbstractC23136l9.m118665N(c21693c.getContext(), AbstractC16803z.bg_feed));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: W */
    public static void m115133W(C3426e c3426e) {
        if (c3426e != null) {
            c3426e.mo17187l();
        }
    }

    /* renamed from: X */
    public static void m115134X(ZaloView zaloView, Point point, SensitiveData sensitiveData, TrackingSource trackingSource) {
        String[] m118181u = AbstractC23034c6.m118181u();
        if (AbstractC23034c6.m118167n(zaloView.m92686rK(), m118181u) != 0) {
            AbstractC23034c6.m118186w0(zaloView.m92692wK(), m118181u, 115);
        } else {
            m115126P(zaloView, point, sensitiveData, trackingSource);
        }
    }

    /* renamed from: Y */
    public static void m115135Y() {
        f108617b = false;
    }

    /* renamed from: Z */
    public static void m115136Z() {
        f108619d = null;
        f108620e = null;
        f108618c = null;
    }

    /* renamed from: a0 */
    public static void m115138a0(List list, boolean z11) {
        if (list != null) {
            Collections.sort(list, new h(z11));
        }
    }

    /* renamed from: b0 */
    public static void m115140b0(C32123ta c32123ta) {
        if (c32123ta == null) {
            return;
        }
        C0824j.m2153b(new f(c32123ta));
    }

    /* renamed from: c0 */
    public static void m115142c0(C3426e c3426e, boolean z11) {
        StoryBarBtnAdd m17199r;
        if (c3426e != null && (m17199r = c3426e.m17199r()) != null) {
            if (z11) {
                m17199r.m56576k();
            } else {
                m17199r.m56577l();
            }
        }
    }

    /* renamed from: d */
    public static boolean m115143d(String str) {
        if (!AbstractC25495a.m132079d(str) && !AbstractC25495a.m132084i(str) && !AbstractC25495a.m132078c(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: d0 */
    public static void m115144d0() {
        C23081g9.m118414l(20L);
    }

    /* renamed from: e */
    public static void m115145e(RecyclingImageView recyclingImageView, String str) {
        try {
            ArrayList arrayList = new ArrayList(2);
            C3979l m125676A2 = C23999j.m125676A2(str, C23278z2.m120093R0().f116260a, C23278z2.m120103W0().f116266g);
            Drawable drawable = null;
            if (m125676A2 != null) {
                if (m125676A2 instanceof C3980m) {
                    m125676A2 = ((C3980m) m125676A2).m18857u();
                    if (m125676A2 != null) {
                        drawable = new BitmapDrawable(recyclingImageView.getContext().getResources(), m125676A2.m18839c());
                    }
                } else {
                    drawable = new BitmapDrawable(recyclingImageView.getContext().getResources(), m125676A2.m18839c());
                }
                arrayList.add(m125676A2);
            }
            if (drawable == null) {
                drawable = C23278z2.m120093R0().f116261b;
            }
            Drawable drawable2 = recyclingImageView.getDrawable();
            C3979l imageInfo = recyclingImageView.getImageInfo();
            if (imageInfo instanceof C3980m) {
                imageInfo = ((C3980m) imageInfo).m18857u();
            }
            if (imageInfo != null) {
                arrayList.add(imageInfo);
            }
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
            C16649s0 c16649s0 = new C16649s0(drawable, scaleType);
            Drawable c16649s02 = new C16649s0(drawable2, scaleType);
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{c16649s0, c16649s02});
            if (arrayList.size() == 2) {
                recyclingImageView.setImageDrawable(transitionDrawable);
                recyclingImageView.setImageInfo(new C3980m(arrayList), false);
                transitionDrawable.startTransition(300);
            } else {
                recyclingImageView.setImageDrawable(c16649s02);
                recyclingImageView.setImageInfo(imageInfo, true);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: f */
    public static boolean m115146f(String str, InterfaceC27218a interfaceC27218a, ZaloView zaloView, int i11, int i12, C3426e c3426e, g gVar) {
        C31980jc m115161u;
        if (m115114D(str, AbstractC21244b.m110054d(interfaceC27218a.getContext())) && (m115161u = m115161u(str)) != null) {
            m115161u.m153811A(true);
            m115123M(m115161u, zaloView, i11, i12, c3426e, gVar);
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static void m115147g() {
        SparseArray sparseArray = f108616a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: h */
    public static void m115148h(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C28023b6.m141250h0().m141312S(str);
            C0824j.m2153b(new a(str));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: i */
    public static void m115149i(InterfaceC27218a interfaceC27218a, MediaItem mediaItem) {
        try {
            AbstractC23647d.m123897g("49150051");
            CameraInputParams cameraInputParams = new CameraInputParams();
            cameraInputParams.f41129s = 7;
            cameraInputParams.f41133u = 3;
            if (mediaItem instanceof VideoItem) {
                cameraInputParams.f41139x = mediaItem.mo41081Q();
            } else {
                cameraInputParams.f41137w = mediaItem.mo41081Q();
            }
            cameraInputParams.f41141y = mediaItem.mo41083a0();
            cameraInputParams.f41135v = 1;
            AbstractC22470k.m116167s(interfaceC27218a, 11116, 2, cameraInputParams);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: j */
    public static void m115150j(C32123ta c32123ta) {
        if (c32123ta != null) {
            try {
                C28905e.m144373n().m144390i(50, 22, c32123ta.f148138h, C23793c.m124316k().mo124311f());
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: k */
    public static void m115151k(C32123ta c32123ta) {
        if (c32123ta != null) {
            try {
                String str = "";
                if (!TextUtils.isEmpty(c32123ta.f148141i0)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("distid", c32123ta.f148141i0);
                    str = jSONObject.toString();
                }
                C28905e.m144373n().m144392k(String.valueOf(c32123ta.f148137g0), 50, 22, c32123ta.f148138h, c32123ta.f148139h0, C23793c.m124316k().mo124311f(), str);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: l */
    public static k m115152l(int i11) {
        int m118742r;
        SparseArray sparseArray = f108616a;
        k kVar = (k) sparseArray.get(i11);
        if (kVar == null) {
            switch (i11) {
                case 2:
                    kVar = new k();
                    kVar.f108642a = AbstractC23136l9.m118742r(36.0f);
                    kVar.f108643b = AbstractC23136l9.m118742r(48.0f);
                    kVar.f108647f = AbstractC23136l9.m118742r(2.0f);
                    break;
                case 3:
                    kVar = new k();
                    kVar.f108642a = AbstractC23136l9.m118742r(36.0f);
                    kVar.f108643b = AbstractC23136l9.m118742r(48.0f);
                    kVar.f108647f = AbstractC23136l9.m118742r(2.0f);
                    kVar.f108644c = AbstractC23136l9.m118742r(14.0f);
                    kVar.f108645d = AbstractC23136l9.m118742r(4.0f);
                    break;
                case 4:
                    kVar = new k();
                    kVar.f108642a = AbstractC23136l9.m118742r(60.0f);
                    kVar.f108643b = AbstractC23136l9.m118742r(80.0f);
                    kVar.f108647f = AbstractC23136l9.m118742r(6.0f);
                    kVar.f108644c = AbstractC23136l9.m118742r(24.0f);
                    kVar.f108645d = AbstractC23136l9.m118742r(6.0f);
                    break;
                case 5:
                    kVar = new k();
                    int m118742r2 = AbstractC23136l9.m118742r(40.0f);
                    kVar.f108643b = m118742r2;
                    kVar.f108642a = m118742r2;
                    kVar.f108647f = AbstractC23136l9.m118742r(4.0f);
                    kVar.f108644c = AbstractC23136l9.m118742r(12.0f);
                    kVar.f108645d = AbstractC23136l9.m118742r(4.0f);
                    break;
                case 6:
                    kVar = new k();
                    int m118742r3 = AbstractC23136l9.m118742r(60.0f);
                    kVar.f108643b = m118742r3;
                    kVar.f108642a = m118742r3;
                    kVar.f108647f = AbstractC23136l9.m118742r(8.0f);
                    kVar.f108644c = AbstractC23136l9.m118742r(18.0f);
                    kVar.f108645d = AbstractC23136l9.m118742r(6.0f);
                    break;
                case 7:
                    kVar = new k();
                    kVar.f108642a = AbstractC23136l9.m118742r(36.0f);
                    kVar.f108643b = AbstractC23136l9.m118742r(48.0f);
                    kVar.f108647f = AbstractC23136l9.m118742r(2.0f);
                    break;
                case 8:
                    kVar = new k();
                    if (m115154n() == 1) {
                        kVar.f108642a = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_cirle_width);
                        kVar.f108643b = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_cirle_height);
                    } else if (m115154n() == 0) {
                        kVar.f108642a = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_roundrect_width_profile);
                        kVar.f108643b = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_roundrect_height_profile);
                    } else if (m115154n() == 2) {
                        kVar.f108642a = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_large_roundrect_width_profile);
                        kVar.f108643b = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_large_roundrect_height_profile);
                    } else {
                        kVar.f108642a = 0;
                        kVar.f108643b = 0;
                    }
                    if (m115154n() == 1) {
                        m118742r = kVar.f108642a / 2;
                    } else {
                        m118742r = AbstractC23136l9.m118742r(6.0f);
                    }
                    kVar.f108647f = m118742r;
                    break;
            }
            sparseArray.put(i11, kVar);
        }
        return kVar;
    }

    /* renamed from: m */
    public static int m115153m() {
        int m121033I0 = AbstractC23309i.m121033I0();
        if (m121033I0 == 0) {
            return 0;
        }
        if (m121033I0 != 1) {
            if (m121033I0 != 2) {
                return 0;
            }
            return 2;
        }
        return 1;
    }

    /* renamed from: n */
    public static int m115154n() {
        return 0;
    }

    /* renamed from: o */
    public static String m115155o(String str) {
        String m115033g = C22037m0.f108553a.m115033g(str);
        if (m115033g.isEmpty()) {
            m115033g = C28050e3.m141486l().m141499k(str);
        }
        if (m115033g == null) {
            return "";
        }
        return m115033g;
    }

    /* renamed from: p */
    public static C24003n m115156p() {
        int m115153m = m115153m();
        if (m115153m != 0 && m115153m != 1) {
            if (m115153m != 2) {
                return C23278z2.m120093R0();
            }
            return C23278z2.m120097T0();
        }
        return C23278z2.m120093R0();
    }

    /* renamed from: q */
    public static int m115157q(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                return 0;
            }
            return AbstractC23136l9.m118742r(2.0f);
        }
        return AbstractC23136l9.m118742r(3.5f);
    }

    /* renamed from: r */
    public static float m115158r(View view) {
        int m118722k0;
        int m118713h0;
        float height;
        int m118655I;
        int m118655I2;
        if (view != null) {
            try {
            } catch (Exception e11) {
                e11.printStackTrace();
                m118722k0 = AbstractC23136l9.m118722k0();
                m118713h0 = AbstractC23136l9.m118713h0();
            }
            if (view.getWidth() > 0 && view.getHeight() > 0) {
                height = view.getHeight() * 1.0f;
                m118722k0 = view.getWidth();
                return height / m118722k0;
            }
        }
        int m115153m = m115153m();
        if (m115153m != 0) {
            m118713h0 = 1;
            if (m115153m != 1) {
                if (m115153m != 2) {
                    m118722k0 = 1;
                    height = m118713h0 * 1.0f;
                    return height / m118722k0;
                }
                m118655I = AbstractC23136l9.m118655I(AbstractC16802y.story_bar_thumb_large_roundrect_width);
                m118655I2 = AbstractC23136l9.m118655I(AbstractC16802y.story_bar_thumb_large_roundrect_height);
            } else {
                m118655I = AbstractC23136l9.m118655I(AbstractC16802y.story_bar_thumb_cirle_width);
                m118655I2 = AbstractC23136l9.m118655I(AbstractC16802y.story_bar_thumb_cirle_height);
            }
        } else {
            m118655I = AbstractC23136l9.m118655I(AbstractC16802y.story_bar_thumb_roundrect_width);
            m118655I2 = AbstractC23136l9.m118655I(AbstractC16802y.story_bar_thumb_roundrect_height);
        }
        int i11 = m118655I;
        m118713h0 = m118655I2;
        m118722k0 = i11;
        height = m118713h0 * 1.0f;
        return height / m118722k0;
    }

    /* renamed from: s */
    public static float m115159s(C21693c c21693c) {
        int m118722k0;
        int m118713h0;
        float m89112O;
        int m118655I;
        int m118655I2;
        if (c21693c != null) {
            try {
            } catch (Exception e11) {
                e11.printStackTrace();
                m118722k0 = AbstractC23136l9.m118722k0();
                m118713h0 = AbstractC23136l9.m118713h0();
            }
            if (c21693c.m89114P() > 0 && c21693c.m89112O() > 0) {
                m89112O = c21693c.m89112O() * 1.0f;
                m118722k0 = c21693c.m89114P();
                return m89112O / m118722k0;
            }
        }
        int m115153m = m115153m();
        if (m115153m != 0) {
            m118713h0 = 1;
            if (m115153m != 1) {
                if (m115153m != 2) {
                    m118722k0 = 1;
                    m89112O = m118713h0 * 1.0f;
                    return m89112O / m118722k0;
                }
                m118655I = AbstractC23136l9.m118655I(AbstractC16802y.story_bar_thumb_large_roundrect_width);
                m118655I2 = AbstractC23136l9.m118655I(AbstractC16802y.story_bar_thumb_large_roundrect_height);
            } else {
                m118655I = AbstractC23136l9.m118655I(AbstractC16802y.story_bar_thumb_cirle_width);
                m118655I2 = AbstractC23136l9.m118655I(AbstractC16802y.story_bar_thumb_cirle_height);
            }
        } else {
            m118655I = AbstractC23136l9.m118655I(AbstractC16802y.story_bar_thumb_roundrect_width);
            m118655I2 = AbstractC23136l9.m118655I(AbstractC16802y.story_bar_thumb_roundrect_height);
        }
        int i11 = m118655I;
        m118713h0 = m118655I2;
        m118722k0 = i11;
        m89112O = m118713h0 * 1.0f;
        return m89112O / m118722k0;
    }

    /* renamed from: t */
    public static float m115160t(C21693c c21693c) {
        int m118722k0;
        float m118713h0;
        if (c21693c != null) {
            try {
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                m118722k0 = AbstractC23136l9.m118722k0();
                m118713h0 = AbstractC23136l9.m118713h0() * 1.0f;
            }
            if (c21693c.m89114P() > 0 && c21693c.m89112O() > 0) {
                m118713h0 = c21693c.m89112O() * 1.0f;
                m118722k0 = c21693c.m89114P();
                return m118713h0 / m118722k0;
            }
        }
        return (16 * 1.0f) / 9;
    }

    /* renamed from: u */
    public static C31980jc m115161u(String str) {
        Map map = C22021e0.f108428l;
        if (map != null) {
            return (C31980jc) map.get(str);
        }
        return null;
    }

    /* renamed from: v */
    public static int[] m115162v(Context context) {
        if (f108620e == null) {
            f108620e = new int[]{C23212s8.m119607o(context, AbstractC16781w.stroke_story_disable), C23212s8.m119607o(context, AbstractC16781w.stroke_story_disable)};
        }
        return f108620e;
    }

    /* renamed from: w */
    public static int[] m115163w(Context context) {
        if (f108619d == null) {
            f108619d = new int[]{AbstractC23136l9.m118641B(context, AbstractC16801x.story_avatar_stroke_color0), AbstractC23136l9.m118641B(context, AbstractC16801x.story_avatar_stroke_color1)};
        }
        return f108619d;
    }

    /* renamed from: x */
    public static int[] m115164x(Context context) {
        if (f108618c == null) {
            f108618c = new int[]{AbstractC23136l9.m118641B(context, AbstractC16801x.story_avatar_stroke_hide_color0), AbstractC23136l9.m118641B(context, AbstractC16801x.story_avatar_stroke_hide_color1)};
        }
        return f108618c;
    }

    /* renamed from: y */
    public static Layout.Alignment m115165y(int i11) {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return Layout.Alignment.ALIGN_OPPOSITE;
                }
                return alignment;
            }
            return Layout.Alignment.ALIGN_CENTER;
        }
        return alignment;
    }

    /* renamed from: z */
    public static void m115166z(C32123ta c32123ta, int i11) {
        if (c32123ta != null) {
            try {
                String str = "";
                if (!TextUtils.isEmpty(c32123ta.f148141i0)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("distid", c32123ta.f148141i0);
                    str = jSONObject.toString();
                }
                C28905e.m144373n().m144398t(String.valueOf(c32123ta.f148137g0), i11, 22, c32123ta.f148138h, c32123ta.f148139h0, C23793c.m124316k().mo124311f(), str);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }
}

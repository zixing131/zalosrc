package is;

import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.ArrayMap;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ar.AbstractC2298a0;
import ar.C2297a;
import au.AbstractC2361n;
import bi0.AbstractC2808b;
import bo.AbstractC2959d;
import bo.C2949b;
import bo.C2954c;
import bo.C2964e;
import bo.C2969f;
import bo.C2972f2;
import bo.C2973f3;
import bo.C2976g1;
import bo.C2988i3;
import bo.C3000l0;
import bo.C3003l3;
import bo.C3013n3;
import bo.C3014o;
import bo.C3020p0;
import bo.C3023p3;
import bo.C3024q;
import bo.C3025q0;
import bo.C3030r0;
import bo.C3043u0;
import bo.C3047v0;
import bo.C3049v2;
import bo.C3051w0;
import bo.C3063z0;
import com.androidquery.util.C3979l;
import com.showingphotolib.view.SimpleAnimationTarget;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC7307b0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.models.SongInfo;
import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.p077ui.zviews.ProgressDialogView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.LikeContactItem;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import ig0.AbstractC20550a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l80.C22126c0;
import lk0.C22505c;
import lk0.InterfaceC22508f;
import me0.AbstractC23041d2;
import me0.AbstractC23074g2;
import me0.AbstractC23136l9;
import me0.AbstractC23244v8;
import me0.C23081g9;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import nb0.C23672c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p107dq.C18049e;
import p111du.AbstractC18069a;
import p133ek.AbstractC18458a;
import p262jb.AbstractC21196a;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p348mi.C23307g;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p369ns.AbstractC23933a;
import p379o3.C23999j;
import p398oo.C24371m0;
import p458qr.AbstractC25474g;
import p458qr.C25476i;
import p471r3.C25630b;
import p542ub.InterfaceC27218a;
import p716zh.AbstractC32173x4;
import p716zh.C31845ac;
import p716zh.C31854b6;
import p716zh.C31869c6;
import p716zh.C31873ca;
import p716zh.C31877d;
import p716zh.C31890dc;
import p716zh.C32002l4;
import p716zh.C32107s8;
import p716zh.C32145v4;
import p716zh.C32187y4;
import p726zr.C32546b;
import sn.C26333b;
import tn.C26767v;
import tr.C26878b;
import ui0.C27280g;
import vg.C28023b6;
import vg.C28203u6;
import vg.C28209v3;
import vg.C28227x3;
import w20.InterfaceC28702e;

/* renamed from: is.v0 */
/* loaded from: classes4.dex */
public abstract class AbstractC20826v0 {

    /* renamed from: a */
    public static final int f102351a = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left);

    /* renamed from: b */
    public static final int f102352b = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right);

    /* renamed from: c */
    public static final int f102353c = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_top);

    /* renamed from: d */
    public static final int f102354d = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_bottom);

    /* renamed from: e */
    public static final int f102355e = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile);

    /* renamed from: f */
    public static final int f102356f = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile_item);

    /* renamed from: g */
    public static final int f102357g = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right_profile_item);

    /* renamed from: h */
    public static Set f102358h = Collections.synchronizedSet(new HashSet());

    /* renamed from: i */
    static int f102359i = AbstractC23309i.m121778c4();

    /* renamed from: j */
    public static String f102360j = "extra_async_feed_post_state";

    /* renamed from: k */
    public static String f102361k = "extra_async_feed_id";

    /* renamed from: l */
    public static String f102362l = "extra_total_time_post";

    /* renamed from: m */
    public static String f102363m = "extra_async_feed_local_id";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: is.v0$a */
    /* loaded from: classes4.dex */
    public class a extends AbstractC25474g {
        a() {
        }

        @Override // p458qr.AbstractC25474g
        /* renamed from: d */
        public Void mo15774a() {
            try {
                AbstractC20826v0.m108776O0();
                C23744a.m124114c().m124116d(60060, new Object[0]);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            return (Void) super.mo15774a();
        }
    }

    /* renamed from: is.v0$b */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f102364a;

        static {
            int[] iArr = new int[k.values().length];
            f102364a = iArr;
            try {
                iArr[k.Feed_Header_Name.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f102364a[k.Feed_Header_Time.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f102364a[k.Feed_Header_Name_Video.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f102364a[k.Feed_Header_Time_Video.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f102364a[k.Feed_Header_Caption.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f102364a[k.Feed_Header_Activity.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f102364a[k.Feed_Body_LinkTitle.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f102364a[k.Feed_Body_LinkSubTitle.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f102364a[k.ROBOTO_F0.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f102364a[k.ROBOTO_F3.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f102364a[k.ROBOTO_F4.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f102364a[k.ROBOTO_F7.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f102364a[k.ROBOTO_F71.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* renamed from: is.v0$c */
    /* loaded from: classes4.dex */
    public class c extends AbstractC25474g {

        /* renamed from: a */
        final /* synthetic */ C3020p0 f102365a;

        c(C3020p0 c3020p0) {
            this.f102365a = c3020p0;
        }

        @Override // p458qr.AbstractC25474g
        /* renamed from: a */
        public Object mo15774a() {
            C3025q0 c3025q0 = this.f102365a.f12023C;
            C17391z c17391z = c3025q0.f12094C;
            if (c17391z != null) {
                VideoBlendingParam videoBlendingParam = c3025q0.f12092A;
                if (videoBlendingParam != null && (videoBlendingParam.f48259K || videoBlendingParam.f48260L)) {
                    AbstractC23041d2.m118208g(c17391z.f88620c);
                }
                this.f102365a.f12023C.f12094C = null;
            }
            return super.mo15774a();
        }
    }

    /* renamed from: is.v0$d */
    /* loaded from: classes4.dex */
    public class d extends AbstractC25474g {

        /* renamed from: a */
        final /* synthetic */ C3020p0 f102366a;

        d(C3020p0 c3020p0) {
            this.f102366a = c3020p0;
        }

        @Override // p458qr.AbstractC25474g
        /* renamed from: a */
        public Object mo15774a() {
            C3025q0 c3025q0 = this.f102366a.f12023C;
            C17391z c17391z = c3025q0.f12094C;
            if (c17391z != null) {
                VideoBlendingParam videoBlendingParam = c3025q0.f12092A;
                if (videoBlendingParam != null && (videoBlendingParam.f48259K || videoBlendingParam.f48260L)) {
                    AbstractC23041d2.m118208g(c17391z.f88620c);
                }
                this.f102366a.f12023C.f12094C = null;
            }
            return super.mo15774a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: is.v0$e */
    /* loaded from: classes4.dex */
    public class e extends SimpleAnimationTarget {

        /* renamed from: p */
        final /* synthetic */ C16719g f102367p;

        e(C16719g c16719g) {
            this.f102367p = c16719g;
        }

        @Override // com.showingphotolib.view.SimpleAnimationTarget, com.zing.zalo.zview.animation.AnimationTarget
        public Rect getAnimTargetLocationOnScreen() {
            return AbstractC20826v0.m108795Y(this.f102367p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: is.v0$f */
    /* loaded from: classes4.dex */
    public class f extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f102368a;

        f(String str) {
            this.f102368a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                Thread.currentThread();
                Thread.sleep(1000L);
                C24371m0.m127468p().mo127472d(0).m127391A(this.f102368a);
                C24371m0.m127468p().mo127472d(1).m127391A(this.f102368a);
                C24371m0.m127468p().m127480r(this.f102368a);
                AbstractC23074g2.m118378d();
            } catch (InterruptedException e11) {
                e11.printStackTrace();
                Thread.currentThread().interrupt();
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: is.v0$g */
    /* loaded from: classes4.dex */
    public class g extends RecyclerView.C1897x {

        /* renamed from: a */
        float f102369a;

        /* renamed from: b */
        float f102370b;

        /* renamed from: c */
        final int f102371c = AbstractC23136l9.m118742r(3.0f);

        g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.C1897x, androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
        /* renamed from: c */
        public boolean mo953c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 2) {
                    if (Math.abs(motionEvent.getX() - this.f102369a) > Math.abs(motionEvent.getY() - this.f102370b) * 0.8f) {
                        recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
                    } else if (Math.abs(motionEvent.getY() - this.f102370b) > this.f102371c) {
                        recyclerView.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
            } else {
                recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.f102369a = motionEvent.getX();
            this.f102370b = motionEvent.getY();
            return super.mo953c(recyclerView, motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: is.v0$h */
    /* loaded from: classes4.dex */
    public class h extends AbstractC25474g {
        h() {
        }

        @Override // p458qr.AbstractC25474g
        /* renamed from: d */
        public Void mo15774a() {
            try {
                AbstractC20826v0.m108778P0();
                C23744a.m124114c().m124116d(6006, new Object[0]);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return (Void) super.mo15774a();
        }
    }

    /* renamed from: is.v0$i */
    /* loaded from: classes4.dex */
    public interface i {
        /* renamed from: a */
        void mo44661a(String str, int i11, int i12);
    }

    /* renamed from: is.v0$j */
    /* loaded from: classes4.dex */
    public interface j {
        /* renamed from: a */
        void mo87393a(int i11, int i12, int i13);
    }

    /* renamed from: is.v0$k */
    /* loaded from: classes4.dex */
    public enum k {
        Feed_Header_Name_Video,
        Feed_Header_Time_Video,
        Feed_Header_Caption,
        Feed_Header_Name,
        Feed_Header_Time,
        Feed_Header_Activity,
        Feed_Body_LinkTitle,
        Feed_Body_LinkSubTitle,
        ROBOTO_F0,
        ROBOTO_F3,
        ROBOTO_F4,
        ROBOTO_F7,
        ROBOTO_F71
    }

    /* renamed from: A */
    public static AnimationTarget m108747A(C16719g c16719g) {
        return new e(c16719g);
    }

    /* renamed from: A0 */
    private static void m108748A0(TrackingSource trackingSource, String str) {
        JSONObject optJSONObject;
        if (trackingSource != null) {
            try {
                if (!TextUtils.isEmpty(str) && (optJSONObject = new JSONObject(str).optJSONObject("event")) != null && optJSONObject.has("id")) {
                    trackingSource.m40677a("eventId", Integer.valueOf(optJSONObject.optInt("id")));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: B */
    public static String m108749B(String str) {
        C3000l0 m138450a = C26878b.f127183a.m138450a(str);
        if (m138450a != null && m138450a.m14322a0() != null && m138450a.m14322a0().m14488S()) {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_edit_feed_succes_notif);
        }
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_post_feed_succes_notif);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:            if (r7 != 16) goto L160;     */
    /* renamed from: B0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3000l0 m108750B0(JSONObject jSONObject) {
        JSONObject optJSONObject;
        C2954c c2954c;
        JSONObject optJSONObject2;
        int i11;
        C3020p0 m108752C0;
        C3020p0 m108752C02;
        C3000l0 c3000l0 = new C3000l0();
        try {
            c3000l0.f11893p = m108775O(jSONObject, "holder_type");
            c3000l0.f11869R = m108779Q(jSONObject, "title");
            c3000l0.f11872U = m108779Q(jSONObject, "icon");
            c3000l0.f11870S = m108779Q(jSONObject, "color");
            c3000l0.f11871T = m108779Q(jSONObject, "color_line");
            c3000l0.f11873V = m108779Q(jSONObject, "color_title");
            int i12 = c3000l0.f11893p;
            if (i12 != 0) {
                int i13 = 7;
                if (i12 != 1 && i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 7) {
                            JSONArray jSONArray = jSONObject.getJSONArray("items");
                            StringBuilder sb2 = new StringBuilder("GROUP");
                            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i14);
                                if (m108822m0(jSONObject2) && (m108752C02 = m108752C0(jSONObject2, c3000l0.f11893p)) != null) {
                                    if (m108818k0(jSONObject2)) {
                                        FeedActionZUtils.m47520H(m108752C02, 1);
                                    }
                                    c3000l0.f11899s.add(m108752C02);
                                    sb2.append("_");
                                    sb2.append(m108752C02.f12057p);
                                }
                            }
                            c3000l0.f11895q = sb2.toString();
                            c3000l0.f11897r = m108775O(jSONObject, "pos");
                            c3000l0.m14298H1();
                        }
                    }
                    JSONObject jSONObject3 = jSONObject.getJSONObject("item");
                    if (m108822m0(jSONObject3) && (m108752C0 = m108752C0(jSONObject3, c3000l0.f11893p)) != null) {
                        if (m108818k0(jSONObject3)) {
                            FeedActionZUtils.m47520H(m108752C0, 1);
                        }
                        c3000l0.f11899s.add(m108752C0);
                        c3000l0.f11895q = m108752C0.f12057p;
                        c3000l0.f11897r = m108775O(jSONObject, "pos");
                    }
                } else {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("items");
                    StringBuilder sb3 = new StringBuilder("GROUP");
                    int i15 = 0;
                    while (i15 < jSONArray2.length()) {
                        C3020p0 m108752C03 = m108752C0(jSONArray2.getJSONObject(i15), c3000l0.f11893p);
                        if (m108752C03 != null) {
                            if (c3000l0.f11893p == 1 && (i11 = m108752C03.f12058q) != i13 && i11 != 24) {
                                c3000l0.f11893p = -1;
                            }
                            c3000l0.f11899s.add(m108752C03);
                            sb3.append("_");
                            sb3.append(m108752C03.f12057p);
                        }
                        i15++;
                        i13 = 7;
                    }
                    c3000l0.f11895q = sb3.toString();
                    if (jSONObject.has("user_follow")) {
                        c3000l0.f11851A = new C3003l3.c(jSONObject.getJSONObject("user_follow"), false);
                    }
                    m108847z(c3000l0);
                }
            } else {
                C3020p0 m108752C04 = m108752C0(jSONObject.getJSONObject("item"), c3000l0.f11893p);
                if (m108752C04 != null) {
                    c3000l0.f11899s.add(m108752C04);
                    c3000l0.f11895q = m108752C04.f12057p;
                }
            }
            AbstractC20809n.m108583q(c3000l0);
            c3000l0.f11892o0 = jSONObject.optInt("error_code_upload", -1000);
            c3000l0.m14366u1(jSONObject.optBoolean("is_async_feed"));
            c3000l0.f11888k0 = jSONObject.optLong("album_id", 0L);
            if (jSONObject.has("album_info") && (optJSONObject2 = jSONObject.optJSONObject("album_info")) != null) {
                C2949b c2949b = new C2949b(optJSONObject2);
                c3000l0.f11889l0 = c2949b;
                c2949b.m13964g(c3000l0.m14322a0().m14465A());
            }
            if (jSONObject.has("album_items")) {
                if (c3000l0.f11890m0 == null) {
                    c3000l0.f11890m0 = new ArrayList();
                }
                JSONArray jSONArray3 = jSONObject.getJSONArray("album_items");
                for (int i16 = 0; i16 < jSONArray3.length(); i16++) {
                    JSONObject jSONObject4 = jSONArray3.getJSONObject(i16);
                    if (jSONObject4 != null) {
                        c2954c = new C2954c(jSONObject4);
                    } else {
                        c2954c = null;
                    }
                    c3000l0.f11890m0.add(c2954c);
                }
            }
            if (jSONObject.has("song") && (optJSONObject = jSONObject.optJSONObject("song")) != null) {
                c3000l0.f11891n0 = new SongInfo(optJSONObject);
            }
            return c3000l0;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: C */
    public static int m108751C(int i11) {
        try {
            C31890dc m153036O = C31845ac.m152996J().m153036O(String.valueOf(i11));
            int m121624Y = AbstractC23309i.m121624Y();
            if (m153036O == null || m121624Y == -100) {
                return -1;
            }
            int i12 = m153036O.f146509o;
            if (m121624Y != i12) {
                return -1;
            }
            return i12;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return -1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:138:0x03b5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:271:0x076b A[Catch: JSONException -> 0x002a, TryCatch #2 {JSONException -> 0x002a, blocks: (B:3:0x0011, B:6:0x0019, B:8:0x0023, B:9:0x002e, B:11:0x0034, B:13:0x003e, B:14:0x0044, B:17:0x0061, B:20:0x006e, B:23:0x0083, B:26:0x00b8, B:28:0x00c3, B:29:0x00cb, B:32:0x00d7, B:34:0x00e3, B:35:0x00e9, B:37:0x00eb, B:39:0x00fb, B:40:0x010c, B:42:0x0115, B:44:0x011f, B:45:0x0127, B:46:0x0132, B:49:0x0149, B:50:0x0150, B:52:0x0156, B:54:0x0176, B:56:0x017f, B:58:0x01cf, B:60:0x020d, B:69:0x0233, B:70:0x0236, B:72:0x023e, B:74:0x024a, B:75:0x024e, B:77:0x0256, B:78:0x0264, B:80:0x026c, B:82:0x0298, B:84:0x02a2, B:85:0x02a9, B:87:0x02ab, B:89:0x02b1, B:90:0x02b4, B:92:0x02bc, B:94:0x02c6, B:95:0x02ce, B:97:0x02d0, B:99:0x02d8, B:101:0x02e0, B:102:0x02e7, B:104:0x02ed, B:105:0x0323, B:107:0x0329, B:108:0x0334, B:110:0x033c, B:111:0x0349, B:113:0x0351, B:115:0x0368, B:117:0x0370, B:119:0x0374, B:120:0x0387, B:140:0x0b9a, B:142:0x0ba2, B:145:0x0bb0, B:148:0x03bb, B:150:0x03c3, B:152:0x03cb, B:153:0x03df, B:155:0x03e7, B:157:0x03ed, B:158:0x03f4, B:159:0x03fb, B:161:0x0401, B:163:0x0407, B:165:0x040e, B:169:0x0418, B:171:0x0420, B:172:0x0429, B:174:0x0431, B:175:0x0437, B:177:0x043b, B:179:0x0443, B:180:0x044d, B:182:0x0455, B:183:0x045f, B:185:0x0467, B:186:0x0471, B:188:0x0492, B:190:0x049a, B:193:0x04a8, B:195:0x04aa, B:197:0x04b2, B:198:0x04b8, B:207:0x048f, B:208:0x04bc, B:209:0x04cd, B:218:0x04ec, B:219:0x04f1, B:222:0x050e, B:224:0x0514, B:226:0x059b, B:227:0x05a2, B:229:0x05aa, B:230:0x05b1, B:233:0x05cb, B:235:0x05d1, B:237:0x05ef, B:239:0x05f7, B:241:0x060a, B:244:0x060f, B:247:0x06d0, B:249:0x06e6, B:250:0x06f1, B:252:0x06f9, B:253:0x0704, B:255:0x0710, B:256:0x071c, B:258:0x0728, B:260:0x073a, B:262:0x0742, B:264:0x0751, B:266:0x0755, B:268:0x0759, B:269:0x0763, B:271:0x076b, B:274:0x07b8, B:276:0x07dc, B:277:0x07de, B:279:0x07f3, B:281:0x07fb, B:282:0x0803, B:284:0x080b, B:285:0x0814, B:287:0x081c, B:288:0x0822, B:291:0x0826, B:293:0x087d, B:294:0x08a8, B:296:0x08b0, B:298:0x08c5, B:299:0x08c9, B:300:0x08cd, B:302:0x08dd, B:303:0x08e3, B:305:0x08eb, B:306:0x08f1, B:308:0x08fb, B:310:0x091c, B:312:0x0936, B:313:0x093e, B:315:0x094a, B:316:0x0952, B:318:0x095c, B:319:0x0962, B:323:0x0966, B:325:0x096e, B:326:0x0975, B:328:0x097b, B:330:0x09b0, B:332:0x09b8, B:333:0x09bf, B:335:0x09c1, B:339:0x09cb, B:341:0x09d3, B:342:0x09f4, B:344:0x09fa, B:346:0x0a21, B:348:0x0a29, B:349:0x0a30, B:351:0x0a36, B:353:0x0a42, B:354:0x0a4b, B:356:0x0a51, B:357:0x0a57, B:359:0x0a5d, B:361:0x0a63, B:367:0x0a72, B:370:0x0a8b, B:372:0x0a95, B:373:0x0a9b, B:375:0x0aa3, B:377:0x0aa9, B:378:0x0ab2, B:380:0x0aba, B:383:0x0acb, B:385:0x0ad4, B:387:0x0b10, B:388:0x0b25, B:390:0x0b2d, B:391:0x0b33, B:393:0x0b3b, B:395:0x0b41, B:397:0x0b4b, B:399:0x0b54, B:400:0x0b5a, B:402:0x0b66, B:403:0x0b6e, B:405:0x0b78, B:407:0x0b7e, B:408:0x0b89, B:410:0x0b91, B:201:0x0479, B:203:0x0481, B:212:0x04d5, B:214:0x04dd, B:63:0x0215, B:65:0x0226), top: B:2:0x0011, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x07fb A[Catch: JSONException -> 0x002a, TryCatch #2 {JSONException -> 0x002a, blocks: (B:3:0x0011, B:6:0x0019, B:8:0x0023, B:9:0x002e, B:11:0x0034, B:13:0x003e, B:14:0x0044, B:17:0x0061, B:20:0x006e, B:23:0x0083, B:26:0x00b8, B:28:0x00c3, B:29:0x00cb, B:32:0x00d7, B:34:0x00e3, B:35:0x00e9, B:37:0x00eb, B:39:0x00fb, B:40:0x010c, B:42:0x0115, B:44:0x011f, B:45:0x0127, B:46:0x0132, B:49:0x0149, B:50:0x0150, B:52:0x0156, B:54:0x0176, B:56:0x017f, B:58:0x01cf, B:60:0x020d, B:69:0x0233, B:70:0x0236, B:72:0x023e, B:74:0x024a, B:75:0x024e, B:77:0x0256, B:78:0x0264, B:80:0x026c, B:82:0x0298, B:84:0x02a2, B:85:0x02a9, B:87:0x02ab, B:89:0x02b1, B:90:0x02b4, B:92:0x02bc, B:94:0x02c6, B:95:0x02ce, B:97:0x02d0, B:99:0x02d8, B:101:0x02e0, B:102:0x02e7, B:104:0x02ed, B:105:0x0323, B:107:0x0329, B:108:0x0334, B:110:0x033c, B:111:0x0349, B:113:0x0351, B:115:0x0368, B:117:0x0370, B:119:0x0374, B:120:0x0387, B:140:0x0b9a, B:142:0x0ba2, B:145:0x0bb0, B:148:0x03bb, B:150:0x03c3, B:152:0x03cb, B:153:0x03df, B:155:0x03e7, B:157:0x03ed, B:158:0x03f4, B:159:0x03fb, B:161:0x0401, B:163:0x0407, B:165:0x040e, B:169:0x0418, B:171:0x0420, B:172:0x0429, B:174:0x0431, B:175:0x0437, B:177:0x043b, B:179:0x0443, B:180:0x044d, B:182:0x0455, B:183:0x045f, B:185:0x0467, B:186:0x0471, B:188:0x0492, B:190:0x049a, B:193:0x04a8, B:195:0x04aa, B:197:0x04b2, B:198:0x04b8, B:207:0x048f, B:208:0x04bc, B:209:0x04cd, B:218:0x04ec, B:219:0x04f1, B:222:0x050e, B:224:0x0514, B:226:0x059b, B:227:0x05a2, B:229:0x05aa, B:230:0x05b1, B:233:0x05cb, B:235:0x05d1, B:237:0x05ef, B:239:0x05f7, B:241:0x060a, B:244:0x060f, B:247:0x06d0, B:249:0x06e6, B:250:0x06f1, B:252:0x06f9, B:253:0x0704, B:255:0x0710, B:256:0x071c, B:258:0x0728, B:260:0x073a, B:262:0x0742, B:264:0x0751, B:266:0x0755, B:268:0x0759, B:269:0x0763, B:271:0x076b, B:274:0x07b8, B:276:0x07dc, B:277:0x07de, B:279:0x07f3, B:281:0x07fb, B:282:0x0803, B:284:0x080b, B:285:0x0814, B:287:0x081c, B:288:0x0822, B:291:0x0826, B:293:0x087d, B:294:0x08a8, B:296:0x08b0, B:298:0x08c5, B:299:0x08c9, B:300:0x08cd, B:302:0x08dd, B:303:0x08e3, B:305:0x08eb, B:306:0x08f1, B:308:0x08fb, B:310:0x091c, B:312:0x0936, B:313:0x093e, B:315:0x094a, B:316:0x0952, B:318:0x095c, B:319:0x0962, B:323:0x0966, B:325:0x096e, B:326:0x0975, B:328:0x097b, B:330:0x09b0, B:332:0x09b8, B:333:0x09bf, B:335:0x09c1, B:339:0x09cb, B:341:0x09d3, B:342:0x09f4, B:344:0x09fa, B:346:0x0a21, B:348:0x0a29, B:349:0x0a30, B:351:0x0a36, B:353:0x0a42, B:354:0x0a4b, B:356:0x0a51, B:357:0x0a57, B:359:0x0a5d, B:361:0x0a63, B:367:0x0a72, B:370:0x0a8b, B:372:0x0a95, B:373:0x0a9b, B:375:0x0aa3, B:377:0x0aa9, B:378:0x0ab2, B:380:0x0aba, B:383:0x0acb, B:385:0x0ad4, B:387:0x0b10, B:388:0x0b25, B:390:0x0b2d, B:391:0x0b33, B:393:0x0b3b, B:395:0x0b41, B:397:0x0b4b, B:399:0x0b54, B:400:0x0b5a, B:402:0x0b66, B:403:0x0b6e, B:405:0x0b78, B:407:0x0b7e, B:408:0x0b89, B:410:0x0b91, B:201:0x0479, B:203:0x0481, B:212:0x04d5, B:214:0x04dd, B:63:0x0215, B:65:0x0226), top: B:2:0x0011, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x080b A[Catch: JSONException -> 0x002a, TryCatch #2 {JSONException -> 0x002a, blocks: (B:3:0x0011, B:6:0x0019, B:8:0x0023, B:9:0x002e, B:11:0x0034, B:13:0x003e, B:14:0x0044, B:17:0x0061, B:20:0x006e, B:23:0x0083, B:26:0x00b8, B:28:0x00c3, B:29:0x00cb, B:32:0x00d7, B:34:0x00e3, B:35:0x00e9, B:37:0x00eb, B:39:0x00fb, B:40:0x010c, B:42:0x0115, B:44:0x011f, B:45:0x0127, B:46:0x0132, B:49:0x0149, B:50:0x0150, B:52:0x0156, B:54:0x0176, B:56:0x017f, B:58:0x01cf, B:60:0x020d, B:69:0x0233, B:70:0x0236, B:72:0x023e, B:74:0x024a, B:75:0x024e, B:77:0x0256, B:78:0x0264, B:80:0x026c, B:82:0x0298, B:84:0x02a2, B:85:0x02a9, B:87:0x02ab, B:89:0x02b1, B:90:0x02b4, B:92:0x02bc, B:94:0x02c6, B:95:0x02ce, B:97:0x02d0, B:99:0x02d8, B:101:0x02e0, B:102:0x02e7, B:104:0x02ed, B:105:0x0323, B:107:0x0329, B:108:0x0334, B:110:0x033c, B:111:0x0349, B:113:0x0351, B:115:0x0368, B:117:0x0370, B:119:0x0374, B:120:0x0387, B:140:0x0b9a, B:142:0x0ba2, B:145:0x0bb0, B:148:0x03bb, B:150:0x03c3, B:152:0x03cb, B:153:0x03df, B:155:0x03e7, B:157:0x03ed, B:158:0x03f4, B:159:0x03fb, B:161:0x0401, B:163:0x0407, B:165:0x040e, B:169:0x0418, B:171:0x0420, B:172:0x0429, B:174:0x0431, B:175:0x0437, B:177:0x043b, B:179:0x0443, B:180:0x044d, B:182:0x0455, B:183:0x045f, B:185:0x0467, B:186:0x0471, B:188:0x0492, B:190:0x049a, B:193:0x04a8, B:195:0x04aa, B:197:0x04b2, B:198:0x04b8, B:207:0x048f, B:208:0x04bc, B:209:0x04cd, B:218:0x04ec, B:219:0x04f1, B:222:0x050e, B:224:0x0514, B:226:0x059b, B:227:0x05a2, B:229:0x05aa, B:230:0x05b1, B:233:0x05cb, B:235:0x05d1, B:237:0x05ef, B:239:0x05f7, B:241:0x060a, B:244:0x060f, B:247:0x06d0, B:249:0x06e6, B:250:0x06f1, B:252:0x06f9, B:253:0x0704, B:255:0x0710, B:256:0x071c, B:258:0x0728, B:260:0x073a, B:262:0x0742, B:264:0x0751, B:266:0x0755, B:268:0x0759, B:269:0x0763, B:271:0x076b, B:274:0x07b8, B:276:0x07dc, B:277:0x07de, B:279:0x07f3, B:281:0x07fb, B:282:0x0803, B:284:0x080b, B:285:0x0814, B:287:0x081c, B:288:0x0822, B:291:0x0826, B:293:0x087d, B:294:0x08a8, B:296:0x08b0, B:298:0x08c5, B:299:0x08c9, B:300:0x08cd, B:302:0x08dd, B:303:0x08e3, B:305:0x08eb, B:306:0x08f1, B:308:0x08fb, B:310:0x091c, B:312:0x0936, B:313:0x093e, B:315:0x094a, B:316:0x0952, B:318:0x095c, B:319:0x0962, B:323:0x0966, B:325:0x096e, B:326:0x0975, B:328:0x097b, B:330:0x09b0, B:332:0x09b8, B:333:0x09bf, B:335:0x09c1, B:339:0x09cb, B:341:0x09d3, B:342:0x09f4, B:344:0x09fa, B:346:0x0a21, B:348:0x0a29, B:349:0x0a30, B:351:0x0a36, B:353:0x0a42, B:354:0x0a4b, B:356:0x0a51, B:357:0x0a57, B:359:0x0a5d, B:361:0x0a63, B:367:0x0a72, B:370:0x0a8b, B:372:0x0a95, B:373:0x0a9b, B:375:0x0aa3, B:377:0x0aa9, B:378:0x0ab2, B:380:0x0aba, B:383:0x0acb, B:385:0x0ad4, B:387:0x0b10, B:388:0x0b25, B:390:0x0b2d, B:391:0x0b33, B:393:0x0b3b, B:395:0x0b41, B:397:0x0b4b, B:399:0x0b54, B:400:0x0b5a, B:402:0x0b66, B:403:0x0b6e, B:405:0x0b78, B:407:0x0b7e, B:408:0x0b89, B:410:0x0b91, B:201:0x0479, B:203:0x0481, B:212:0x04d5, B:214:0x04dd, B:63:0x0215, B:65:0x0226), top: B:2:0x0011, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x081c A[Catch: JSONException -> 0x002a, TryCatch #2 {JSONException -> 0x002a, blocks: (B:3:0x0011, B:6:0x0019, B:8:0x0023, B:9:0x002e, B:11:0x0034, B:13:0x003e, B:14:0x0044, B:17:0x0061, B:20:0x006e, B:23:0x0083, B:26:0x00b8, B:28:0x00c3, B:29:0x00cb, B:32:0x00d7, B:34:0x00e3, B:35:0x00e9, B:37:0x00eb, B:39:0x00fb, B:40:0x010c, B:42:0x0115, B:44:0x011f, B:45:0x0127, B:46:0x0132, B:49:0x0149, B:50:0x0150, B:52:0x0156, B:54:0x0176, B:56:0x017f, B:58:0x01cf, B:60:0x020d, B:69:0x0233, B:70:0x0236, B:72:0x023e, B:74:0x024a, B:75:0x024e, B:77:0x0256, B:78:0x0264, B:80:0x026c, B:82:0x0298, B:84:0x02a2, B:85:0x02a9, B:87:0x02ab, B:89:0x02b1, B:90:0x02b4, B:92:0x02bc, B:94:0x02c6, B:95:0x02ce, B:97:0x02d0, B:99:0x02d8, B:101:0x02e0, B:102:0x02e7, B:104:0x02ed, B:105:0x0323, B:107:0x0329, B:108:0x0334, B:110:0x033c, B:111:0x0349, B:113:0x0351, B:115:0x0368, B:117:0x0370, B:119:0x0374, B:120:0x0387, B:140:0x0b9a, B:142:0x0ba2, B:145:0x0bb0, B:148:0x03bb, B:150:0x03c3, B:152:0x03cb, B:153:0x03df, B:155:0x03e7, B:157:0x03ed, B:158:0x03f4, B:159:0x03fb, B:161:0x0401, B:163:0x0407, B:165:0x040e, B:169:0x0418, B:171:0x0420, B:172:0x0429, B:174:0x0431, B:175:0x0437, B:177:0x043b, B:179:0x0443, B:180:0x044d, B:182:0x0455, B:183:0x045f, B:185:0x0467, B:186:0x0471, B:188:0x0492, B:190:0x049a, B:193:0x04a8, B:195:0x04aa, B:197:0x04b2, B:198:0x04b8, B:207:0x048f, B:208:0x04bc, B:209:0x04cd, B:218:0x04ec, B:219:0x04f1, B:222:0x050e, B:224:0x0514, B:226:0x059b, B:227:0x05a2, B:229:0x05aa, B:230:0x05b1, B:233:0x05cb, B:235:0x05d1, B:237:0x05ef, B:239:0x05f7, B:241:0x060a, B:244:0x060f, B:247:0x06d0, B:249:0x06e6, B:250:0x06f1, B:252:0x06f9, B:253:0x0704, B:255:0x0710, B:256:0x071c, B:258:0x0728, B:260:0x073a, B:262:0x0742, B:264:0x0751, B:266:0x0755, B:268:0x0759, B:269:0x0763, B:271:0x076b, B:274:0x07b8, B:276:0x07dc, B:277:0x07de, B:279:0x07f3, B:281:0x07fb, B:282:0x0803, B:284:0x080b, B:285:0x0814, B:287:0x081c, B:288:0x0822, B:291:0x0826, B:293:0x087d, B:294:0x08a8, B:296:0x08b0, B:298:0x08c5, B:299:0x08c9, B:300:0x08cd, B:302:0x08dd, B:303:0x08e3, B:305:0x08eb, B:306:0x08f1, B:308:0x08fb, B:310:0x091c, B:312:0x0936, B:313:0x093e, B:315:0x094a, B:316:0x0952, B:318:0x095c, B:319:0x0962, B:323:0x0966, B:325:0x096e, B:326:0x0975, B:328:0x097b, B:330:0x09b0, B:332:0x09b8, B:333:0x09bf, B:335:0x09c1, B:339:0x09cb, B:341:0x09d3, B:342:0x09f4, B:344:0x09fa, B:346:0x0a21, B:348:0x0a29, B:349:0x0a30, B:351:0x0a36, B:353:0x0a42, B:354:0x0a4b, B:356:0x0a51, B:357:0x0a57, B:359:0x0a5d, B:361:0x0a63, B:367:0x0a72, B:370:0x0a8b, B:372:0x0a95, B:373:0x0a9b, B:375:0x0aa3, B:377:0x0aa9, B:378:0x0ab2, B:380:0x0aba, B:383:0x0acb, B:385:0x0ad4, B:387:0x0b10, B:388:0x0b25, B:390:0x0b2d, B:391:0x0b33, B:393:0x0b3b, B:395:0x0b41, B:397:0x0b4b, B:399:0x0b54, B:400:0x0b5a, B:402:0x0b66, B:403:0x0b6e, B:405:0x0b78, B:407:0x0b7e, B:408:0x0b89, B:410:0x0b91, B:201:0x0479, B:203:0x0481, B:212:0x04d5, B:214:0x04dd, B:63:0x0215, B:65:0x0226), top: B:2:0x0011, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0821  */
    /* renamed from: C0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3020p0 m108752C0(JSONObject jSONObject, int i11) {
        int i12;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        float f11;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        JSONObject optJSONObject5;
        int i13;
        int i14;
        JSONObject optJSONObject6;
        Object obj;
        JSONObject optJSONObject7;
        C3020p0 c3020p0 = new C3020p0();
        try {
            if (jSONObject.has("notifyTxt") && !jSONObject.optString("notifyTxt").equalsIgnoreCase("null")) {
                c3020p0.f12049c0 = AbstractC18069a.m96089h(jSONObject, "notifyTxt");
            }
            if (jSONObject.has("previewTxt") && !jSONObject.optString("previewTxt").equalsIgnoreCase("null")) {
                c3020p0.f12050d0 = AbstractC18069a.m96089h(jSONObject, "previewTxt");
            }
            c3020p0.f12058q = m108775O(jSONObject, "ftype");
            c3020p0.f12057p = m108779Q(jSONObject, "fid");
            c3020p0.f12064w = m108775O(jSONObject, "islike") != 0;
            c3020p0.f12063v = m108775O(jSONObject, "hid") != 0;
            c3020p0.f12065x = m108773N(jSONObject, "isSubscribe");
            c3020p0.f12052f0 = m108775O(jSONObject, "suggest_comment") == 1;
            c3020p0.f12035O = m108775O(jSONObject, "iscmtable");
            c3020p0.f12037Q = m108775O(jSONObject, "max_line");
            c3020p0.f12062u = m108777P(jSONObject, "cts");
            c3020p0.f12066y = m108779Q(jSONObject, "feed_title");
            c3020p0.f12067z = m108779Q(jSONObject, "feed_desc");
            c3020p0.m14534x0(m108775O(jSONObject, "edited") == 1);
            c3020p0.f12055i0 = jSONObject.has("feed_sub_type") ? m108775O(jSONObject, "feed_sub_type") : 0;
            if (jSONObject.has("cliid")) {
                long m108777P = m108777P(jSONObject, "cliid");
                c3020p0.f12040T = m108777P > 0 ? String.valueOf(m108777P) : "";
            }
            c3020p0.f12061t = m108779Q(jSONObject, "suggest_title");
            if (jSONObject.has("user_follow")) {
                c3020p0.f12060s = new C3003l3.c(jSONObject.getJSONObject("user_follow"), true, c3020p0.f12057p, c3020p0.f12058q);
            }
            if (jSONObject.has("tags")) {
                JSONArray jSONArray = jSONObject.getJSONArray("tags");
                if (i11 == 2) {
                    c3020p0.f12059r = new C3003l3.a(jSONArray);
                } else {
                    c3020p0.f12059r = new C3003l3(jSONArray, c3020p0.f12057p, c3020p0.f12058q);
                }
            }
            c3020p0.f12042V.f45973p = jSONObject.optInt("privacy", -1);
            if (jSONObject.has("privacy_share_list")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("privacy_share_list");
                for (int i15 = 0; i15 < jSONArray2.length(); i15++) {
                    JSONObject jSONObject2 = (JSONObject) jSONArray2.get(i15);
                    c3020p0.f12042V.f45974q.add(new LikeContactItem(jSONObject2.getString("uid"), jSONObject2.getString("dpn"), ""));
                }
            }
            i12 = 3;
            if (jSONObject.has("header")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("header");
                c3020p0.f12022B.f12280b = m108779Q(jSONObject3, "uid");
                c3020p0.f12022B.f12281c = m108779Q(jSONObject3, "uidto");
                c3020p0.f12022B.f12283e = m108779Q(jSONObject3, "avt");
                c3020p0.f12022B.f12282d = m108779Q(jSONObject3, "dpn");
                c3020p0.f12022B.f12279a = m108775O(jSONObject3, "utype");
                c3020p0.f12022B.f12291m = m108779Q(jSONObject3, "activity");
                c3020p0.f12022B.f12292n = m108779Q(jSONObject3, ZMediaPlayer.OPTION_PLAYER_KEY_SUBTITLE);
                if (jSONObject3.has("app")) {
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("app");
                    c3020p0.f12022B.f12284f = m108779Q(jSONObject4, "appid");
                    c3020p0.f12022B.f12285g = m108775O(jSONObject4, "clktype");
                    c3020p0.f12022B.f12286h = m108779Q(jSONObject4, "param");
                    c3020p0.f12022B.f12287i = m108779Q(jSONObject4, "app_referrer");
                    c3020p0.f12022B.f12288j = m108779Q(jSONObject4, "apptitle");
                    C3047v0 c3047v0 = c3020p0.f12022B;
                    if (c3047v0.f12285g == 3 && !TextUtils.isEmpty(c3047v0.f12286h)) {
                        try {
                            JSONObject jSONObject5 = new JSONObject(c3020p0.f12022B.f12286h);
                            if (jSONObject5.has("pkgname")) {
                                c3020p0.f12022B.f12290l = AbstractC18069a.m96089h(jSONObject5, "pkgname");
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                    if (jSONObject4.has("packagename")) {
                        String m108779Q = m108779Q(jSONObject4, "packagename");
                        if (!TextUtils.isEmpty(m108779Q)) {
                            c3020p0.f12022B.f12290l = m108779Q;
                        }
                    }
                }
                if (jSONObject3.has("group_msg")) {
                    c3020p0.f12022B.f12289k = Integer.valueOf(m108775O(jSONObject3, "group_msg"));
                }
            }
            if (jSONObject.has("footer")) {
                JSONObject jSONObject6 = jSONObject.getJSONObject("footer");
                c3020p0.f12025E.f12243a = m108775O(jSONObject6, "numcmt");
                c3020p0.f12025E.f12244b = m108775O(jSONObject6, "numlike");
                c3020p0.f12025E.f12245c = m108775O(jSONObject6, "hide_bottom_bar");
                if (jSONObject6.has("recently_liked")) {
                    JSONObject optJSONObject8 = jSONObject6.optJSONObject("recently_liked");
                    c3020p0.f12025E.f12246d = optJSONObject8 != null ? new C3051w0(optJSONObject8) : null;
                }
                if (c3020p0.f12025E.f12244b > 0) {
                    c3020p0.m14476F0();
                }
                if (jSONObject6.has("reaction_info")) {
                    JSONObject optJSONObject9 = jSONObject6.optJSONObject("reaction_info");
                    c3020p0.f12025E.f12247e = optJSONObject9 != null ? C32546b.Companion.m157609a(optJSONObject9) : null;
                }
            }
            if (jSONObject.has("footerv2") && (optJSONObject7 = jSONObject.optJSONObject("footerv2")) != null) {
                c3020p0.f12024D = new C3043u0(optJSONObject7);
            }
            if (jSONObject.has("comment")) {
                C3030r0 c3030r0 = new C3030r0(0);
                JSONObject jSONObject7 = jSONObject.getJSONObject("comment");
                c3030r0.f12206d = m108779Q(jSONObject7, "avt");
                c3030r0.f12205c = m108779Q(jSONObject7, "dpn");
                c3030r0.f12208f = m108777P(jSONObject7, "cts");
                c3030r0.f12209g = m108779Q(jSONObject7, "uid");
                c3030r0.f12207e = m108779Q(jSONObject7, "comment");
                c3030r0.f12210h = m108779Q(jSONObject7, "comment_id");
                c3020p0.m14497b(c3030r0);
            }
            if (jSONObject.has("track_ads")) {
                c3020p0.f12039S = new C32145v4(jSONObject.getJSONObject("track_ads"));
            }
            if (jSONObject.has("mapEffect")) {
                c3020p0.f12051e0 = new C31854b6(jSONObject.optJSONArray("mapEffect"));
            }
        } catch (JSONException e12) {
            AbstractC20110a.m104539h(e12);
        }
        if (jSONObject.has("content")) {
            JSONObject jSONObject8 = jSONObject.getJSONObject("content");
            c3020p0.m14538z0(m108779Q(jSONObject8, "caption"));
            if (jSONObject8.has(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION) && (obj = jSONObject8.get(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION)) != null && (obj instanceof JSONObject)) {
                c3020p0.f12023C.f12111b = new C3063z0((JSONObject) obj);
                c3020p0.f12023C.f12111b.m14732k(true);
            }
            int i16 = c3020p0.f12058q;
            if (i16 == 1) {
                c3020p0.f12023C.f12096E = !jSONObject8.isNull("typofeed") ? jSONObject8.optInt("typofeed") : 0;
                c3020p0.f12023C.f12098G = !jSONObject8.isNull("cate_bg_promote") ? jSONObject8.optInt("cate_bg_promote") : -1;
                c3020p0.f12023C.f12097F = (jSONObject8.isNull("typofeed_info") || jSONObject8.optJSONObject("typofeed_info") == null) ? null : new C3013n3(jSONObject8.optJSONObject("typofeed_info"));
                if (c3020p0.m14486Q()) {
                    c3020p0.m14538z0(m108779Q(jSONObject8, "caption"));
                }
            } else if (i16 == 2) {
                if (jSONObject8.has("photo")) {
                    JSONObject jSONObject9 = jSONObject8.getJSONObject("photo");
                    ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
                    itemAlbumMobile.f42593q = c3020p0.f12022B.f12280b;
                    itemAlbumMobile.f42595r = m108779Q(jSONObject9, "photoid");
                    itemAlbumMobile.f42548C = m108779Q(jSONObject9, "thumb");
                    itemAlbumMobile.f42607x = m108779Q(jSONObject9, "origin");
                    itemAlbumMobile.f42556G = c3020p0.f12023C.f12110a.toString();
                    c3020p0.f12023C.f12118i.add(itemAlbumMobile);
                    if (jSONObject8.has("photo_dimension")) {
                        JSONObject jSONObject10 = jSONObject8.getJSONObject("photo_dimension");
                        c3020p0.f12023C.f12119j = new C23307g(m108775O(jSONObject10, "width"), m108775O(jSONObject10, "height"));
                    }
                }
                c3020p0.f12023C.f12096E = !jSONObject8.isNull("typofeed") ? jSONObject8.getInt("typofeed") : 0;
                if (jSONObject8.has("song") && (optJSONObject = jSONObject8.optJSONObject("song")) != null) {
                    c3020p0.f12023C.f12108Q = new SongInfo(optJSONObject);
                }
            } else if (i16 == 3) {
                if (jSONObject8.has("photos")) {
                    JSONArray jSONArray3 = jSONObject8.getJSONArray("photos");
                    for (int i17 = 0; i17 < jSONArray3.length(); i17++) {
                        JSONObject jSONObject11 = jSONArray3.getJSONObject(i17);
                        ItemAlbumMobile itemAlbumMobile2 = new ItemAlbumMobile();
                        itemAlbumMobile2.f42593q = c3020p0.f12022B.f12280b;
                        itemAlbumMobile2.f42595r = m108779Q(jSONObject11, "photoid");
                        itemAlbumMobile2.f42548C = m108779Q(jSONObject11, "thumb");
                        itemAlbumMobile2.f42607x = m108779Q(jSONObject11, "origin");
                        itemAlbumMobile2.f42556G = c3020p0.f12023C.f12110a.toString();
                        if (jSONObject11.has("layout")) {
                            JSONObject jSONObject12 = jSONObject11.getJSONObject("layout");
                            itemAlbumMobile2.f42596r0 = jSONObject12 != null ? new ItemAlbumMobile.C7883c(jSONObject12) : null;
                        }
                        c3020p0.f12023C.f12118i.add(itemAlbumMobile2);
                    }
                }
                if (jSONObject8.has("photo_coordinates")) {
                    JSONObject jSONObject13 = jSONObject8.getJSONObject("photo_coordinates");
                    c3020p0.f12023C.f12121l = m108775O(jSONObject13, "width_unit_max");
                    c3020p0.f12023C.f12120k = m108775O(jSONObject13, "height_unit_max");
                    JSONArray jSONArray4 = jSONObject13.getJSONArray("coordinates");
                    int i18 = 0;
                    while (i18 < jSONArray4.length()) {
                        JSONArray jSONArray5 = jSONArray4.getJSONArray(i18);
                        c3020p0.f12023C.f12122m.add(new Rect(jSONArray5.getInt(0), jSONArray5.getInt(1), jSONArray5.getInt(2), jSONArray5.getInt(i12)));
                        i18++;
                        i12 = 3;
                    }
                    if (jSONObject13.has("original_size")) {
                        JSONArray jSONArray6 = jSONObject13.getJSONArray("original_size");
                        for (int i19 = 0; i19 < jSONArray6.length(); i19++) {
                            JSONObject jSONObject14 = jSONArray6.getJSONObject(i19);
                            c3020p0.f12023C.f12128s.add(new C3049v2(jSONObject14.has("photoId") ? jSONObject14.getLong("photoId") : 0L, jSONObject14.has("width") ? jSONObject14.getInt("width") : 0, jSONObject14.has("height") ? jSONObject14.getInt("height") : 0));
                        }
                    }
                }
                c3020p0.f12023C.f12124o = jSONObject8.optInt("more_photo", 0);
                c3020p0.f12023C.f12125p = jSONObject8.optInt("is_change_layout") == 1;
                c3020p0.f12023C.f12096E = !jSONObject8.isNull("typofeed") ? jSONObject8.getInt("typofeed") : 0;
                if (jSONObject8.has("song") && (optJSONObject2 = jSONObject8.optJSONObject("song")) != null) {
                    c3020p0.f12023C.f12108Q = new SongInfo(optJSONObject2);
                }
                if (jSONObject8.has("layout_config")) {
                    c3020p0.f12023C.f12127r = new C18049e(jSONObject8.getJSONObject("layout_config"));
                }
            } else if (i16 != 6) {
                if (i16 != 7) {
                    if (i16 == 17) {
                        JSONObject optJSONObject10 = jSONObject8.optJSONObject("video_dimension");
                        if (optJSONObject10 != null) {
                            c3020p0.f12023C.f12119j = new C23307g(optJSONObject10);
                            C23307g c23307g = c3020p0.f12023C.f12119j;
                            if (c23307g != null && (i13 = c23307g.f113474a) > 0 && (i14 = c23307g.f113475b) > 0) {
                                f11 = i13 / i14;
                                optJSONObject3 = jSONObject8.optJSONObject("video");
                                if (optJSONObject3 != null) {
                                    String m96089h = AbstractC18069a.m96089h(optJSONObject3, "videoid");
                                    String m96089h2 = AbstractC18069a.m96089h(optJSONObject3, "thumb");
                                    String m96089h3 = AbstractC18069a.m96089h(optJSONObject3, "origin");
                                    c3020p0.f12023C.f12093B = new C17391z(m96089h, "", m96089h3, AbstractC18069a.m96089h(optJSONObject3, "hls"), m96089h2, C23278z2.m120136k0().f116260a, false, 9, f11, 1, null, c3020p0.m14465A(), 0);
                                    c3020p0.f12023C.f12093B.f88630m = AbstractC18069a.m96085d(optJSONObject3, "video_auto_play") == 1;
                                    c3020p0.f12023C.f12093B.f88634q = AbstractC18069a.m96089h(optJSONObject3, "media_id");
                                    ItemAlbumMobile itemAlbumMobile3 = new ItemAlbumMobile();
                                    itemAlbumMobile3.f42593q = c3020p0.f12022B.f12280b;
                                    itemAlbumMobile3.f42591p = 2;
                                    if (!"0".equals(m96089h)) {
                                        itemAlbumMobile3.f42595r = m96089h;
                                    }
                                    itemAlbumMobile3.f42548C = m96089h2;
                                    itemAlbumMobile3.f42607x = m96089h3;
                                    itemAlbumMobile3.f42556G = c3020p0.f12023C.f12110a.toString();
                                    c3020p0.f12023C.f12118i.add(itemAlbumMobile3);
                                }
                                optJSONObject4 = jSONObject8.optJSONObject("video_blending_param");
                                if (optJSONObject4 != null) {
                                    c3020p0.f12023C.f12092A = VideoBlendingParam.m48165a(optJSONObject4);
                                }
                                optJSONObject5 = jSONObject8.optJSONObject("local_video_attachment");
                                if (optJSONObject5 != null) {
                                    c3020p0.f12023C.f12094C = new C17391z(optJSONObject5);
                                }
                                c3020p0.f12023C.f12096E = jSONObject8.isNull("typofeed") ? jSONObject8.getInt("typofeed") : 0;
                            }
                        }
                        f11 = 1.0f;
                        optJSONObject3 = jSONObject8.optJSONObject("video");
                        if (optJSONObject3 != null) {
                        }
                        optJSONObject4 = jSONObject8.optJSONObject("video_blending_param");
                        if (optJSONObject4 != null) {
                        }
                        optJSONObject5 = jSONObject8.optJSONObject("local_video_attachment");
                        if (optJSONObject5 != null) {
                        }
                        c3020p0.f12023C.f12096E = jSONObject8.isNull("typofeed") ? jSONObject8.getInt("typofeed") : 0;
                    } else if (i16 == 100) {
                        c3020p0.f12023C.f12135z = new C3025q0.c();
                        c3020p0.f12023C.f12135z.f12155f = m108779Q(jSONObject8, "desc");
                        c3020p0.f12023C.f12135z.f12151b = m108779Q(jSONObject8, "image_original");
                        c3020p0.f12023C.f12135z.f12150a = m108779Q(jSONObject8, "image");
                        c3020p0.f12023C.f12135z.f12154e = m108779Q(jSONObject8, "action");
                        c3020p0.f12023C.f12135z.f12153d = m108779Q(jSONObject8, "extra_info");
                        c3020p0.f12023C.f12135z.f12152c = m108779Q(jSONObject8, "href");
                        c3020p0.f12023C.f12135z.f12157h = m108779Q(jSONObject8, "image_gif");
                        c3020p0.f12023C.f12135z.f12158i = m108779Q(jSONObject8, "btn_action");
                        c3020p0.f12023C.f12135z.f12160k = m108779Q(jSONObject8, "btn_data");
                        c3020p0.f12023C.f12135z.f12161l = m108779Q(jSONObject8, "banner_action");
                        c3020p0.f12023C.f12135z.f12162m = m108779Q(jSONObject8, "banner_data");
                        c3020p0.f12023C.f12135z.f12159j = m108779Q(jSONObject8, "btn_label");
                        c3020p0.f12023C.f12135z.f12165p = m108775O(jSONObject8, "banner_type");
                        c3020p0.f12023C.f12135z.f12163n = m108779Q(jSONObject8, "video_url");
                        c3020p0.f12023C.f12135z.f12164o = m108775O(jSONObject8, "video_auto_play") == 1;
                        c3020p0.f12023C.f12135z.f12169t = m108779Q(jSONObject8, "ZInstantAPIInfo");
                        JSONObject optJSONObject11 = jSONObject8.optJSONObject("dimension");
                        if (optJSONObject11 != null) {
                            c3020p0.f12023C.f12135z.f12166q = new C23307g(optJSONObject11);
                        }
                        JSONObject optJSONObject12 = jSONObject8.optJSONObject("video_dimension");
                        if (optJSONObject12 != null) {
                            c3020p0.f12023C.f12135z.f12167r = new C28227x3(optJSONObject12);
                        }
                        if (!TextUtils.isEmpty(c3020p0.f12023C.f12135z.f12154e)) {
                            C3025q0.c cVar = c3020p0.f12023C.f12135z;
                            cVar.f12154e = cVar.f12154e.toUpperCase();
                        }
                        String m108779Q2 = m108779Q(jSONObject8, "configs");
                        if (!TextUtils.isEmpty(m108779Q2)) {
                            c3020p0.f12023C.f12135z.f12168s = new C3014o(new JSONObject(m108779Q2));
                        }
                    } else if (i16 == 108) {
                        c3020p0.f12023C.f12135z = new C3025q0.c();
                        c3020p0.f12023C.f12135z.f12156g = new ArrayList();
                        JSONArray optJSONArray = jSONObject8.optJSONArray("list_photos");
                        if (optJSONArray != null) {
                            for (int i21 = 0; i21 < optJSONArray.length(); i21++) {
                                JSONObject jSONObject15 = optJSONArray.getJSONObject(i21);
                                C3025q0.d dVar = new C3025q0.d();
                                dVar.f12172c = m108779Q(jSONObject15, "heading");
                                dVar.f12171b = m108779Q(jSONObject15, "slogan");
                                dVar.f12173d = m108779Q(jSONObject15, "info");
                                dVar.f12175f = m108775O(jSONObject15, "adsType");
                                dVar.f12170a = m108779Q(jSONObject15, "adsThumb");
                                dVar.f12176g = m108779Q(jSONObject15, "adsUrl");
                                dVar.f12177h = m108779Q(jSONObject15, "adsAction");
                                dVar.f12178i = m108779Q(jSONObject15, "adsData");
                                dVar.f12179j = m108779Q(jSONObject15, "btnAction");
                                dVar.f12180k = m108779Q(jSONObject15, "btnLabel");
                                dVar.f12181l = m108779Q(jSONObject15, "btnData");
                                dVar.f12183n = m108775O(jSONObject15, "btnType");
                                dVar.f12182m = m108779Q(jSONObject15, "btnIconUrl");
                                dVar.f12188s = jSONObject15.optString("headerAction", "");
                                dVar.f12189t = jSONObject15.optString("headerData", "");
                                JSONObject optJSONObject13 = jSONObject15.optJSONObject("track_ads");
                                if (optJSONObject13 != null) {
                                    dVar.f12174e = new C32145v4(optJSONObject13);
                                }
                                JSONObject optJSONObject14 = jSONObject8.optJSONObject("dimension");
                                if (optJSONObject14 != null) {
                                    dVar.f12184o = new C23307g(optJSONObject14);
                                }
                                c3020p0.f12023C.f12135z.f12156g.add(dVar);
                                dVar.f12185p = m108775O(jSONObject15, "templateId");
                                JSONArray optJSONArray2 = jSONObject15.optJSONArray("listInfo");
                                if (optJSONArray2 != null) {
                                    for (int i22 = 0; i22 < optJSONArray2.length(); i22++) {
                                        JSONObject jSONObject16 = optJSONArray2.getJSONObject(i22);
                                        dVar.f12186q.add(new C3025q0.a(jSONObject16.optString("text"), jSONObject16.optString("icon")));
                                    }
                                }
                                JSONObject optJSONObject15 = jSONObject15.optJSONObject("imageInfo");
                                if (optJSONObject15 != null) {
                                    dVar.f12187r = new C3025q0.a(optJSONObject15.optString("text"), optJSONObject15.optString("icon"));
                                }
                            }
                        }
                    } else {
                        if (i16 != 109) {
                            switch (i16) {
                                case 21:
                                    c3020p0.f12023C.f12099H = new C3024q(jSONObject8.optJSONObject("info"));
                                    break;
                                case 22:
                                    if (jSONObject8.has("feed_memory_id")) {
                                        c3020p0.f12023C.f12101J = jSONObject8.optString("feed_memory_id");
                                    }
                                    if (jSONObject8.has("feed_memory_type")) {
                                        c3020p0.f12023C.f12102K = jSONObject8.optInt("feed_memory_type");
                                    }
                                    if (jSONObject8.has("ratio_zinstant")) {
                                        c3020p0.f12023C.f12103L = jSONObject8.optDouble("ratio_zinstant");
                                    }
                                    if (jSONObject8.has("zinstant_feed_info")) {
                                        try {
                                            JSONObject optJSONObject16 = jSONObject8.optJSONObject("zinstant_feed_info");
                                            if (optJSONObject16 != null) {
                                                c3020p0.f12023C.f12104M = new C17244x0(31, optJSONObject16);
                                            }
                                        } catch (Exception e13) {
                                            e13.printStackTrace();
                                        }
                                    }
                                    if (jSONObject8.has("is_valid_content")) {
                                        c3020p0.f12023C.f12105N = jSONObject8.optInt("is_valid_content") == 1;
                                    }
                                    c3020p0.f12023C.f12096E = !jSONObject8.isNull("typofeed") ? jSONObject8.getInt("typofeed") : 0;
                                    break;
                                case 23:
                                    if (jSONObject8.has("album") && (optJSONObject6 = jSONObject8.optJSONObject("album")) != null) {
                                        c3020p0.f12023C.f12106O = new C2949b(optJSONObject6);
                                        c3020p0.f12023C.f12106O.m13964g(c3020p0.f12022B.f12280b);
                                    }
                                    if (jSONObject8.has("items")) {
                                        C3025q0 c3025q0 = c3020p0.f12023C;
                                        if (c3025q0.f12107P == null) {
                                            c3025q0.f12107P = new ArrayList();
                                        }
                                        JSONArray jSONArray7 = jSONObject8.getJSONArray("items");
                                        for (int i23 = 0; i23 < jSONArray7.length(); i23++) {
                                            JSONObject jSONObject17 = jSONArray7.getJSONObject(i23);
                                            c3020p0.f12023C.f12107P.add(jSONObject17 != null ? new C2954c(jSONObject17) : null);
                                        }
                                    }
                                    JSONObject optJSONObject17 = jSONObject8.optJSONObject("local_video_attachment");
                                    if (optJSONObject17 != null) {
                                        c3020p0.f12023C.f12094C = new C17391z(optJSONObject17);
                                    }
                                    c3020p0.f12023C.f12096E = !jSONObject8.isNull("typofeed") ? jSONObject8.optInt("typofeed") : 0;
                                    break;
                            }
                        } else if (jSONObject8.has("zinstant_feed_ads_info")) {
                            try {
                                JSONObject optJSONObject18 = jSONObject8.optJSONObject("zinstant_feed_ads_info");
                                if (optJSONObject18 != null) {
                                    c3020p0.f12023C.f12109R = new C17244x0(58, optJSONObject18);
                                }
                            } catch (Exception e14) {
                                AbstractC23350e.m122778h(e14);
                            }
                        }
                        AbstractC20110a.m104539h(e12);
                    }
                }
                c3020p0.f12023C.f12134y = new C3025q0.b();
                c3020p0.f12023C.f12134y.f12138a = m108779Q(jSONObject8, "link_title");
                c3020p0.f12023C.f12134y.f12139b = m108779Q(jSONObject8, "link_image");
                c3020p0.f12023C.f12134y.f12140c = m108779Q(jSONObject8, "link_image_original");
                c3020p0.f12023C.f12134y.f12141d = m108779Q(jSONObject8, "link_href");
                c3020p0.f12023C.f12134y.f12142e = m108779Q(jSONObject8, "link_source");
                c3020p0.f12023C.f12134y.f12143f = m108779Q(jSONObject8, "link_desc");
                JSONObject optJSONObject19 = jSONObject8.optJSONObject("photo_dimension");
                if (optJSONObject19 != null) {
                    c3020p0.f12023C.f12134y.f12147j = new C23307g(optJSONObject19);
                    c3020p0.f12023C.f12134y.f12145h = m108775O(optJSONObject19, "width");
                    c3020p0.f12023C.f12134y.f12146i = m108775O(optJSONObject19, "height");
                    c3020p0.f12023C.f12134y.f12144g = m108775O(optJSONObject19, ZinstantMetaConstant.IMPRESSION_META_TYPE);
                }
                JSONObject optJSONObject20 = jSONObject8.optJSONObject("link_media");
                if (optJSONObject20 != null) {
                    c3020p0.f12023C.f12134y.f12149l = new C31869c6(optJSONObject20);
                    C3025q0 c3025q02 = c3020p0.f12023C;
                    C3025q0.b bVar = c3025q02.f12134y;
                    C31869c6 c31869c6 = bVar.f12149l;
                    C32107s8 c32107s8 = c31869c6.f146358d;
                    if (c32107s8 != null) {
                        c32107s8.f148013c = bVar.f12142e;
                    }
                    c3025q02.f12119j = c31869c6.f146362h;
                }
                String m106804a = AbstractC20550a.m106804a(c3020p0.f12023C.f12134y.f12141d);
                if (!TextUtils.isEmpty(m106804a)) {
                    c3020p0.f12023C.f12134y.f12148k = m106804a;
                }
                c3020p0.f12023C.f12096E = !jSONObject8.isNull("typofeed") ? jSONObject8.getInt("typofeed") : 0;
                if (!jSONObject8.isNull("zvideo_info")) {
                    c3020p0.f12023C.f12100I = new C3023p3(jSONObject8.getJSONObject("zvideo_info"));
                    C3025q0 c3025q03 = c3020p0.f12023C;
                    c3025q03.f12093B = m108839v(c3025q03.f12100I, c3020p0.f12057p, c3020p0.m14465A());
                }
            } else {
                c3020p0.f12023C.f12130u = m108779Q(jSONObject8, "thumb");
                c3020p0.f12023C.f12131v = m108779Q(jSONObject8, "origin");
                c3020p0.f12023C.f12132w = !jSONObject8.isNull("stickerId") ? m108775O(jSONObject8, "stickerId") : -1;
                c3020p0.f12023C.f12133x = !jSONObject8.isNull("cateId") ? m108775O(jSONObject8, "cateId") : -1;
                c3020p0.f12023C.f12096E = !jSONObject8.isNull("typofeed") ? jSONObject8.getInt("typofeed") : 0;
            }
            if (jSONObject8.has("edit")) {
                c3020p0.f12023C.f12126q = jSONObject8.optInt("edit") == 1;
            }
        }
        return c3020p0;
    }

    /* renamed from: D */
    public static int m108753D() {
        return AbstractC23309i.m120996H0();
    }

    /* renamed from: D0 */
    public static Map m108754D0(JSONArray jSONArray) {
        ArrayMap arrayMap = new ArrayMap();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                if (jSONObject != null) {
                    String m108779Q = m108779Q(jSONObject, "feedId");
                    boolean m108773N = m108773N(jSONObject, "inQueue");
                    boolean m108773N2 = m108773N(jSONObject, "showOnTimeline");
                    JSONArray m96090i = AbstractC18069a.m96090i(jSONObject, "suggests");
                    List arrayList = new ArrayList();
                    if (m96090i != null) {
                        arrayList = m108756E0(m96090i);
                    }
                    if (!TextUtils.isEmpty(m108779Q)) {
                        C2976g1 c2976g1 = new C2976g1();
                        c2976g1.m14121i(m108779Q);
                        c2976g1.m14122j(m108773N);
                        c2976g1.m14124l(arrayList);
                        c2976g1.m14125m(System.currentTimeMillis());
                        c2976g1.m14123k(m108773N2);
                        arrayMap.put(m108779Q, c2976g1);
                    }
                }
            } catch (JSONException e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        return arrayMap;
    }

    /* renamed from: E */
    public static Object m108755E() {
        boolean z11;
        try {
            C2972f2 m108783S = m108783S();
            boolean z12 = false;
            if (m108783S != null && m108783S.m14062a() && !m108783S.m14063b() && !m108783S.m14064c() && !m108783S.m14065d()) {
                z11 = true;
            } else {
                z11 = false;
            }
            C2973f3 m108798a0 = m108798a0();
            if (m108798a0 != null && !m108798a0.m14071d() && !m108798a0.m14070c()) {
                z12 = true;
            }
            if (z11 && z12) {
                if (Math.max(m108783S.f11752j, m108798a0.m14069b()) == m108783S.f11752j) {
                    return m108783S;
                }
                return m108798a0;
            }
            if (z11) {
                return m108783S;
            }
            if (z12) {
                return m108798a0;
            }
            return null;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: E0 */
    public static List m108756E0(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                try {
                    arrayList.add(m108760G0(jSONArray.getJSONObject(i11)));
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: F */
    public static C28209v3 m108757F(C3000l0 c3000l0) {
        ArrayList arrayList;
        if (c3000l0 != null) {
            try {
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (c3000l0.m14322a0() != null) {
                C3020p0 m14322a0 = c3000l0.m14322a0();
                ArrayList m14531w = m14322a0.m14531w(true, false);
                Collections.sort(m14531w, new Comparator() { // from class: is.t0
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int m108844x0;
                        m108844x0 = AbstractC20826v0.m108844x0((C31873ca) obj, (C31873ca) obj2);
                        return m108844x0;
                    }
                });
                Iterator it = m14531w.iterator();
                while (it.hasNext()) {
                    C31873ca c31873ca = (C31873ca) it.next();
                    if (c31873ca != null && (arrayList = c31873ca.f146378c) != null && !arrayList.isEmpty() && c31873ca.f146376a >= 0 && c31873ca.f146377b <= m14322a0.m14528u().length()) {
                        Iterator it2 = c31873ca.f146378c.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            if (next instanceof C23672c) {
                                return new C28209v3(true, ((C23672c) next).f114678g0, 0);
                            }
                        }
                    }
                }
                return new C28209v3(false, null, -1);
            }
        }
        return null;
    }

    /* renamed from: F0 */
    public static List m108758F0(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                if (jSONObject != null) {
                    C3030r0 c3030r0 = new C3030r0(1);
                    c3030r0.f12206d = m108779Q(jSONObject, "avt");
                    c3030r0.f12205c = m108779Q(jSONObject, "dpn");
                    c3030r0.f12208f = m108777P(jSONObject, "cts");
                    c3030r0.f12209g = m108779Q(jSONObject, "uid");
                    c3030r0.f12207e = m108779Q(jSONObject, "comment");
                    c3030r0.f12210h = m108779Q(jSONObject, "comment_id");
                    int m108775O = m108775O(jSONObject, ZinstantMetaConstant.IMPRESSION_META_TYPE);
                    c3030r0.f12211i = m108775O;
                    if (m108775O == 1) {
                        c3030r0.f12212j = m108775O(jSONObject, "stickerId");
                        c3030r0.f12213k = m108775O(jSONObject, "cateId");
                        c3030r0.f12214l = m108779Q(jSONObject, "thumb");
                    }
                    arrayList.add(c3030r0);
                }
            }
        } catch (JSONException e11) {
            AbstractC20110a.m104539h(e11);
        }
        return arrayList;
    }

    /* renamed from: G */
    public static CharSequence m108759G(C3020p0 c3020p0) {
        int i11;
        C3025q0 c3025q0;
        if (c3020p0 == null) {
            return "";
        }
        if (c3020p0.f12058q == 23 && (c3025q0 = c3020p0.f12023C) != null && c3025q0.m14569f() && c3020p0.m14465A().equals(CoreUtility.f89233i)) {
            String m13962e = c3020p0.f12023C.f12106O.m13962e();
            if (c3020p0.f12023C.m14567d()) {
                return Html.fromHtml(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_ask_delete_feed_album_photo_v2), m13962e));
            }
            if (!c3020p0.f12023C.m14568e()) {
                return "";
            }
            return Html.fromHtml(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_ask_delete_feed_album_video_v2), m13962e));
        }
        if (c3020p0.m14494Y()) {
            if (c3020p0.m14485P()) {
                i11 = AbstractC8020f0.str_delete_feed_confirm_v2;
            } else {
                i11 = AbstractC8020f0.str_bottom_sheet_menu_delete_activity_title;
            }
            return AbstractC23136l9.m118743r0(i11);
        }
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_feed_item_option_item_delete_title);
    }

    /* renamed from: G0 */
    public static C2988i3 m108760G0(JSONObject jSONObject) {
        C2988i3 c2988i3 = new C2988i3();
        if (jSONObject != null) {
            try {
                int m108775O = m108775O(jSONObject, ZinstantMetaConstant.IMPRESSION_META_TYPE);
                c2988i3.m14169h(m108775O);
                JSONObject m96091j = AbstractC18069a.m96091j(jSONObject, "content");
                if (m96091j != null) {
                    if (m108775O != 1) {
                        if (m108775O == 2) {
                            int m108775O2 = m108775O(m96091j, "stickerId");
                            int m108775O3 = m108775O(m96091j, "cateId");
                            String m108779Q = m108779Q(m96091j, "thumb");
                            C25630b c25630b = new C25630b();
                            c25630b.m132405O(m108775O2);
                            c25630b.m132404N(m108775O3);
                            c25630b.m132414X(m108775O3);
                            c25630b.m132424d0(m108779Q);
                            c2988i3.m14168g(c25630b);
                        }
                    } else {
                        c2988i3.m14167f(m108779Q(m96091j, "text"));
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        return c2988i3;
    }

    /* renamed from: H */
    public static String m108761H(String str, String str2) {
        if (CoreUtility.f89233i.equals(str)) {
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42437s)) {
                return AbstractC23304d.f113368c0.f42437s;
            }
            ContactProfile m141811g = C28203u6.f131407a.m141811g(str);
            if (m141811g != null) {
                return m141811g.f42437s;
            }
        }
        return str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.regex.Pattern] */
    /* renamed from: H0 */
    public static CharSequence m108762H0(InterfaceC27218a interfaceC27218a, String str) {
        String str2;
        try {
            str = AbstractC23244v8.m119747k(str.replaceAll("(\r\n|\n)", "<br/>"));
            try {
                Matcher matcher = Pattern.compile("(?i)\\b((?:https?://|www\\d{0,3}[.])[-A-Za-z0-9+&@#/%?=~_()|!:,.;àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ]*[-A-Za-z0-9+&@#/%=~_()|àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ])", 42).matcher(str);
                str = str;
                if (matcher.find()) {
                    if (str.contains("<a href=\"http")) {
                        str = str;
                    } else if (matcher.group().startsWith("https://")) {
                        str = matcher.replaceAll("<a href=\"$1\">$1</a>");
                    } else if (matcher.group().startsWith("http://")) {
                        str = matcher.replaceAll("<a href=\"$1\">$1</a>");
                    } else {
                        str = matcher.replaceAll("<a href=\"http://$1\">$1</a>");
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            try {
                Matcher matcher2 = Pattern.compile("<a[^>]*>(.*?)</a>", 34).matcher(str);
                while (matcher2.find()) {
                    ?? group = matcher2.group(0);
                    if (group.startsWith("<a href=\"zm://Profile/")) {
                        Matcher matcher3 = Pattern.compile("<a[^>]*?href\\s*=\\s*(('|\")(.*?)('|\"))[^>]*?(?!/)>", 34).matcher(group);
                        String str3 = "";
                        if (matcher3.find()) {
                            String replace = matcher3.group(1).replace("\"", "");
                            str3 = replace.substring(replace.lastIndexOf("/") + 1);
                        }
                        String group2 = matcher2.group(1);
                        String m114542i = AbstractC21935u.m114542i(str3, group2);
                        if (!group2.equals(m114542i)) {
                            str2 = group.replace(group2, m114542i);
                        } else {
                            str2 = group;
                        }
                        if (str.contains(group) && !group.equals(str2)) {
                            str = str.replace(group, str2);
                        }
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            Spanned fromHtml = Html.fromHtml(Pattern.compile("<(?![ab/])").matcher(str).replaceAll("&lt;"));
            SpannableString spannableString = new SpannableString(fromHtml.toString());
            Object[] spans = fromHtml.getSpans(0, fromHtml.length(), Object.class);
            if (spans.length > 0) {
                for (Object obj : spans) {
                    int spanStart = fromHtml.getSpanStart(obj);
                    int spanEnd = fromHtml.getSpanEnd(obj);
                    int spanFlags = fromHtml.getSpanFlags(obj);
                    if (obj instanceof URLSpan) {
                        C10866e c10866e = new C10866e(((URLSpan) obj).getURL(), spanStart, spanEnd);
                        c10866e.m56366J(true);
                        c10866e.m56365I(interfaceC27218a);
                        spannableString.setSpan(c10866e, spanStart, spanEnd, spanFlags);
                    }
                }
                return spannableString;
            }
            return str.replaceAll("<br/>", "\n");
        } catch (Exception e13) {
            e13.printStackTrace();
            return str;
        }
    }

    /* renamed from: I */
    private static int m108763I(boolean z11, boolean z12) {
        if (z11) {
            return -1;
        }
        return z12 ? -2 : 0;
    }

    /* renamed from: I0 */
    public static boolean m108764I0() {
        try {
            if (C28023b6.m141250h0().f130687e == 2) {
                if (Settings.Global.getInt(MainApplication.getAppContext().getContentResolver(), "zen_mode") != 0) {
                    return false;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return true;
    }

    /* renamed from: J */
    public static String m108765J(int i11) {
        JSONArray jSONArray = new JSONArray();
        if (i11 == 1) {
            try {
                jSONArray.put(7);
                jSONArray.put(19);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    /* renamed from: J0 */
    public static void m108766J0(C3020p0 c3020p0, C3020p0 c3020p02) {
        C2964e c2964e;
        if (c3020p0.f12023C.f12107P != null && c3020p02.f12023C.f12107P != null) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = c3020p0.f12023C.f12118i;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) it.next();
                    if (!itemAlbumMobile.f42611z.isEmpty() && !itemAlbumMobile.f42550D.isEmpty()) {
                        hashMap.put(itemAlbumMobile.f42595r, itemAlbumMobile.f42550D);
                    }
                }
            }
            C3025q0 c3025q0 = c3020p0.f12023C;
            C3025q0 c3025q02 = c3020p02.f12023C;
            c3025q0.f12107P = c3025q02.f12107P;
            c3025q0.f12124o = c3025q02.f12124o;
            for (int i11 = 0; i11 < c3020p0.f12023C.f12107P.size(); i11++) {
                if ((((C2954c) c3020p0.f12023C.f12107P.get(i11)).m13986a() instanceof C2964e) && (c2964e = (C2964e) ((C2954c) c3020p0.f12023C.f12107P.get(i11)).m13986a()) != null) {
                    String valueOf = String.valueOf(c2964e.m14027j());
                    AbstractC2959d m13986a = ((C2954c) c3020p0.f12023C.f12107P.get(i11)).m13986a();
                    String str = (String) hashMap.get(valueOf);
                    if (str != null && m13986a != null) {
                        m13986a.m14017h(str);
                    }
                }
            }
        }
    }

    /* renamed from: K */
    private static int m108767K(C32002l4 c32002l4) {
        int i11;
        if (c32002l4 == null) {
            return 0;
        }
        try {
            if (c32002l4.m154280q() != null) {
                i11 = c32002l4.m154280q().m154207g();
            } else {
                i11 = 0;
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        if (i11 == 10002) {
            return 1;
        }
        if (i11 != 10004 && i11 != 10007) {
            return 0;
        }
        return 2;
    }

    /* renamed from: K0 */
    public static void m108768K0(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C0824j.m2153b(new f(str));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: L */
    public static List m108769L(long j11, List list) {
        List list2;
        ArrayList arrayList = new ArrayList();
        if (j11 != 0) {
            try {
                if (list.size() > 0) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C3000l0 c3000l0 = (C3000l0) it.next();
                        if (c3000l0 != null && (list2 = c3000l0.f11899s) != null && list2.size() > 0) {
                            for (int i11 = 0; i11 < c3000l0.f11899s.size(); i11++) {
                                C3020p0 c3020p0 = (C3020p0) c3000l0.f11899s.get(i11);
                                if (c3020p0 != null && c3020p0.m14504e0() && c3020p0.f12023C.f12106O.m13958a() == j11) {
                                    arrayList.add(c3020p0);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return arrayList;
    }

    /* renamed from: L0 */
    public static void m108770L0(boolean z11) {
        C20834z0.f102412a.m108928g(z11);
    }

    /* renamed from: M */
    public static String m108771M(int i11) {
        if (i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                if (i11 != 6) {
                    if (i11 != 7) {
                        if (i11 != 17) {
                            if (i11 != 24) {
                                return "";
                            }
                        } else {
                            return MainApplication.getAppContext().getString(AbstractC8020f0.str_share_video);
                        }
                    }
                    return MainApplication.getAppContext().getString(AbstractC8020f0.str_share_link);
                }
                return MainApplication.getAppContext().getString(AbstractC8020f0.str_share_sticker);
            }
            return MainApplication.getAppContext().getString(AbstractC8020f0.str_share_photo);
        }
        return MainApplication.getAppContext().getString(AbstractC8020f0.profile_changestatus);
    }

    /* renamed from: M0 */
    public static void m108772M0() {
        C2972f2 m108783S = m108783S();
        if (m108783S != null && !m108783S.f11754l) {
            m108783S.f11754l = true;
            AbstractC23309i.m120803Bt(m108783S.m14067f());
        }
    }

    /* renamed from: N */
    public static boolean m108773N(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getBoolean(str);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: N0 */
    public static void m108774N0() {
        try {
            C2973f3 m108798a0 = m108798a0();
            if (m108798a0 != null && !m108798a0.m14071d()) {
                m108798a0.m14073f(true);
                AbstractC0924m0.m3032Eo(m108798a0.m14074g());
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: O */
    public static int m108775O(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: O0 */
    public static void m108776O0() {
        try {
            C2973f3 m108798a0 = m108798a0();
            if (m108798a0 != null && !m108798a0.m14070c()) {
                m108798a0.m14072e(true);
                AbstractC0924m0.m3032Eo(m108798a0.m14074g());
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: P */
    public static long m108777P(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getLong(str);
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* renamed from: P0 */
    public static void m108778P0() {
        C2972f2 m108783S = m108783S();
        if (m108783S != null && !m108783S.f11755m) {
            m108783S.f11755m = true;
            AbstractC23309i.m120803Bt(m108783S.m14067f());
        }
    }

    /* renamed from: Q */
    public static String m108779Q(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getString(str).trim();
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: Q0 */
    public static void m108780Q0(RecyclerView recyclerView) {
        recyclerView.m9825D(new g());
    }

    /* renamed from: R */
    public static C31890dc m108781R(Context context) {
        try {
            String[] split = AbstractC23309i.m122271p5().split("_");
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            C31890dc c31890dc = new C31890dc(parseInt);
            c31890dc.f146509o = parseInt2;
            return c31890dc;
        } catch (Exception e11) {
            e11.printStackTrace();
            return C31845ac.m152996J().m153020A();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: R0 */
    public static boolean m108782R0(ZaloView zaloView) {
        if (zaloView instanceof InterfaceC28702e) {
            return ((InterfaceC28702e) zaloView).mo67148iH();
        }
        return !(zaloView instanceof ProgressDialogView);
    }

    /* renamed from: S */
    public static C2972f2 m108783S() {
        try {
            if (!TextUtils.isEmpty(AbstractC23309i.m121522V8())) {
                return new C2972f2(new JSONObject(AbstractC23309i.m121522V8()));
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: S0 */
    public static boolean m108784S0(ZaloView zaloView) {
        if (zaloView instanceof InterfaceC28702e) {
            return ((InterfaceC28702e) zaloView).mo67148iH();
        }
        return !(zaloView instanceof ProgressDialogView);
    }

    /* renamed from: T */
    public static String m108785T() {
        try {
            C2972f2 m108783S = m108783S();
            if (m108783S != null && m108783S.m14062a() && !m108783S.m14063b() && !m108783S.m14064c() && !m108783S.m14065d()) {
                String str = AbstractC18458a.f93019a;
                if (!str.equals("en") && !str.equals("my")) {
                    return m108783S.f11745c;
                }
                return m108783S.f11746d;
            }
            return "";
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: T0 */
    public static Snackbar m108786T0(View view, String str, int i11) {
        if (view != null && !TextUtils.isEmpty(str)) {
            Snackbar m90634w = Snackbar.m90634w(view, str, i11);
            m90634w.m90644J(C27280g.m139659b(view.getContext(), AbstractC23322a.zds_ic_warning_solid_24, AbstractC2808b.f150839y60));
            m90634w.m90648N();
            return m90634w;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C17391z m108787U(C3020p0 c3020p0, int i11) {
        C3025q0 c3025q0;
        ArrayList arrayList;
        C2954c c2954c;
        float f11;
        C17391z c17391z;
        if (c3020p0 != null && (c3025q0 = c3020p0.f12023C) != null && (arrayList = c3025q0.f12107P) != null && i11 < arrayList.size() && (c2954c = (C2954c) c3020p0.f12023C.f12107P.get(i11)) != null) {
            boolean z11 = true;
            if (c2954c.m13988c() == 1 && c2954c.m13986a() != null) {
                AbstractC2959d m13986a = c2954c.m13986a();
                if (m13986a instanceof C2969f) {
                    C2969f c2969f = (C2969f) m13986a;
                    if (c2969f.m14010a() != null) {
                        int i12 = c2969f.m14010a().f131648a;
                        int i13 = c2969f.m14010a().f131649b;
                        if (i12 > 0 && i13 > 0) {
                            f11 = i12 / (i13 * 1.0f);
                            c17391z = new C17391z(String.valueOf(c2969f.m14049m()), "", c2969f.m14011b(), c2969f.m14046j(), c2969f.m14012c(), C23278z2.m120136k0().f116260a, false, 9, f11, 1, null, c3020p0.m14465A(), 0);
                            if (c2969f.m14048l() != 1) {
                                z11 = false;
                            }
                            c17391z.f88630m = z11;
                            c17391z.f88634q = c2969f.m14047k();
                            if (TextUtils.isEmpty(c17391z.f88620c) || !TextUtils.isEmpty(c17391z.f88621d)) {
                                if (c3020p0.f12023C.f12094C != null) {
                                    C25476i.m131959d(new d(c3020p0));
                                }
                                return c17391z;
                            }
                        }
                    }
                    f11 = 1.0f;
                    c17391z = new C17391z(String.valueOf(c2969f.m14049m()), "", c2969f.m14011b(), c2969f.m14046j(), c2969f.m14012c(), C23278z2.m120136k0().f116260a, false, 9, f11, 1, null, c3020p0.m14465A(), 0);
                    if (c2969f.m14048l() != 1) {
                    }
                    c17391z.f88630m = z11;
                    c17391z.f88634q = c2969f.m14047k();
                    if (TextUtils.isEmpty(c17391z.f88620c)) {
                    }
                    if (c3020p0.f12023C.f12094C != null) {
                    }
                    return c17391z;
                }
                return c3020p0.f12023C.f12094C;
            }
            return null;
        }
        return null;
    }

    /* renamed from: U0 */
    public static C3000l0 m108788U0(C3000l0 c3000l0) {
        C3020p0 c3020p0;
        if (c3000l0 != null) {
            c3020p0 = c3000l0.m14322a0();
        } else {
            c3020p0 = null;
        }
        if (c3020p0 != null && c3000l0.f11893p == 0 && c3020p0.m14514k0() && c3000l0.m14373x0()) {
            C3000l0 m108750B0 = m108750B0(m108827p(c3000l0));
            m108750B0.f11903u = c3000l0.f11903u;
            m108750B0.m14282A1(c3000l0.m14339j0());
            if (m108750B0.m14322a0() != null) {
                m108750B0.m14322a0().f12058q = 23;
                m108750B0.m14322a0().f12027G = true;
                if (m108750B0.m14322a0().f12023C != null) {
                    m108750B0.m14322a0().f12023C.f12106O = c3000l0.f11889l0;
                    m108750B0.m14322a0().f12023C.f12107P = c3000l0.f11890m0;
                }
            }
            return m108750B0;
        }
        return c3000l0;
    }

    /* renamed from: V */
    public static C17391z m108789V(C3020p0 c3020p0) {
        C3025q0 c3025q0;
        if (c3020p0 != null && (c3025q0 = c3020p0.f12023C) != null) {
            C17391z c17391z = c3025q0.f12093B;
            if (c17391z != null && (!TextUtils.isEmpty(c17391z.f88620c) || !TextUtils.isEmpty(c17391z.f88621d))) {
                if (c3020p0.f12023C.f12094C != null) {
                    C25476i.m131959d(new c(c3020p0));
                }
                return c17391z;
            }
            return c3020p0.f12023C.f12094C;
        }
        return null;
    }

    /* renamed from: V0 */
    public static void m108790V0() {
        try {
            if (AbstractC23309i.m121867eg()) {
                if (AbstractC2361n.m12356c(MainApplication.getAppContext())) {
                    return;
                }
            } else if (!m108764I0()) {
                return;
            }
            AudioManager audioManager = (AudioManager) MainApplication.getAppContext().getSystemService("audio");
            int ringerMode = audioManager.getRingerMode();
            if (ringerMode == 1) {
                C23081g9.m118412j(20L);
                return;
            }
            if (ringerMode == 2) {
                boolean m40137k0 = C7853b.m40052a0().m40137k0();
                boolean isMusicActive = audioManager.isMusicActive();
                if (!m40137k0 && !isMusicActive) {
                    C23081g9.m118412j(20L);
                    C7853b.m40052a0().m40095J0();
                    return;
                }
                C23081g9.m118412j(20L);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: W */
    public static String m108791W(JSONArray jSONArray) {
        if (jSONArray == null) {
            return "";
        }
        try {
            return jSONArray.optString(new Random().nextInt(jSONArray.length()));
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: W0 */
    public static List m108792W0(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ContactProfile contactProfile = (ContactProfile) it.next();
                if (contactProfile != null) {
                    ContactProfile m141811g = C28203u6.f131407a.m141811g(contactProfile.f42434r);
                    if (m141811g != null) {
                        contactProfile = m141811g;
                    }
                    arrayList.add(contactProfile);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: X */
    public static Rect m108793X(View view) {
        try {
            int left = view.getLeft();
            int top = view.getTop();
            View rootView = view.getRootView();
            if (rootView != null) {
                int[] iArr = new int[2];
                rootView.getLocationOnScreen(iArr);
                left += iArr[0];
                top += iArr[1];
            }
            return new Rect(left, top, view.getMeasuredWidth() + left, view.getMeasuredHeight() + top);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: X0 */
    public static void m108794X0(C3020p0 c3020p0, C3020p0 c3020p02) {
        if (c3020p0 != null && c3020p02 != null) {
            try {
                System.currentTimeMillis();
                C3025q0 c3025q0 = c3020p02.f12023C;
                C3025q0 c3025q02 = c3020p0.f12023C;
                c3025q0.f12094C = c3025q02.f12093B;
                c3025q0.f12092A = c3025q02.f12092A;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: Y */
    public static Rect m108795Y(C16719g c16719g) {
        try {
            int m89096G = c16719g.m89096G();
            int m89098H = c16719g.m89098H();
            ViewGroup m89119T = c16719g.m89119T();
            if (m89119T != null) {
                int[] iArr = new int[2];
                m89119T.getLocationOnScreen(iArr);
                m89096G += iArr[0];
                m89098H += iArr[1];
            }
            return new Rect(m89096G, m89098H, c16719g.m89114P() + m89096G, c16719g.m89112O() + m89098H);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: Z */
    public static JSONObject m108796Z(C17244x0 c17244x0) {
        InterfaceC22508f interfaceC22508f;
        try {
            JSONObject jSONObject = new JSONObject();
            if (c17244x0 != null) {
                interfaceC22508f = c17244x0.m92064b();
            } else {
                interfaceC22508f = null;
            }
            if (interfaceC22508f instanceof C22505c) {
                jSONObject.put(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, ((C22505c) interfaceC22508f).f110141a);
                jSONObject.put("zinstantdata_id", ((C22505c) interfaceC22508f).f110142b);
            }
            return jSONObject;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: a0 */
    public static C2973f3 m108798a0() {
        try {
            String m3593Y5 = AbstractC0924m0.m3593Y5();
            if (!TextUtils.isEmpty(m3593Y5)) {
                return C2973f3.m14068a(new JSONObject(m3593Y5));
            }
            return null;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: b0 */
    public static TrackingSource m108800b0(C31877d c31877d, String str) {
        TrackingSource trackingSource;
        if (c31877d != null && (trackingSource = c31877d.f146415a) != null) {
            if (trackingSource.m40683t() == 16) {
                TrackingSource trackingSource2 = new TrackingSource(24);
                trackingSource2.m40677a(ZinstantMetaConstant.IMPRESSION_META_TYPE, Integer.valueOf(m108767K(c31877d.f146420f)));
                return trackingSource2;
            }
            if (c31877d.f146415a.m40683t() == 224) {
                TrackingSource trackingSource3 = new TrackingSource(17);
                m108748A0(trackingSource3, str);
                return trackingSource3;
            }
            if (m108840v0(c31877d.f146415a.m40683t())) {
                return c31877d.f146415a;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static void m108801c(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        AbstractC23647d.m123897g("4915505");
                        return;
                    }
                    return;
                }
                AbstractC23647d.m123897g("4915503");
                return;
            }
            AbstractC23647d.m123897g("4915502");
            return;
        }
        AbstractC23647d.m123897g("4915500");
    }

    /* renamed from: c0 */
    public static TrackingSource m108802c0(JSONObject jSONObject, TrackingSource trackingSource) {
        TrackingSource trackingSource2;
        try {
            if (!jSONObject.has("sourceType") && !jSONObject.has("extraSrcParams")) {
                return trackingSource;
            }
            trackingSource2 = new TrackingSource(jSONObject.optInt("sourceType", 0));
        } catch (Exception e11) {
            e = e11;
        }
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("extraSrcParams");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    trackingSource2.m40677a(next, optJSONObject.get(next));
                }
            }
            return trackingSource2;
        } catch (Exception e12) {
            e = e12;
            trackingSource = trackingSource2;
            AbstractC20110a.m104539h(e);
            return trackingSource;
        }
    }

    /* renamed from: d */
    public static void m108803d(String str) {
        int i11;
        C3000l0 m137785c = C26767v.m137782d().m137785c(str);
        if (m137785c != null) {
            if (m108845y(m137785c.f11892o0, str).f11953d) {
                i11 = 2;
            } else {
                i11 = 3;
            }
            m108801c(i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:6:0x0003, B:8:0x0009, B:9:0x000d, B:11:0x0013, B:14:0x001b, B:16:0x0022, B:20:0x003c, B:22:0x0042, B:24:0x0048, B:36:0x002d, B:38:0x0033), top: B:5:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057 A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m108804d0(String str, List list) {
        boolean z11;
        boolean z12;
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C3000l0 c3000l0 = (C3000l0) it.next();
                        if (c3000l0 != null) {
                            C3020p0 m14322a0 = c3000l0.m14322a0();
                            if (m14322a0 != null) {
                                if (m14322a0.f12058q != 100) {
                                }
                                z11 = true;
                                if (!c3000l0.m14285C0() && !c3000l0.m14297H0() && !TextUtils.equals(str, c3000l0.f11895q)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z11 || z12) {
                                    return true;
                                }
                            }
                            if ((m14322a0 == null || m14322a0.m14490U()) && c3000l0.f11893p != 1002) {
                                z11 = false;
                                if (!c3000l0.m14285C0()) {
                                }
                                z12 = false;
                                if (z11) {
                                }
                                return true;
                            }
                            z11 = true;
                            if (!c3000l0.m14285C0()) {
                            }
                            z12 = false;
                            if (z11) {
                            }
                            return true;
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: e */
    public static void m108805e(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        String m122419t5 = AbstractC23309i.m122419t5();
        if (!TextUtils.isEmpty(m122419t5)) {
            String[] split = m122419t5.split(",");
            int min = Math.min(split.length, 1);
            for (int i11 = 0; i11 < min; i11++) {
                sb2.append(",");
                sb2.append(split[i11]);
            }
        }
        AbstractC23309i.m121354Qp(sb2.toString());
    }

    /* renamed from: e0 */
    public static void m108806e0(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String m120921F = AbstractC23309i.m120921F();
            if (!TextUtils.isEmpty(m120921F)) {
                JSONArray jSONArray = new JSONArray(m120921F);
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    String string = jSONArray.getString(i11);
                    if (!hashMap.containsKey(string)) {
                        arrayList.add(string);
                        hashMap.put(string, string);
                    }
                }
                arrayList.add(str);
                if (arrayList.size() > 50) {
                    arrayList.clear();
                    arrayList.add(str);
                }
                JSONArray jSONArray2 = new JSONArray();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    jSONArray2.put(arrayList.get(i12));
                }
                AbstractC23309i.m121161Lh(jSONArray2.toString());
                return;
            }
            JSONArray jSONArray3 = new JSONArray();
            jSONArray3.put(str);
            AbstractC23309i.m121161Lh(jSONArray3.toString());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public static C16719g.c m108807f(View.OnClickListener onClickListener) {
        return new C16719g.c() { // from class: is.u0

            /* renamed from: p */
            public final /* synthetic */ View.OnClickListener f102349p;

            public /* synthetic */ C20824u0(View.OnClickListener onClickListener2) {
                r1 = onClickListener2;
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                r1.onClick(null);
            }
        };
    }

    /* renamed from: f0 */
    public static boolean m108808f0(int i11) {
        return i11 == -1 || i11 == -2;
    }

    /* renamed from: g */
    public static void m108809g(C3000l0 c3000l0, int i11, int i12, int i13, float f11, C32002l4 c32002l4, int i14) {
        if (c3000l0 == null) {
            return;
        }
        if (c3000l0.f11893p != 2) {
            i11 = 0;
        }
        C3020p0 m14324b0 = c3000l0.m14324b0(i11);
        if (m14324b0 == null) {
            return;
        }
        if (i12 >= i13 * f11) {
            if (c3000l0.f11893p == 1) {
                List list = c3000l0.f11899s;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C26333b.f125013a.m135520p((C3020p0) it.next(), 1, c32002l4, new C20803k(i14, m14324b0.f12057p));
                    }
                    return;
                }
                return;
            }
            C26333b.f125013a.m135520p(m14324b0, 1, c32002l4, new C20803k(i14, m14324b0.f12057p));
            return;
        }
        if (c3000l0.f11893p == 1) {
            List list2 = c3000l0.f11899s;
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    C26333b.f125013a.m135518n(((C3020p0) it2.next()).f12057p, 1);
                }
                return;
            }
            return;
        }
        C26333b.f125013a.m135518n(m14324b0.f12057p, 1);
    }

    /* renamed from: g0 */
    public static boolean m108810g0() {
        if (C13778s1.m76962c() > 1.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static void m108811h(String str, int i11, int i12, int i13, i iVar) {
        String property;
        boolean z11;
        boolean z12;
        try {
            if (!TextUtils.isEmpty(str) && (property = System.getProperty("line.separator")) != null) {
                String[] split = str.split(property, -1);
                StringBuilder sb2 = new StringBuilder();
                int i14 = 1;
                if (str.length() > i12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (split.length > i13) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (split.length > i13) {
                    int i15 = 0;
                    int i16 = -1;
                    while (i15 < i13) {
                        i16 += i14;
                        if (i16 >= split.length) {
                            break;
                        }
                        if (split[i16].replaceAll("\\s+", "").length() != 0) {
                            if (i15 != 0) {
                                sb2.append(property);
                            }
                            sb2.append(split[i16]);
                            i15++;
                        }
                        i14 = 1;
                    }
                } else {
                    sb2.append(str);
                }
                String substring = sb2.substring(0, Math.max(Math.min(sb2.length(), i12), 0));
                if (iVar != null) {
                    iVar.mo44661a(substring, Math.min(i11, substring.length()), m108763I(z11, z12));
                    return;
                }
            }
            if (iVar != null) {
                iVar.mo44661a(str, -1, 0);
            }
        } catch (Exception unused) {
            if (iVar != null) {
                iVar.mo44661a(str, -1, 0);
            }
        }
    }

    /* renamed from: h0 */
    public static boolean m108812h0() {
        try {
            C2972f2 m108783S = m108783S();
            if (m108783S != null && m108783S.m14062a() && !m108783S.m14063b() && !m108783S.m14064c()) {
                return m108783S.f11753k;
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    /* renamed from: i */
    public static void m108813i() {
        C25476i.m131959d(new h());
    }

    /* renamed from: i0 */
    public static boolean m108814i0() {
        try {
            Object m108755E = m108755E();
            if (m108755E instanceof C2972f2) {
                C2972f2 c2972f2 = (C2972f2) m108755E;
                if (c2972f2.m14062a() && !c2972f2.m14063b() && !c2972f2.m14064c()) {
                    return c2972f2.f11753k;
                }
                return false;
            }
            if (m108755E instanceof C2973f3) {
                return true;
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    /* renamed from: j */
    public static void m108815j() {
        C25476i.m131959d(new a());
    }

    /* renamed from: j0 */
    public static boolean m108816j0(C3020p0 c3020p0) {
        if (c3020p0 == null) {
            return false;
        }
        try {
            String m120921F = AbstractC23309i.m120921F();
            if (!TextUtils.isEmpty(m120921F)) {
                JSONArray jSONArray = new JSONArray(m120921F);
                HashSet hashSet = new HashSet();
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    hashSet.add(jSONArray.getString(i11));
                }
                return hashSet.contains(c3020p0.f12057p);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* renamed from: k */
    public static C17244x0 m108817k(C17244x0 c17244x0) {
        JSONObject m92066d;
        InterfaceC22508f interfaceC22508f;
        if (c17244x0 != null) {
            try {
                m92066d = c17244x0.m92066d();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } else {
            m92066d = null;
        }
        if (c17244x0 != null) {
            interfaceC22508f = c17244x0.m92064b();
        } else {
            interfaceC22508f = null;
        }
        if (m92066d != null && interfaceC22508f != null) {
            return new C17244x0(interfaceC22508f.getFeatureType(), m92066d);
        }
        return null;
    }

    /* renamed from: k0 */
    private static boolean m108818k0(JSONObject jSONObject) {
        JSONArray optJSONArray;
        try {
            if (jSONObject.has("pre_check") && (optJSONArray = jSONObject.optJSONArray("pre_check")) != null) {
                if (optJSONArray.length() > 0) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: l */
    public static void m108819l(C3000l0 c3000l0, List list) {
        if (c3000l0 != null && list != null) {
            try {
                String str = c3000l0.m14322a0().f12057p;
                C3000l0 c3000l02 = null;
                int i11 = -1;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    C3000l0 c3000l03 = (C3000l0) list.get(i12);
                    if (c3000l03 != null && c3000l03.f11899s != null) {
                        int i13 = 0;
                        while (true) {
                            if (i13 < c3000l03.f11899s.size()) {
                                C3020p0 c3020p0 = (C3020p0) c3000l03.f11899s.get(i13);
                                if (c3020p0 != null && c3020p0.f12057p.equals(str)) {
                                    i11 = i12;
                                    break;
                                }
                                i13++;
                            } else {
                                i13 = -1;
                                break;
                            }
                        }
                        if (i13 != -1) {
                            c3000l02 = m108750B0(m108827p(c3000l03));
                            if (c3000l03.m14281A0()) {
                                c3000l02.f11899s.remove(i13);
                                C3000l0 c3000l04 = new C3000l0(c3000l0.m14322a0(), c3000l0.m14339j0(), true);
                                c3000l04.f11903u = c3000l0.f11903u;
                                list.add(i11, c3000l04);
                                i11++;
                            } else {
                                long j11 = c3000l02.m14324b0(i13).f12062u;
                                C3000l0 m108750B0 = m108750B0(m108827p(c3000l0));
                                m108750B0.f11903u = c3000l0.f11903u;
                                m108750B0.m14322a0().f12062u = j11;
                                m108750B0.m14322a0().f12027G = c3000l0.m14322a0().f12027G;
                                c3000l02.f11899s.set(i13, m108750B0.m14322a0());
                                c3000l02.f11903u = c3000l0.f11903u;
                                c3000l02.m14282A1(c3000l0.m14339j0());
                            }
                        }
                    }
                    if (i11 != -1) {
                        break;
                    }
                }
                if (i11 != -1 && c3000l02 != null) {
                    list.set(i11, c3000l02);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: l0 */
    private static boolean m108820l0(JSONObject jSONObject) {
        int i11;
        boolean z11 = true;
        try {
            i11 = jSONObject.getInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
        } catch (Exception e11) {
            e = e11;
        }
        if (i11 != 1) {
            try {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            JSONArray jSONArray = jSONObject.getJSONArray("params");
                            for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                                String str = (String) jSONArray.get(i12);
                                if (TextUtils.isEmpty(str) || AbstractC23933a.m125287b(MainApplication.getAppContext(), str, false)) {
                                }
                            }
                            z11 = false;
                        }
                    } else {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("params");
                        for (int i13 = 0; i13 < jSONArray2.length(); i13++) {
                            String str2 = (String) jSONArray2.get(i13);
                            if (!TextUtils.isEmpty(str2) && AbstractC23933a.m125287b(MainApplication.getAppContext(), str2, false)) {
                                z11 = false;
                            }
                        }
                    }
                } else {
                    JSONArray jSONArray3 = jSONObject.getJSONArray("params");
                    for (int i14 = 0; i14 < jSONArray3.length(); i14++) {
                        String str3 = (String) jSONArray3.get(i14);
                        if (TextUtils.isEmpty(str3) || !AbstractC23933a.m125287b(MainApplication.getAppContext(), str3, false)) {
                        }
                    }
                    z11 = false;
                }
            } catch (Exception e12) {
                e = e12;
                z11 = false;
                e.printStackTrace();
                return z11;
            }
            return z11;
        }
        JSONArray jSONArray4 = jSONObject.getJSONArray("params");
        for (int i15 = 0; i15 < jSONArray4.length(); i15++) {
            String str4 = (String) jSONArray4.get(i15);
            if (!TextUtils.isEmpty(str4) && !AbstractC23933a.m125287b(MainApplication.getAppContext(), str4, false)) {
                z11 = false;
            }
        }
        return z11;
        return z11;
    }

    /* renamed from: m */
    public static C3020p0 m108821m(C3020p0 c3020p0, C3020p0 c3020p02) {
        ArrayList arrayList;
        C3025q0 c3025q0;
        ArrayList arrayList2;
        int i11;
        if (c3020p0 != null && c3020p02 != null) {
            int i12 = c3020p02.f12058q;
            if (i12 != 0) {
                c3020p0.f12058q = i12;
            }
            PrivacyInfo privacyInfo = c3020p02.f12042V;
            if (privacyInfo != null && (i11 = privacyInfo.f45973p) != -1) {
                c3020p0.f12042V.f45973p = i11;
            }
            C3025q0 c3025q02 = c3020p0.f12023C;
            C3025q0 c3025q03 = c3020p02.f12023C;
            c3025q02.f12096E = c3025q03.f12096E;
            C3063z0 c3063z0 = c3025q03.f12111b;
            if (c3063z0 != null) {
                c3025q02.f12111b = c3063z0;
            }
            C3003l3 c3003l3 = c3020p02.f12059r;
            if (c3003l3 != null) {
                c3020p0.f12059r = c3003l3;
            }
            C31854b6 c31854b6 = c3020p02.f12051e0;
            if (c31854b6 != null) {
                c3020p0.f12051e0 = c31854b6;
            }
            c3020p0.m14538z0(c3025q03.f12113d);
            int i13 = c3020p0.f12058q;
            if (i13 != 2 && i13 != 3) {
                if (i13 != 17) {
                    if (i13 == 23 && (c3025q0 = c3020p02.f12023C) != null && c3020p0.f12023C != null && (arrayList2 = c3025q0.f12107P) != null && !arrayList2.isEmpty()) {
                        if (c3020p02.f12023C.f12106O != null) {
                            String str = c3020p0.f12022B.f12280b;
                            if (!TextUtils.isEmpty(c3020p02.f12022B.f12280b)) {
                                str = c3020p02.f12022B.f12280b;
                            }
                            C3025q0 c3025q04 = c3020p0.f12023C;
                            C2949b c2949b = c3020p02.f12023C.f12106O;
                            c3025q04.f12106O = c2949b;
                            c2949b.m13964g(str);
                        }
                        m108766J0(c3020p0, c3020p02);
                        C3025q0 c3025q05 = c3020p02.f12023C;
                        C17391z c17391z = c3025q05.f12094C;
                        if (c17391z != null) {
                            c3020p0.f12023C.f12094C = c17391z;
                        }
                        C23307g c23307g = c3025q05.f12119j;
                        if (c23307g != null) {
                            c3020p0.f12023C.f12119j = c23307g;
                        }
                        c3020p0.f12024D = c3020p02.f12024D;
                    }
                } else {
                    C17391z c17391z2 = c3020p02.f12023C.f12093B;
                    if (c17391z2 != null && !TextUtils.isEmpty(c17391z2.f88634q)) {
                        c3020p0.f12023C.f12093B = c3020p02.f12023C.f12093B;
                    }
                    C3025q0 c3025q06 = c3020p02.f12023C;
                    C17391z c17391z3 = c3025q06.f12094C;
                    if (c17391z3 != null) {
                        c3020p0.f12023C.f12094C = c17391z3;
                    }
                    C23307g c23307g2 = c3025q06.f12119j;
                    if (c23307g2 != null) {
                        c3020p0.f12023C.f12119j = c23307g2;
                    }
                }
            } else {
                C3025q0 c3025q07 = c3020p02.f12023C;
                if (c3025q07 != null && c3020p0.f12023C != null && (arrayList = c3025q07.f12118i) != null && !arrayList.isEmpty()) {
                    m108846y0(c3020p0, c3020p02);
                    C3025q0 c3025q08 = c3020p02.f12023C;
                    C23307g c23307g3 = c3025q08.f12119j;
                    if (c23307g3 != null) {
                        c3020p0.f12023C.f12119j = c23307g3;
                    }
                    C3025q0 c3025q09 = c3020p0.f12023C;
                    c3025q09.f12108Q = c3025q08.f12108Q;
                    c3020p0.f12024D = c3020p02.f12024D;
                    C18049e c18049e = c3025q08.f12127r;
                    if (c18049e != null) {
                        c3025q09.f12127r = c18049e;
                    }
                }
            }
            c3020p0.f12027G = false;
        }
        return c3020p0;
    }

    /* renamed from: m0 */
    private static boolean m108822m0(JSONObject jSONObject) {
        JSONArray optJSONArray;
        try {
            if (jSONObject.has("pre_check") && (optJSONArray = jSONObject.optJSONArray("pre_check")) != null) {
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    if (!m108820l0((JSONObject) optJSONArray.get(i11))) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: n */
    public static C22126c0 m108823n(k kVar, C22126c0 c22126c0) {
        if (c22126c0 == null) {
            return c22126c0;
        }
        Context context = c22126c0.getContext();
        switch (b.f102364a[kVar.ordinal()]) {
            case 1:
                m108823n(k.ROBOTO_F0, c22126c0);
                c22126c0.mo111965M1(1);
                c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
                return c22126c0;
            case 2:
                m108823n(k.ROBOTO_F7, c22126c0);
                c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
                return c22126c0;
            case 3:
                m108823n(k.ROBOTO_F0, c22126c0);
                c22126c0.mo111965M1(1);
                c22126c0.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.white));
                return c22126c0;
            case 4:
                m108823n(k.ROBOTO_F7, c22126c0);
                c22126c0.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.white_70));
                return c22126c0;
            case 5:
                m108823n(k.ROBOTO_F7, c22126c0);
                c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
                c22126c0.m111982x1(false);
                return c22126c0;
            case 6:
                m108823n(k.ROBOTO_F4, c22126c0);
                c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC16781w.FeedActivityTextColor));
                c22126c0.mo111965M1(0);
                return c22126c0;
            case 7:
                m108823n(k.ROBOTO_F0, c22126c0);
                c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
                c22126c0.m111982x1(false);
                c22126c0.mo111965M1(1);
                c22126c0.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_btn_postfeed));
                c22126c0.m111953A1(AbstractC23136l9.m118671Q(AbstractC7307b0.feed_link_title_maxline));
                return c22126c0;
            case 8:
                m108823n(k.ROBOTO_F71, c22126c0);
                c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
                c22126c0.m111953A1(AbstractC23136l9.m118671Q(AbstractC7307b0.feed_link_title_maxline));
                return c22126c0;
            case 9:
                c22126c0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85293f0));
                return c22126c0;
            case 10:
                c22126c0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85296f3));
                c22126c0.mo111965M1(1);
                return c22126c0;
            case 11:
                c22126c0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85297f4));
                return c22126c0;
            case 12:
                c22126c0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85300f7));
                return c22126c0;
            case 13:
                c22126c0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f71));
                return c22126c0;
            default:
                return c22126c0;
        }
    }

    /* renamed from: n0 */
    public static boolean m108824n0(int i11) {
        return i11 != 4;
    }

    /* renamed from: o */
    public static ArrayList m108825o(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C2954c c2954c = (C2954c) it.next();
                if (c2954c.m13986a() != null) {
                    ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
                    itemAlbumMobile.m40519e0(c2954c);
                    arrayList2.add(itemAlbumMobile);
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: o0 */
    public static boolean m108826o0(int i11) {
        return i11 == 100 || i11 == 108 || i11 == 109;
    }

    /* renamed from: p */
    public static JSONObject m108827p(C3000l0 c3000l0) {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("holder_type", c3000l0.f11893p);
            if (!TextUtils.isEmpty(c3000l0.f11869R)) {
                jSONObject.put("title", c3000l0.f11869R);
            }
            if (!TextUtils.isEmpty(c3000l0.f11872U)) {
                jSONObject.put("icon", c3000l0.f11872U);
            }
            if (!TextUtils.isEmpty(c3000l0.f11870S)) {
                jSONObject.put("color", c3000l0.f11870S);
            }
            if (!TextUtils.isEmpty(c3000l0.f11871T)) {
                jSONObject.put("color_line", c3000l0.f11871T);
            }
            if (!TextUtils.isEmpty(c3000l0.f11873V)) {
                jSONObject.put("color_title", c3000l0.f11873V);
            }
            int i11 = c3000l0.f11893p;
            if (i11 == 0) {
                List list = c3000l0.f11899s;
                if (list != null && list.size() > 0) {
                    if (!((C3020p0) c3000l0.f11899s.get(0)).m14489T()) {
                        jSONObject.put("item", ((C3020p0) c3000l0.f11899s.get(0)).m14474E0());
                    } else {
                        AbstractC20110a.m104539h(new Exception("ConvertFeedOption"));
                    }
                }
            } else if (i11 == 2 || i11 == 1) {
                List list2 = c3000l0.f11899s;
                if (list2 != null && list2.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (C3020p0 c3020p0 : c3000l0.f11899s) {
                        if (!c3020p0.m14489T()) {
                            jSONArray.put(c3020p0.m14474E0());
                        }
                    }
                    jSONObject.put("items", jSONArray);
                }
                C3003l3.c cVar = c3000l0.f11851A;
                if (cVar != null) {
                    jSONObject.put("user_follow", cVar.m14399l());
                }
            }
            jSONObject.put("error_code_upload", c3000l0.f11892o0);
            jSONObject.put("is_async_feed", c3000l0.m14371w0());
            jSONObject.put("album_id", c3000l0.f11888k0);
            C2949b c2949b = c3000l0.f11889l0;
            Object obj2 = "";
            if (c2949b == null) {
                obj = "";
            } else {
                obj = c2949b.m13968k();
            }
            jSONObject.put("album_info", obj);
            if (c3000l0.f11890m0 != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it = c3000l0.f11890m0.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((C2954c) it.next()).m13995j());
                }
                jSONObject.put("album_items", jSONArray2);
            }
            SongInfo songInfo = c3000l0.f11891n0;
            if (songInfo != null) {
                obj2 = songInfo.m45186h();
            }
            jSONObject.put("song", obj2);
            jSONObject.put("tab", c3000l0.f11896q0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: p0 */
    public static boolean m108828p0(int i11, boolean z11) {
        if (z11) {
            return false;
        }
        return i11 == 1 || i11 == 2 || i11 == 3 || i11 == 6 || i11 == 7 || i11 == 17 || i11 == 22 || i11 == 24;
    }

    /* renamed from: q */
    public static ArrayList m108829q(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                if (!list.isEmpty() && list2 != null) {
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) list.get(i11);
                        if (itemAlbumMobile != null) {
                            C2954c c2954c = new C2954c();
                            c2954c.m13994i(0);
                            C2964e c2964e = new C2964e();
                            c2964e.m14028k(Long.parseLong(itemAlbumMobile.f42595r));
                            c2964e.m14016g(itemAlbumMobile.f42548C);
                            c2964e.m14015f(itemAlbumMobile.f42607x);
                            c2954c.m13992g(c2964e);
                            if (i11 < list2.size()) {
                                c2954c.m13993h((ItemAlbumMobile.C7883c) list2.get(i11));
                            }
                            arrayList.add(c2954c);
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return arrayList;
    }

    /* renamed from: q0 */
    private static boolean m108830q0(String str, List list) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C3000l0 c3000l0 = (C3000l0) it.next();
                        if (c3000l0 != null) {
                            C3020p0 m14322a0 = c3000l0.m14322a0();
                            if (TextUtils.equals(str, c3000l0.f11895q)) {
                                if (m14322a0 == null) {
                                    return false;
                                }
                                if (!m14322a0.m14490U()) {
                                    return false;
                                }
                                return true;
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        return false;
    }

    /* renamed from: r */
    public static ArrayList m108831r(C17391z c17391z, C23307g c23307g) {
        ArrayList arrayList = new ArrayList();
        if (c17391z != null && c23307g != null) {
            try {
                C2954c c2954c = new C2954c();
                c2954c.m13994i(1);
                C2969f c2969f = new C2969f();
                c2969f.m14016g(c17391z.f88622e);
                c2969f.m14015f(c17391z.f88620c);
                c2969f.m14014e(new C28227x3(c23307g.f113474a, c23307g.f113475b));
                c2969f.m14050n(c17391z.f88621d);
                String str = c17391z.f88634q;
                if (str == null) {
                    str = "";
                }
                c2969f.m14051o(str);
                c2969f.m14052p(c17391z.f88630m ? 1 : 0);
                c2969f.m14053q(Long.parseLong(c17391z.f88618a));
                c2954c.m13992g(c2969f);
                arrayList.add(c2954c);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return arrayList;
    }

    /* renamed from: r0 */
    private static boolean m108832r0(String str, List list, long j11) {
        C3020p0 c3020p0;
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C3000l0 c3000l0 = (C3000l0) it.next();
                        if (c3000l0 != null) {
                            c3020p0 = c3000l0.m14322a0();
                        } else {
                            c3020p0 = null;
                        }
                        if (c3020p0 != null && TextUtils.equals(str, c3000l0.f11895q) && j11 < 60000) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }
        return false;
    }

    /* renamed from: s */
    public static C2949b m108833s(ProfilePreviewAlbumItem profilePreviewAlbumItem) {
        if (profilePreviewAlbumItem != null) {
            C2949b c2949b = new C2949b();
            c2949b.m13963f(profilePreviewAlbumItem.getId());
            c2949b.m13965h(profilePreviewAlbumItem.getThemeInfo());
            c2949b.m13966i(profilePreviewAlbumItem.getThumb());
            c2949b.m13967j(profilePreviewAlbumItem.getTitle());
            return c2949b;
        }
        return null;
    }

    /* renamed from: s0 */
    public static boolean m108834s0(String str, List list, long j11) {
        boolean m108804d0 = m108804d0(str, list);
        boolean m108830q0 = m108830q0(str, list);
        boolean m108832r0 = m108832r0(str, list, j11);
        if (m108804d0 && !m108830q0 && m108832r0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a5, code lost:            r8 = 0;     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m108835t(String str, ProfileAlbumItem profileAlbumItem, int i11, boolean z11) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            float f11 = (320 - ((i11 - 1) * 2)) / i11;
            if (profileAlbumItem != null) {
                boolean z12 = false;
                int i12 = -1;
                for (int i13 = 0; i13 < profileAlbumItem.m46301d().size(); i13++) {
                    AbstractC32173x4 abstractC32173x4 = (AbstractC32173x4) profileAlbumItem.m46301d().get(i13);
                    List m155151j = abstractC32173x4.m155151j();
                    if (m155151j != null) {
                        int size = m155151j.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            C32187y4 c32187y4 = (C32187y4) m155151j.get(i14);
                            if (!str.equals(String.valueOf(c32187y4.m155175c())) && !str.equals(String.valueOf(c32187y4.m155183k()))) {
                            }
                            i12 = c32187y4.m155178f();
                            m155151j.remove(i14);
                            z12 = true;
                        }
                        if (m155151j.isEmpty()) {
                            profileAlbumItem.m46301d().remove(abstractC32173x4);
                            return;
                        }
                        if (z12 && z11) {
                            int i15 = 0;
                            boolean z13 = false;
                            int i16 = 0;
                            while (true) {
                                if (i15 > size) {
                                    break;
                                }
                                if (i15 == m155151j.size()) {
                                    if (z13) {
                                    }
                                } else {
                                    if (((C32187y4) m155151j.get(i15)).m155178f() == i12) {
                                        if (!z13) {
                                            i16 = i15;
                                            z13 = true;
                                        }
                                    } else if (z13) {
                                        break;
                                    }
                                    i15++;
                                }
                            }
                            if (i16 >= 0 && i16 < size && i15 > i16 && i15 < size) {
                                int i17 = -1;
                                while (i16 < i15) {
                                    i17++;
                                    float f12 = (2 + f11) * i17;
                                    float f13 = f12 + f11;
                                    C32187y4.b m155176d = ((C32187y4) m155151j.get(i16)).m155176d();
                                    if (m155176d != null) {
                                        m155176d.m155201j(0.0f);
                                        m155176d.m155199h(f12);
                                        m155176d.m155200i(f13);
                                        m155176d.m155197f(f11);
                                    }
                                    i16++;
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: t0 */
    public static boolean m108836t0(View view) {
        if (!view.isShown()) {
            return false;
        }
        if (view.getMeasuredWidth() == 0 && view.getMeasuredHeight() == 0) {
            return true;
        }
        Rect m108793X = m108793X(view);
        if (m108793X == null || !m108793X.intersect(0, 0, AbstractC23136l9.m118731n0(view.getContext()), AbstractC23136l9.m118719j0(view.getContext()))) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public static boolean m108837u() {
        if (AbstractC0924m0.m3510V9() && Build.VERSION.SDK_INT <= 30) {
            return true;
        }
        return false;
    }

    /* renamed from: u0 */
    public static boolean m108838u0(C16719g c16719g) {
        if (!c16719g.isShown()) {
            return false;
        }
        if (c16719g.m89114P() == 0 && c16719g.m89112O() == 0) {
            return true;
        }
        Rect m108795Y = m108795Y(c16719g);
        if (m108795Y == null || !m108795Y.intersect(0, 0, AbstractC23136l9.m118731n0(c16719g.getContext()), AbstractC23136l9.m118719j0(c16719g.getContext()))) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public static C17391z m108839v(C3023p3 c3023p3, String str, String str2) {
        if (c3023p3 != null) {
            try {
                C17391z c17391z = new C17391z(str + "_" + c3023p3.m14554k(), "", c3023p3.m14551h(), "", c3023p3.m14552i(), C23278z2.m120136k0().f116260a, false, 9, 1.0f, 1, null, str2, 0);
                c17391z.f88630m = true;
                c17391z.f88634q = "";
                return c17391z;
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }
        return null;
    }

    /* renamed from: v0 */
    private static boolean m108840v0(int i11) {
        return i11 == 32 || i11 == 40;
    }

    /* renamed from: w */
    public static C3979l m108841w(String str, Integer... numArr) {
        C3979l c3979l = null;
        if (!TextUtils.isEmpty(str)) {
            for (Integer num : numArr) {
                int intValue = num.intValue();
                if (c3979l == null) {
                    c3979l = C23999j.m125676A2(str, intValue, C23278z2.m120110a());
                }
            }
        }
        return c3979l;
    }

    /* renamed from: x */
    public static Bundle m108843x(C3000l0 c3000l0) {
        String str;
        Bundle bundle = new Bundle();
        if (c3000l0 != null) {
            bundle.putInt(f102360j, c3000l0.m14339j0());
            if (c3000l0.m14339j0() != 3) {
                bundle.putString(f102361k, c3000l0.f11895q);
            } else {
                C3000l0 m138450a = C26878b.f127183a.m138450a(c3000l0.f11895q);
                String str2 = f102361k;
                if (m138450a != null) {
                    str = m138450a.f11895q;
                } else {
                    str = c3000l0.f11895q;
                }
                bundle.putString(str2, str);
                bundle.putString(f102363m, c3000l0.f11895q);
                C3020p0 m14322a0 = c3000l0.m14322a0();
                if (m14322a0 != null) {
                    bundle.putLong(f102362l, System.currentTimeMillis() - m14322a0.f12062u);
                }
            }
        }
        return bundle;
    }

    /* renamed from: x0 */
    public static /* synthetic */ int m108844x0(C31873ca c31873ca, C31873ca c31873ca2) {
        return Integer.compare(c31873ca.f146376a, c31873ca2.f146376a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: y */
    public static C3000l0.w m108845y(int i11, String str) {
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        C3000l0 m137785c = C26767v.m137782d().m137785c(str);
        boolean z12 = false;
        if (m137785c != null && m137785c.m14322a0() != null && m137785c.m14322a0().m14488S()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i12 = AbstractC8020f0.str_edit_feed_fail_error_msg;
        } else {
            i12 = AbstractC8020f0.str_post_feed_fail_error_msg;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(i12);
        if (z11) {
            i13 = AbstractC8020f0.str_edit_feed_fail_des_default;
        } else {
            i13 = AbstractC8020f0.str_post_feed_fail_des_default;
        }
        String m118743r02 = AbstractC23136l9.m118743r0(i13);
        if (i11 != -900) {
            if (i11 != -800) {
                if (i11 != 204) {
                    if (i11 != 18011 && i11 != 18017) {
                        if (i11 != 18099) {
                            if (i11 != 19002) {
                                if (i11 != 18019) {
                                    if (i11 != 18020) {
                                        switch (i11) {
                                        }
                                        C3000l0.w wVar = new C3000l0.w();
                                        wVar.f11951b = m118743r0;
                                        wVar.f11952c = m118743r02;
                                        wVar.f11953d = z12;
                                        wVar.f11950a = i11;
                                        return wVar;
                                    }
                                }
                            }
                            if (z11) {
                                i18 = AbstractC8020f0.str_edit_feed_fail_error_msg;
                            } else {
                                i18 = AbstractC8020f0.str_post_feed_fail_error_msg;
                            }
                            m118743r0 = AbstractC23136l9.m118743r0(i18);
                            m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_post_feed_fail_des_file_too_big);
                            C3000l0.w wVar2 = new C3000l0.w();
                            wVar2.f11951b = m118743r0;
                            wVar2.f11952c = m118743r02;
                            wVar2.f11953d = z12;
                            wVar2.f11950a = i11;
                            return wVar2;
                        }
                    }
                    if (z11) {
                        i16 = AbstractC8020f0.str_edit_feed_fail_error_msg;
                    } else {
                        i16 = AbstractC8020f0.str_post_feed_fail_error_msg;
                    }
                    m118743r0 = AbstractC23136l9.m118743r0(i16);
                    if (z11) {
                        i17 = AbstractC8020f0.str_edit_feed_fail_des_default;
                    } else {
                        i17 = AbstractC8020f0.str_post_feed_fail_des_default;
                    }
                    m118743r02 = AbstractC23136l9.m118743r0(i17);
                }
                if (z11) {
                    i15 = AbstractC8020f0.str_edit_feed_fail_error_msg;
                } else {
                    i15 = AbstractC8020f0.str_post_feed_fail_error_msg;
                }
                m118743r0 = AbstractC23136l9.m118743r0(i15);
                m118743r02 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_post_feed_fail_des_too_long, Integer.valueOf(f102359i));
                C3000l0.w wVar22 = new C3000l0.w();
                wVar22.f11951b = m118743r0;
                wVar22.f11952c = m118743r02;
                wVar22.f11953d = z12;
                wVar22.f11950a = i11;
                return wVar22;
            }
            if (z11) {
                i14 = AbstractC8020f0.str_edit_feed_fail_error_msg;
            } else {
                i14 = AbstractC8020f0.str_post_feed_fail_error_msg;
            }
            m118743r0 = AbstractC23136l9.m118743r0(i14);
            m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_post_feed_fail_des_do_not_retry);
            C3000l0.w wVar222 = new C3000l0.w();
            wVar222.f11951b = m118743r0;
            wVar222.f11952c = m118743r02;
            wVar222.f11953d = z12;
            wVar222.f11950a = i11;
            return wVar222;
        }
        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_post_feed_faile_error_network);
        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_post_feed_fail_des_error_network);
        z12 = true;
        C3000l0.w wVar2222 = new C3000l0.w();
        wVar2222.f11951b = m118743r0;
        wVar2222.f11952c = m118743r02;
        wVar2222.f11953d = z12;
        wVar2222.f11950a = i11;
        return wVar2222;
    }

    /* renamed from: y0 */
    public static void m108846y0(C3020p0 c3020p0, C3020p0 c3020p02) {
        if (c3020p0.f12023C.f12118i != null && c3020p02.f12023C.f12118i != null) {
            HashMap hashMap = new HashMap();
            Iterator it = c3020p0.f12023C.f12118i.iterator();
            while (it.hasNext()) {
                ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) it.next();
                hashMap.put(itemAlbumMobile.f42595r, Pair.create(itemAlbumMobile.f42611z, itemAlbumMobile.f42550D));
            }
            C3025q0 c3025q0 = c3020p0.f12023C;
            C3025q0 c3025q02 = c3020p02.f12023C;
            c3025q0.f12118i = c3025q02.f12118i;
            c3025q0.f12124o = c3025q02.f12124o;
            for (int i11 = 0; i11 < c3020p0.f12023C.f12118i.size(); i11++) {
                String str = ((ItemAlbumMobile) c3020p0.f12023C.f12118i.get(i11)).f42595r;
                Pair pair = (Pair) hashMap.get(str);
                if (hashMap.containsKey(str) && pair != null && !((String) pair.first).isEmpty()) {
                    ((ItemAlbumMobile) c3020p0.f12023C.f12118i.get(i11)).f42609y = (String) pair.first;
                    ((ItemAlbumMobile) c3020p0.f12023C.f12118i.get(i11)).f42611z = (String) pair.first;
                    ((ItemAlbumMobile) c3020p0.f12023C.f12118i.get(i11)).f42550D = (String) pair.second;
                }
            }
        }
    }

    /* renamed from: z */
    public static void m108847z(C3000l0 c3000l0) {
        try {
            if (c3000l0.f11893p == 2) {
                c3000l0.m14298H1();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: z0 */
    public static void m108848z0(InterfaceC27218a interfaceC27218a, ContactProfile contactProfile) {
        if (contactProfile != null && interfaceC27218a != null) {
            try {
                if (!contactProfile.f42434r.equals(CoreUtility.f89233i)) {
                    AbstractC23647d.m123897g("18800");
                    AbstractC2298a0.m12152d(C2297a.m12139b().m12147d(false).m12145b(contactProfile).m12148e("7802").m12144a(), interfaceC27218a.mo35579p(), 0);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }
}

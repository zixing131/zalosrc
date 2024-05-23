package hf0;

import ag0.C0809c1;
import am.AbstractC0939u;
import android.R;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import au.AbstractC2379w;
import bo.C2949b;
import bo.C2954c;
import bo.C2969f;
import bo.C3020p0;
import bo.C3025q0;
import com.showingphotolib.view.SimpleAnimationTarget;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.p077ui.BaseZaloActivity;
import com.zing.zalo.p077ui.ZaloBubbleActivity;
import com.zing.zalo.p077ui.zviews.FeedMinimizableVideoPlayerView;
import com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView;
import com.zing.zalo.p077ui.zviews.OAVideoFullPlayerView;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.cache.AbstractC17297a;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zmedia.view.ZVideoView;
import com.zing.zalo.zview.ZaloView;
import i40.C20275e;
import java.util.ArrayList;
import p175g0.AbstractC19181d;
import p361nb.C23669z;
import p420pb.C24709a;
import p542ub.InterfaceC27218a;
import p716zh.C31948ha;
import p716zh.C32002l4;

/* renamed from: hf0.e */
/* loaded from: classes5.dex */
public class C20043e extends AbstractC20049k {

    /* renamed from: s */
    protected ZVideoView f98530s;

    /* renamed from: t */
    boolean f98531t;

    /* renamed from: hf0.e$a */
    /* loaded from: classes5.dex */
    public class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23669z f98532a;

        a(C23669z c23669z) {
            this.f98532a = c23669z;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.getAppContext()).m128305K(this.f98532a);
        }
    }

    /* renamed from: hf0.e$b */
    /* loaded from: classes5.dex */
    public class b extends SimpleAnimationTarget {

        /* renamed from: p */
        final /* synthetic */ View f98534p;

        b(View view) {
            this.f98534p = view;
        }

        @Override // com.showingphotolib.view.SimpleAnimationTarget, com.zing.zalo.zview.animation.AnimationTarget
        public Rect getAnimTargetLocationOnScreen() {
            int[] iArr = new int[2];
            this.f98534p.getLocationOnScreen(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            return new Rect(i11, i12, this.f98534p.getWidth() + i11, this.f98534p.getHeight() + i12);
        }
    }

    public C20043e(ZVideoView zVideoView, int i11) {
        super(i11);
        this.f98530s = zVideoView;
        this.f98531t = false;
    }

    /* renamed from: n */
    private void m104028n() {
        try {
            if (this.f98530s.getVideo() != null) {
                this.f98530s.seekTo((int) AbstractC20049k.m104111d(this.f98586p, this.f98530s.getVideo().f88618a));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: o */
    private static String m104029o(C3020p0 c3020p0) {
        ArrayList arrayList;
        C2954c c2954c;
        if (c3020p0 != null && c3020p0.f12058q == 23) {
            C3025q0 c3025q0 = c3020p0.f12023C;
            if (c3025q0 != null) {
                arrayList = c3025q0.f12107P;
            } else {
                arrayList = null;
            }
            if (arrayList != null && !arrayList.isEmpty() && (c2954c = (C2954c) arrayList.get(0)) != null && c2954c.m13991f() && (c2954c.m13986a() instanceof C2969f)) {
                return String.valueOf(((C2969f) c2954c.m13986a()).m14049m());
            }
            return "";
        }
        return "";
    }

    /* renamed from: u */
    public static ZaloView m104030u(InterfaceC27218a interfaceC27218a, C17391z c17391z, Bundle bundle, int i11) {
        int i12;
        try {
            if (interfaceC27218a.mo35576n3()) {
                i12 = AbstractC6918a0.chat_head_full_container;
            } else {
                i12 = R.id.content;
            }
            if (interfaceC27218a.mo35585v() != null && interfaceC27218a.mo35585v().getId() != 0) {
                i12 = interfaceC27218a.mo35585v().getId();
            }
            int i13 = i12;
            AbstractC2379w.m12430d(interfaceC27218a.findViewById(i13));
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, 5);
            bundle2.putString("video_str", c17391z.m92540e().toString());
            return interfaceC27218a.mo35579p().mo57057c2(i13, OAVideoFullPlayerView.class, bundle2, i11, "OAVideoFullPlayerView", 1, true);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: v */
    public static void m104031v(InterfaceC27218a interfaceC27218a, C17391z c17391z, int i11, Bundle bundle) {
        try {
            AbstractC2379w.m12430d(interfaceC27218a.findViewById(R.id.content));
            C31948ha.m153587d().m153602p();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, i11);
            bundle2.putString("video_str", c17391z.m92540e().toString());
            bundle2.putBoolean("EXTRA_IGNORE_FLOW_ANIM_CALLBACK", true);
            if (i11 == 0 || i11 == 7) {
                AbstractC20049k.m104117k(i11);
            }
            if (interfaceC27218a.mo35576n3()) {
                interfaceC27218a.mo35579p().mo57057c2(AbstractC6918a0.chat_head_full_container, MinimizableVideoPlayerView.class, bundle2, 0, null, 1, true);
            } else {
                interfaceC27218a.mo35579p().m93069k2(MinimizableVideoPlayerView.class, bundle2, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: w */
    public static void m104032w(InterfaceC27218a interfaceC27218a, C3020p0 c3020p0, C17391z c17391z, int i11, Bundle bundle, C32002l4 c32002l4) {
        m104033y(interfaceC27218a, c3020p0, c17391z, i11, null, null, bundle, c32002l4);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0190 A[Catch: Exception -> 0x0028, TRY_LEAVE, TryCatch #0 {Exception -> 0x0028, blocks: (B:3:0x0011, B:5:0x0021, B:7:0x002e, B:8:0x0033, B:11:0x005f, B:13:0x0067, B:15:0x0072, B:16:0x0079, B:18:0x007f, B:21:0x0190, B:40:0x0217, B:42:0x0084, B:44:0x008a, B:46:0x0090, B:49:0x00a8, B:51:0x00c8, B:52:0x00cf, B:54:0x00d7, B:55:0x00de, B:60:0x00ea, B:62:0x00f0, B:64:0x00fb, B:65:0x0102, B:67:0x0108, B:68:0x010d, B:70:0x0113, B:72:0x0119, B:74:0x0131, B:75:0x0133, B:78:0x014d, B:80:0x016d, B:81:0x0174, B:83:0x017c, B:84:0x0183, B:23:0x0193, B:25:0x0199, B:30:0x01bc, B:32:0x01c0, B:34:0x01c8, B:36:0x0201), top: B:2:0x0011, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0199 A[Catch: Exception -> 0x01b6, TryCatch #1 {Exception -> 0x01b6, blocks: (B:23:0x0193, B:25:0x0199, B:30:0x01bc, B:32:0x01c0, B:34:0x01c8, B:36:0x0201), top: B:22:0x0193, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01b8  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m104033y(InterfaceC27218a interfaceC27218a, C3020p0 c3020p0, C17391z c17391z, int i11, View view, View view2, Bundle bundle, C32002l4 c32002l4) {
        int i12;
        String str;
        String str2;
        long j11;
        String str3;
        String str4;
        long j12;
        String str5;
        Bundle bundle2 = bundle;
        try {
            AbstractC2379w.m12430d(interfaceC27218a.findViewById(R.id.content));
            C31948ha.m153587d().m153602p();
            if (bundle2 != null) {
                i12 = bundle2.getInt("EXTRA_INT_REQUEST_CODE");
            } else {
                i12 = 0;
            }
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, i11);
            bundle2.putString("video_str", c17391z.m92540e().toString());
            Class<FeedMinimizableVideoPlayerView> cls = FeedMinimizableVideoPlayerView.class;
            try {
                if (c3020p0 != null) {
                    str = "1";
                    if (c3020p0.f12058q == 17) {
                        bundle2.putBoolean("EXTRA_BOOL_IS_FEED_VIDEO", true);
                        bundle2.putString("EXTRA_STRING_FEED_ID", c3020p0.f12057p);
                        if (c32002l4 != null) {
                            bundle2.putString("extra_entry_point_flow", c32002l4.m154277l());
                        }
                        if (c3020p0.m14493X()) {
                            bundle2.putBoolean("EXTRA_BOOL_IS_LOCAL_FEED", true);
                        } else {
                            ArrayList arrayList = c3020p0.f12023C.f12118i;
                            if (arrayList != null && !arrayList.isEmpty()) {
                                ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile((ItemAlbumMobile) c3020p0.f12023C.f12118i.get(0));
                                if (!c3020p0.f12064w) {
                                    str4 = "0";
                                } else {
                                    str4 = str;
                                }
                                itemAlbumMobile.f42552E = str4;
                                itemAlbumMobile.f42560K = String.valueOf(c3020p0.f12025E.f12244b);
                                itemAlbumMobile.f42561L = String.valueOf(c3020p0.f12025E.f12243a);
                                itemAlbumMobile.f42599t = c3020p0.f12057p;
                                C2949b c2949b = c3020p0.f12023C.f12106O;
                                if (c2949b != null) {
                                    j12 = c2949b.m13958a();
                                } else {
                                    j12 = -1;
                                }
                                itemAlbumMobile.f42569T = j12;
                                C2949b c2949b2 = c3020p0.f12023C.f12106O;
                                if (c2949b2 == null) {
                                    str5 = "";
                                } else {
                                    str5 = c2949b2.m13962e();
                                }
                                itemAlbumMobile.f42570U = str5;
                                bundle2.putParcelable("EXTRA_STRING_ITEM_ALBUM_MOBILE", itemAlbumMobile);
                            }
                        }
                        if (i11 == 2) {
                            AbstractC20049k.m104117k(2);
                        }
                        if (!interfaceC27218a.mo35576n3()) {
                            interfaceC27218a.mo35579p().mo57057c2(AbstractC6918a0.chat_head_full_container, cls, bundle2, i12, null, 1, true);
                            return;
                        }
                        if (view2 != null && view != null && (interfaceC27218a instanceof BaseZaloActivity) && !TextUtils.isEmpty(c17391z.f88622e)) {
                            int dimension = (int) interfaceC27218a.getResources().getDimension(AbstractC19181d.abc_action_bar_default_height_material);
                            int dimension2 = (int) interfaceC27218a.getResources().getDimension(AbstractC16802y.abs__action_bar_default_height);
                            b bVar = new b(view2);
                            C20275e c20275e = new C20275e();
                            c20275e.m105882u(dimension);
                            c20275e.m105881t(dimension2);
                            c20275e.m105860F(view);
                            BaseZaloActivity baseZaloActivity = (BaseZaloActivity) interfaceC27218a;
                            baseZaloActivity.m56682E3(baseZaloActivity, bVar, c17391z.f88622e, bundle2, c20275e, c17391z, i11);
                            return;
                        }
                        interfaceC27218a.mo35579p().m93066i2(cls, bundle2, i12, 1, true);
                        return;
                    }
                } else {
                    str = "1";
                }
                if (!interfaceC27218a.mo35576n3()) {
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
            if (c3020p0 == null || c3020p0.f12058q != 23) {
                cls = MinimizableVideoPlayerView.class;
            } else {
                bundle2.putBoolean("EXTRA_BOOL_IS_FEED_VIDEO", true);
                bundle2.putString("EXTRA_STRING_FEED_ID", c3020p0.f12057p);
                if (c32002l4 != null) {
                    bundle2.putString("extra_entry_point_flow", c32002l4.m154277l());
                }
                if (c3020p0.m14493X()) {
                    bundle2.putBoolean("EXTRA_BOOL_IS_LOCAL_FEED", true);
                } else {
                    ArrayList arrayList2 = c3020p0.f12023C.f12107P;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        ItemAlbumMobile itemAlbumMobile2 = new ItemAlbumMobile();
                        itemAlbumMobile2.f42593q = c3020p0.f12022B.f12280b;
                        itemAlbumMobile2.f42591p = 2;
                        String m104029o = m104029o(c3020p0);
                        if (!"0".equals(m104029o)) {
                            itemAlbumMobile2.f42595r = m104029o;
                        }
                        itemAlbumMobile2.f42548C = c17391z.f88622e;
                        itemAlbumMobile2.f42607x = c17391z.f88620c;
                        itemAlbumMobile2.f42556G = c3020p0.f12023C.f12110a.toString();
                        if (!c3020p0.f12064w) {
                            str2 = "0";
                        } else {
                            str2 = str;
                        }
                        itemAlbumMobile2.f42552E = str2;
                        itemAlbumMobile2.f42560K = String.valueOf(c3020p0.f12025E.f12244b);
                        itemAlbumMobile2.f42561L = String.valueOf(c3020p0.f12025E.f12243a);
                        itemAlbumMobile2.f42599t = c3020p0.f12057p;
                        C2949b c2949b3 = c3020p0.f12023C.f12106O;
                        if (c2949b3 != null) {
                            j11 = c2949b3.m13958a();
                        } else {
                            j11 = -1;
                        }
                        itemAlbumMobile2.f42569T = j11;
                        C2949b c2949b4 = c3020p0.f12023C.f12106O;
                        if (c2949b4 == null) {
                            str3 = "";
                        } else {
                            str3 = c2949b4.m13962e();
                        }
                        itemAlbumMobile2.f42570U = str3;
                        bundle2.putParcelable("EXTRA_STRING_ITEM_ALBUM_MOBILE", itemAlbumMobile2);
                    }
                }
            }
            if (i11 == 2) {
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: p */
    public void m104034p() {
        try {
            if (this.f98530s.getVideo() != null) {
                AbstractC17297a.m92223a();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q */
    public boolean m104035q(int i11, KeyEvent keyEvent) {
        try {
            ZVideoView zVideoView = this.f98530s;
            if (zVideoView != null) {
                if (zVideoView.onKeyUp(i11, keyEvent)) {
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

    /* renamed from: r */
    public void m104036r() {
        try {
            ZVideoView zVideoView = this.f98530s;
            if (zVideoView != null) {
                int currentState = zVideoView.getCurrentState();
                if (currentState == 3 || currentState == 1 || currentState == 2) {
                    this.f98531t = true;
                }
                AbstractC20049k.m104115i(this.f98530s, this.f98586p);
                if (this.f98530s.m92401H()) {
                    ZMediaPlayerSettings.isFullScreen = false;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: s */
    public void m104037s() {
        try {
            ZVideoView zVideoView = this.f98530s;
            if (zVideoView != null) {
                if (zVideoView.m92401H()) {
                    ZMediaPlayerSettings.isFullScreen = true;
                }
                if (this.f98531t && !(this.f98530s.getContext() instanceof ZaloBubbleActivity)) {
                    m104028n();
                    if (this.f98530s.getCurrentState() == 4) {
                        this.f98530s.start();
                    }
                    this.f98530s.m92418l0(true);
                    this.f98531t = false;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: t */
    public void m104038t() {
    }

    /* renamed from: z */
    public void m104039z() {
        try {
            ZVideoView zVideoView = this.f98530s;
            if (zVideoView != null) {
                if (zVideoView.m92402I()) {
                    if (this.f98530s.isPlaying()) {
                        this.f98530s.pause();
                    }
                    AbstractC20049k.m104108a(this.f98530s, this.f98586p);
                } else {
                    AbstractC20049k.m104109b(this.f98530s, this.f98586p, 0L);
                }
                C23669z m92432u0 = this.f98530s.m92432u0(1);
                if (m92432u0 != null) {
                    C0809c1.m2050b(new a(m92432u0));
                }
                this.f98530s.m92429s0();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}

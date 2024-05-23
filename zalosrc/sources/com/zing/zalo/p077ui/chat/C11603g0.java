package com.zing.zalo.p077ui.chat;

import ac.C0732w;
import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0814e0;
import ag0.C0815e1;
import ag0.C0824j;
import am.AbstractC0939u;
import am.C0943w;
import android.R;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import au.C2343e;
import au.C2370r0;
import b40.C2520a;
import b40.C2526d;
import b40.C2546u;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bo.C3020p0;
import c30.C3229a;
import c30.C3245i;
import c30.C3255n;
import com.adtima.Adtima;
import com.androidquery.util.C3979l;
import com.showingphotolib.view.HackyViewPager;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.ZaloBubbleActivity;
import com.zing.zalo.p077ui.chat.AbstractC11316a;
import com.zing.zalo.p077ui.chat.C11603g0;
import com.zing.zalo.p077ui.chat.chatrow.ChatEmptyView;
import com.zing.zalo.p077ui.chat.chatrow.ChatLeftRichMessageMC;
import com.zing.zalo.p077ui.chat.chatrow.ChatRow;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowBase;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowE2eeDecryptedFailed;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowEcard;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowFile;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowLiveLocation;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiPhotos;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiStickers;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowRecommendLink;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowUnSupport;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowVideo;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoGifInline;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoInline;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoLiveStream;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoMask;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowWebContent;
import com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0;
import com.zing.zalo.p077ui.chat.chatrow.InterfaceC11505n2;
import com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v;
import com.zing.zalo.p077ui.chat.dialog.ChatDialogView;
import com.zing.zalo.p077ui.group.livestream.GroupLiveStreamView;
import com.zing.zalo.p077ui.widget.AvatarImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.CodeLockMessageView;
import com.zing.zalo.p077ui.zviews.FeedDetailsView;
import com.zing.zalo.p077ui.zviews.StoryDetailsView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.tracking.actionlogv2.ActionLogChatLocation;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17949b1;
import dj.C17952c1;
import dj.C17961f1;
import dj.C17964g1;
import dj.C17967h1;
import dj.C17969i0;
import dj.C17972j0;
import dj.C17975k0;
import dj.C17990p0;
import dj.C17996r0;
import dj.C17999s0;
import dj.C18002t0;
import dj.C18009w0;
import dj.C18013y0;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import hf0.AbstractC20049k;
import hf0.C20040b;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import i40.AbstractC20279i;
import i40.C20275e;
import i70.C20380b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l30.C22033k0;
import lb0.C22423y;
import me0.AbstractC23006a0;
import me0.AbstractC23028c0;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23181q;
import me0.AbstractC23188q6;
import me0.AbstractC23211s7;
import me0.C23055e5;
import me0.C23212s8;
import me0.C23278z2;
import me0.ClipboardManagerOnPrimaryClipChangedListenerC23245w;
import mm0.AbstractC23350e;
import nh0.InterfaceC23792b;
import nk0.C23855s0;
import org.json.JSONObject;
import p019aj.C0872f;
import p056cj.C3535c;
import p056cj.C3554v;
import p105dn.EnumC18030a;
import p111du.AbstractC18069a;
import p172fy.C19171b;
import p207he.C20011e;
import p207he.C20024r;
import p239ih.C20556f;
import p267jh.C21253b;
import p268ji.C21270p;
import p268ji.C21272r;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p392oh.C24265l;
import p448qh.AbstractC25280e;
import p448qh.C25282g;
import p450qj.C25301c;
import p461qu.AbstractC25495a;
import p471r3.C25630b;
import p510sq.C26365a;
import p511sw.C26393b;
import p559uv.C27373c;
import p647xj.C29676b;
import p716zh.C31842a9;
import p716zh.C31853b5;
import p716zh.C31877d;
import p716zh.C31883d5;
import p716zh.C31887d9;
import p716zh.C31933ga;
import p716zh.C31943h5;
import p716zh.C31944h6;
import p716zh.C31948ha;
import p716zh.C31965ic;
import p716zh.C31973j5;
import p716zh.C31980jc;
import p716zh.C31986k3;
import p716zh.C32002l4;
import p716zh.C32006l8;
import p716zh.C32037n9;
import p716zh.C32076q5;
import p716zh.C32106s7;
import p716zh.C32119t6;
import ph.C24751d;
import ph.C24753f;
import th.AbstractC26687h;
import v50.AbstractC27730lb;
import v50.C27870vb;
import vg.AbstractC28207v1;
import vg.AbstractRunnableC28185s6;
import vg.C28020b3;
import vg.C28203u6;
import w50.C28769a;
import w50.C28771c;
import x50.C29384b;
import y50.InterfaceC30793c;

/* renamed from: com.zing.zalo.ui.chat.g0 */
/* loaded from: classes5.dex */
public class C11603g0 extends AbstractC11316a {

    /* renamed from: e0 */
    protected static final String f60302e0 = "g0";

    /* renamed from: N */
    boolean f60303N;

    /* renamed from: P */
    private final C23528a f60305P;

    /* renamed from: Q */
    private final ChatView f60306Q;

    /* renamed from: R */
    private final InterfaceC23792b f60307R;

    /* renamed from: S */
    private boolean f60308S;

    /* renamed from: V */
    private final int f60311V;

    /* renamed from: W */
    private C17945a0 f60312W;

    /* renamed from: b0 */
    C20040b f60317b0;

    /* renamed from: c0 */
    AbstractC25280e f60318c0;

    /* renamed from: O */
    boolean f60304O = false;

    /* renamed from: T */
    private final SparseIntArray f60309T = new SparseIntArray();

    /* renamed from: U */
    SparseArray f60310U = new SparseArray();

    /* renamed from: X */
    private boolean f60313X = false;

    /* renamed from: Y */
    C21253b f60314Y = new C21253b();

    /* renamed from: Z */
    C21253b f60315Z = new C21253b();

    /* renamed from: a0 */
    private boolean f60316a0 = false;

    /* renamed from: d0 */
    private final ChatEmptyView.InterfaceC11322a f60319d0 = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.g0$a */
    /* loaded from: classes5.dex */
    public class a extends ClickableSpan {
        a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC28207v1.m141994i3("action.open.inapp", 3, C11603g0.this.f60306Q.m92676n2(), C11603g0.this.f60306Q, AbstractC23306f.m120583H().m110204g().f110048B, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(C23212s8.m119607o(MainApplication.getAppContext(), AbstractC16781w.LinkColor));
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.g0$b */
    /* loaded from: classes5.dex */
    class b implements ChatEmptyView.InterfaceC11322a {

        /* renamed from: com.zing.zalo.ui.chat.g0$b$a */
        /* loaded from: classes5.dex */
        class a extends C20275e {
            a() {
            }

            @Override // i40.C20275e
            /* renamed from: h */
            public int mo36887h(int i11) {
                return i11;
            }

            @Override // i40.C20275e
            /* renamed from: s */
            public boolean mo36888s() {
                return true;
            }
        }

        b() {
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatEmptyView.InterfaceC11322a
        /* renamed from: a */
        public void mo60390a(C32006l8 c32006l8) {
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatEmptyView.InterfaceC11322a
        /* renamed from: b */
        public void mo60391b() {
            try {
                if (!C11603g0.this.m64487I1()) {
                    return;
                }
                C11603g0.this.f60306Q.m60020gQ().mo60772nh(C11603g0.this.f60306Q.m60020gQ().mo60615Oc().m17944I0(), C32002l4.m154264g(20000), null);
                C11603g0.this.f60306Q.m60020gQ().mo60832x4(false);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatEmptyView.InterfaceC11322a
        /* renamed from: c */
        public void mo60392c(ArrayList arrayList, int i11, AnimationTarget animationTarget, C16719g c16719g) {
            try {
                if (!C11603g0.this.m64487I1()) {
                    return;
                }
                ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) arrayList.get(i11);
                Bundle bundle = new Bundle();
                bundle.putBoolean("extra_profile_latest_photos", true);
                bundle.putBoolean("hideImageFunction", false);
                if (arrayList.size() > 1) {
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new ItemAlbumMobile((ItemAlbumMobile) it.next()));
                    }
                    bundle.putParcelableArrayList("medialist", arrayList2);
                    bundle.putInt("currentIndex", i11);
                } else {
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    arrayList3.add(new ItemAlbumMobile(itemAlbumMobile));
                    bundle.putParcelableArrayList("medialist", arrayList3);
                }
                a aVar = new a();
                if (c16719g.m89119T() != null) {
                    aVar.m105861G(new C2370r0(c16719g.m89119T()));
                }
                aVar.m105865K(i11);
                C11603g0.this.f60306Q.m92692wK().mo35551H2(animationTarget, ((ItemAlbumMobile) arrayList.get(i11)).f42607x, bundle, aVar, 10000);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.g0$c */
    /* loaded from: classes5.dex */
    class c implements ChatLeftRichMessageMC.InterfaceC11325b {
        c() {
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatLeftRichMessageMC.InterfaceC11325b
        /* renamed from: a */
        public boolean mo60888a() {
            if (C11603g0.this.f60306Q.m59704KQ() && !C11603g0.this.f60306Q.m92649TI().m93029Q(CodeLockMessageView.class) && !C11603g0.this.f60306Q.f56916w1 && (!ZaloBubbleActivity.m57017B5() || C11603g0.this.f60306Q.mo60184qx())) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatLeftRichMessageMC.InterfaceC11325b
        /* renamed from: b */
        public void mo60889b(C17945a0 c17945a0, int i11, boolean z11, boolean z12) {
            try {
                if (C11603g0.this.m64487I1() && C11603g0.this.f60306Q != null) {
                    C11603g0.this.f60306Q.f56793R1.m64812r0(c17945a0, i11 + "", z11, false, z12);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatLeftRichMessageMC.InterfaceC11325b
        /* renamed from: c */
        public void mo60890c(String str) {
            try {
                if (!C11603g0.this.m64487I1()) {
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    int m40666e = TrackingSource.m40666e();
                    String m40669h = TrackingSource.m40669h(m40666e);
                    Bundle bundle = new Bundle();
                    bundle.putString("EXTRA_WEB_URL", str);
                    bundle.putInt("EXTRA_SOURCE_LINK", m40666e);
                    if (!TextUtils.isEmpty(m40669h)) {
                        bundle.putString("EXTRA_SOURCE_PARAM", m40669h);
                    }
                    bundle.putInt("EXTRA_OPEN_LINK_SOURCE", 1);
                    ZaloWebView.Companion.m87171F(C11603g0.this.f60306Q.m92676n2(), str, bundle);
                }
                if (C11603g0.this.f60306Q != null) {
                    C11603g0.this.f60306Q.m60020gQ().mo60832x4(false);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatLeftRichMessageMC.InterfaceC11325b
        /* renamed from: d */
        public void mo60891d(String str, String str2, int i11, int i12, String str3, C17945a0 c17945a0) {
            try {
                if (!C11603g0.this.m64487I1()) {
                    return;
                }
                TrackingSource trackingSource = new TrackingSource(36);
                trackingSource.m40677a("msgType", Integer.valueOf(i12));
                trackingSource.m40677a("footerType", Integer.valueOf(i11));
                C31877d c31877d = new C31877d(trackingSource);
                if (!TextUtils.equals(str, "action.query.hide.v2") && !TextUtils.equals(str, "action.query.show.v2") && !TextUtils.equals(str, "action.request.multiaction")) {
                    if (TextUtils.equals(str, "action.open.location")) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("EXTRA_FOOTER_LOG_DATA", ActionLogChatLocation.f55164a.m56653i(c17945a0));
                        c31877d.m153185d(bundle);
                    }
                    C11603g0.this.f60306Q.mo60271wv(str, str2, null, c31877d);
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("globalMsgId", str3);
                c31877d.m153185d(bundle2);
                C11603g0.this.f60306Q.mo60271wv(str, str2, null, c31877d);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatLeftRichMessageMC.InterfaceC11325b
        /* renamed from: e */
        public void mo60892e(C31842a9 c31842a9) {
            try {
                if (C11603g0.this.m64487I1() && c31842a9 != null && C11603g0.this.f60306Q != null) {
                    C11603g0.this.f60306Q.m60020gQ().mo60782q8(c31842a9);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.g0$d */
    /* loaded from: classes5.dex */
    public class d extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C17945a0 f60324a;

        d(C17945a0 c17945a0) {
            this.f60324a = c17945a0;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7956b.m41474B().m41562v0(this.f60324a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.g0$e */
    /* loaded from: classes5.dex */
    public class e implements Transition.TransitionListener {
        e() {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            C11603g0.this.f60313X = false;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.g0$f */
    /* loaded from: classes5.dex */
    class f implements ChatRow.InterfaceC11339n {
        f() {
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow.InterfaceC11339n
        /* renamed from: A */
        public boolean mo61145A(String str, MessageId messageId) {
            if (C11603g0.this.m60486Y() != null) {
                return C11603g0.this.m60486Y().mo60394A(str, messageId);
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow.InterfaceC11339n
        /* renamed from: P0 */
        public void mo61146P0(ChatRow chatRow) {
            if (C11603g0.this.m60486Y() != null) {
                C11603g0.this.m60486Y().mo60396P0(chatRow);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow.InterfaceC11339n
        /* renamed from: Q0 */
        public void mo61147Q0() {
            if (C11603g0.this.m60486Y() != null) {
                C11603g0.this.m60486Y().mo60397Q0();
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow.InterfaceC11339n
        /* renamed from: a */
        public void mo61148a(String str, MessageId messageId) {
            if (C11603g0.this.m60486Y() != null) {
                C11603g0.this.m60486Y().mo60395O0(1, str, messageId);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow.InterfaceC11339n
        /* renamed from: b */
        public void mo61149b(ChatRow chatRow) {
            C11603g0.this.f60306Q.m60209sU(Collections.singletonList(chatRow.getMessage()));
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow.InterfaceC11339n
        /* renamed from: i0 */
        public void mo61150i0() {
            if (C11603g0.this.m60486Y() != null) {
                C11603g0.this.m60486Y().mo60403i0();
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow.InterfaceC11339n
        /* renamed from: j */
        public void mo61151j(C7853b.b bVar) {
            if (C11603g0.this.m60486Y() != null) {
                C11603g0.this.m60486Y().mo60404j(bVar);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow.InterfaceC11339n
        /* renamed from: k */
        public void mo61152k() {
            if (C11603g0.this.m60486Y() != null) {
                C11603g0.this.m60486Y().mo60405k();
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow.InterfaceC11339n
        /* renamed from: m */
        public void mo61153m(C7853b.d dVar) {
            if (C11603g0.this.m60486Y() != null) {
                C11603g0.this.m60486Y().mo60406m(dVar);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow.InterfaceC11339n
        /* renamed from: z */
        public boolean mo61154z(C17945a0 c17945a0) {
            if (C11603g0.this.m60486Y() != null) {
                return C11603g0.this.m60486Y().mo60408z(c17945a0);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.g0$g */
    /* loaded from: classes5.dex */
    public class g implements InterfaceC11530v {

        /* renamed from: com.zing.zalo.ui.chat.g0$g$a */
        /* loaded from: classes5.dex */
        class a implements C22033k0.i {

            /* renamed from: a */
            final /* synthetic */ InterfaceC11475g0 f60329a;

            /* renamed from: com.zing.zalo.ui.chat.g0$g$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            class C32752a extends StoryDetailsView.AbstractC15101b0 {

                /* renamed from: a */
                boolean f60331a = true;

                C32752a() {
                }

                @Override // com.zing.zalo.p077ui.zviews.StoryDetailsView.AbstractC15101b0
                /* renamed from: a */
                public AbstractC20279i.a mo17180a(C31980jc c31980jc) {
                    Rect referenceThumbPosition;
                    Object obj = a.this.f60329a;
                    if ((obj instanceof View) && this.f60331a && ((View) obj).isShown() && (referenceThumbPosition = a.this.f60329a.getReferenceThumbPosition()) != null) {
                        AbstractC20279i.a aVar = new AbstractC20279i.a();
                        int[] iArr = new int[2];
                        ((View) a.this.f60329a).getLocationInWindow(iArr);
                        aVar.f100223b = iArr[0] + referenceThumbPosition.left;
                        aVar.f100224c = iArr[1] + referenceThumbPosition.top;
                        aVar.f100225d = referenceThumbPosition.width();
                        aVar.f100226e = referenceThumbPosition.height();
                        return aVar;
                    }
                    return null;
                }

                @Override // com.zing.zalo.p077ui.zviews.StoryDetailsView.AbstractC15101b0
                /* renamed from: e */
                public void mo17197e(C31980jc c31980jc) {
                    try {
                        this.f60331a = TextUtils.equals(c31980jc.f147023p, a.this.f60329a.getMessage().m95239r4().f91142d.f148136g);
                    } catch (Exception e11) {
                        this.f60331a = false;
                        AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
                    }
                }
            }

            a(InterfaceC11475g0 interfaceC11475g0) {
                this.f60329a = interfaceC11475g0;
            }

            @Override // l30.C22033k0.i
            /* renamed from: O */
            public void mo45897O() {
                try {
                    C11603g0.this.m10008p();
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
                }
            }

            @Override // l30.C22033k0.i
            /* renamed from: a */
            public void mo45898a(String str, C22033k0.g gVar) {
                if (C11603g0.this.f60306Q.m92672lJ() && C11603g0.this.f60306Q.m92687sJ()) {
                    ToastUtils.showMess(str);
                }
                mo45897O();
            }

            @Override // l30.C22033k0.i
            /* renamed from: b */
            public void mo45899b(Bundle bundle, C22033k0.h hVar) {
                C17487o0 c17487o0;
                int i11;
                if (C11603g0.this.f60306Q.m92672lJ() && C11603g0.this.f60306Q.m92687sJ()) {
                    if (C11603g0.this.f60306Q.m92676n2() != null) {
                        c17487o0 = C11603g0.this.f60306Q.m92676n2().mo35579p();
                    } else {
                        c17487o0 = null;
                    }
                    C17487o0 c17487o02 = c17487o0;
                    if (c17487o02 != null) {
                        C11603g0.this.f60306Q.m60020gQ().mo60832x4(false);
                        if (C11603g0.this.f60306Q.m92676n2().mo35585v() != null && C11603g0.this.f60306Q.m92676n2().mo35585v().getId() != 0) {
                            i11 = C11603g0.this.f60306Q.m92676n2().mo35585v().getId();
                        } else {
                            i11 = R.id.content;
                        }
                        if (g.this.mo62071Y3()) {
                            i11 = AbstractC6918a0.chat_head_full_container;
                        }
                        int i12 = i11;
                        AbstractC2379w.m12430d(C11603g0.this.f60306Q.f56832b1);
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        Bundle bundle2 = bundle;
                        bundle2.putInt("srcType", 337);
                        ((StoryDetailsView) c17487o02.mo57057c2(i12, StoryDetailsView.class, bundle2, 0, null, 1, true)).m84675EP(new C32752a());
                    }
                }
            }
        }

        /* renamed from: com.zing.zalo.ui.chat.g0$g$b */
        /* loaded from: classes5.dex */
        class b implements InterfaceC20094a {

            /* renamed from: a */
            final /* synthetic */ String f60333a;

            /* renamed from: b */
            final /* synthetic */ InterfaceC11475g0 f60334b;

            /* renamed from: com.zing.zalo.ui.chat.g0$g$b$a */
            /* loaded from: classes5.dex */
            class a extends AbstractC0939u {

                /* renamed from: a */
                final /* synthetic */ ContactProfile f60336a;

                a(ContactProfile contactProfile) {
                    this.f60336a = contactProfile;
                }

                @Override // p660xw.InterfaceC30214a
                /* renamed from: a */
                public void mo928a() {
                    C7960e.m41971c6().m42349b8(this.f60336a);
                }
            }

            b(String str, InterfaceC11475g0 interfaceC11475g0) {
                this.f60333a = str;
                this.f60334b = interfaceC11475g0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: d */
            public static /* synthetic */ void m64583d(InterfaceC11475g0 interfaceC11475g0) {
                ((ChatRow) interfaceC11475g0.getChatRowView()).m61119v3(false);
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: a */
            public void mo926a(C20096c c20096c) {
                ToastUtils.m89264l(c20096c);
                C11603g0.this.f60316a0 = false;
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: b */
            public void mo927b(Object obj) {
                String str;
                String str2;
                int i11;
                JSONObject optJSONObject;
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("error_code") && jSONObject.has("data") && jSONObject.optInt("error_code", -1000) == 0) {
                        if (jSONObject.has("data") && !jSONObject.isNull("data") && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                            i11 = optJSONObject.optInt("action", 0);
                            str = optJSONObject.optString("alias");
                            str2 = optJSONObject.optString("desc");
                        } else {
                            str = "";
                            str2 = "";
                            i11 = 0;
                        }
                        C28203u6 c28203u6 = C28203u6.f131407a;
                        ContactProfile m141809c = c28203u6.m141809c(this.f60333a);
                        if (m141809c == null) {
                            return;
                        }
                        Map map = AbstractC23304d.f113405l;
                        if (map.containsKey(this.f60333a)) {
                            C31965ic c31965ic = (C31965ic) map.get(this.f60333a);
                            Objects.requireNonNull(c31965ic);
                            m141809c.f42438s0 = c31965ic.m153681a();
                        }
                        m141809c.f42441t0 = true;
                        m141809c.f42456y0 = i11;
                        if (!TextUtils.isEmpty(str)) {
                            m141809c.f42442t1 = str;
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            m141809c.f42436r1 = new SpannableStringBuilder(str2);
                        }
                        C31853b5 m114357s = C21927m.m114302u().m114357s();
                        if (m114357s != null) {
                            if (!m114357s.m153137g(this.f60333a)) {
                                m114357s.add(m141809c);
                                C0824j.m2153b(new a(m141809c));
                            } else if (m114357s.m153138j(this.f60333a) != null) {
                                m141809c = m114357s.m153138j(this.f60333a);
                                m141809c.f42456y0 = i11;
                                if (!TextUtils.isEmpty(str)) {
                                    m141809c.f42442t1 = str;
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    m141809c.f42436r1 = new SpannableStringBuilder(str2);
                                }
                            }
                        }
                        C31965ic c31965ic2 = (C31965ic) map.get(CoreUtility.f89233i);
                        if (c31965ic2 != null) {
                            c31965ic2.m153684d(c31965ic2.m153681a() + 1);
                        }
                        c28203u6.m141806D(this.f60333a, false);
                        if (!TextUtils.isEmpty(m141809c.f42434r)) {
                            AbstractC23181q.m119431d(m141809c.f42434r, true);
                        }
                        ToastUtils.m89266n(AbstractC8020f0.str_tv_follow_success, new Object[0]);
                        final InterfaceC11475g0 interfaceC11475g0 = this.f60334b;
                        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.chat.m0
                            @Override // java.lang.Runnable
                            public final void run() {
                                C11603g0.g.b.m64583d(InterfaceC11475g0.this);
                            }
                        });
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
                }
                C11603g0.this.f60316a0 = false;
            }
        }

        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public static /* synthetic */ void m64575k(C17945a0 c17945a0, String str, String str2) {
            try {
                if (AbstractC28207v1.m141982g1(str)) {
                    c17945a0.m95111d9();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m64576l() {
            C11603g0.this.f60306Q.m59790QT(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m64577m(boolean z11, C17945a0 c17945a0, View view) {
            if (!z11) {
                C11603g0.this.m64512X1(view);
            } else {
                C11603g0.this.f60306Q.m60145oQ(c17945a0.m94854B4(), Long.parseLong(c17945a0.m94862C4()));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m64578n(final C17945a0 c17945a0, final View view) {
            final boolean z11;
            C32076q5 m4476k = C0943w.m4462l().m4476k(C11603g0.this.f57026x.m17944I0());
            if (c17945a0 != null && m4476k != null && m4476k.m154722k(c17945a0.m94862C4())) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.chat.l0
                @Override // java.lang.Runnable
                public final void run() {
                    C11603g0.g.this.m64577m(z11, c17945a0, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public /* synthetic */ void m64579p(InterfaceC11475g0 interfaceC11475g0) {
            C11603g0.this.f60306Q.m60209sU(Collections.singletonList(interfaceC11475g0.getMessage()));
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: A4 */
        public int mo62032A4() {
            if (C11603g0.this.f60306Q != null) {
                return C11603g0.this.f60306Q.f56896r1;
            }
            return C29384b.m146529g();
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: B4 */
        public void mo62033B4(String str) {
            if (!m64581j()) {
                return;
            }
            if (m64580i()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_perform_action));
            } else if (C11603g0.this.f60306Q != null) {
                C11603g0.this.f60306Q.m60020gQ().mo60613O9(str, C11603g0.this.f57024v);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: C4 */
        public void mo62034C4(InterfaceC11475g0 interfaceC11475g0) {
            try {
                if (!m64581j()) {
                    return;
                }
                if (m64580i()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_perform_action));
                    return;
                }
                C17945a0 message = interfaceC11475g0.getMessage();
                if (message != null && !message.m95098c6()) {
                    C11603g0.this.f60306Q.m60020gQ().mo60572Hc(message, "csc_msg_button");
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: D1 */
        public int mo62035D1() {
            if (C11603g0.this.f60306Q != null) {
                return C11603g0.this.f60306Q.m60020gQ().mo60549D1();
            }
            return 0;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: D4 */
        public void mo62036D4(InterfaceC11475g0 interfaceC11475g0) {
            try {
                if (!m64581j()) {
                    return;
                }
                if (m64580i()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_perform_action));
                    return;
                }
                C17945a0 message = interfaceC11475g0.getMessage();
                if (message.m95032V6() && message.m95018U0()) {
                    C11603g0.this.f60306Q.m60006fU(message);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: E4 */
        public void mo62037E4(InterfaceC11475g0 interfaceC11475g0) {
            C11603g0.this.f60306Q.m60020gQ().mo60778p3(interfaceC11475g0.getMessage());
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: F4 */
        public C17945a0 mo62038F4() {
            if (C11603g0.this.f60312W != null && (C11603g0.this.f60312W.m95219o8() || C11603g0.this.f60312W.m95091b6())) {
                C11603g0.this.f60312W = null;
            }
            return C11603g0.this.f60312W;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: G3 */
        public boolean mo62039G3() {
            if (C11603g0.this.m60497k0() != null) {
                return C11603g0.this.m60497k0().mo61421G3();
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: G4 */
        public void mo62040G4(InterfaceC11475g0 interfaceC11475g0) {
            C24753f c24753f;
            JSONObject jSONObject;
            String str;
            C23855s0 m95584o;
            ZOM m124648v;
            ZOMInsight zOMInsight;
            try {
                if (!m64581j()) {
                    return;
                }
                if (m64580i()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_perform_action));
                    return;
                }
                if (C23055e5.m118272g(true) && interfaceC11475g0 != null && interfaceC11475g0.getMessage() != null) {
                    C17945a0 message = interfaceC11475g0.getMessage();
                    if (!message.m95075Z7()) {
                        ToastUtils.showMess(true, MainApplication.getAppContext().getString(AbstractC8020f0.str_can_not_react));
                        return;
                    }
                    C24751d m115837l = interfaceC11475g0.getReactionBar().m115837l();
                    if (m115837l != null) {
                        c24753f = m115837l.m128570n(Integer.parseInt(CoreUtility.f89233i));
                    } else {
                        c24753f = null;
                    }
                    if (c24753f == null) {
                        c24753f = C24265l.m126676s().m126700p();
                    }
                    if (C11603g0.this.f60306Q != null) {
                        C11603g0.this.f60306Q.m60163pU(interfaceC11475g0, c24753f.m128595h());
                    }
                    if ((message.m94929K2() instanceof C17967h1) && (m95584o = ((C17967h1) message.m94929K2()).m95584o()) != null && (m124648v = m95584o.m124648v("reactions")) != null && (zOMInsight = m124648v.mInsight) != null) {
                        jSONObject = zOMInsight.toJsonObject();
                    } else {
                        jSONObject = null;
                    }
                    AbstractC19646n0.m102960b2(message, c24753f, 0, true, jSONObject);
                    if (C11603g0.this.f60306Q != null && C11603g0.this.f60306Q.m59745NQ()) {
                        str = "90014301";
                    } else {
                        str = "90014311";
                    }
                    AbstractC23647d.m123897g(str);
                    C0732w.Companion.m1189a().m1187q("reaction_send", "msg_reaction_btn_quickly", null, C22423y.m115852c(c24753f.m128595h(), message, true));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: H3 */
        public void mo62041H3(InterfaceC11475g0 interfaceC11475g0) {
            if (!m64581j()) {
                return;
            }
            int position = interfaceC11475g0.getPosition();
            AbstractC23647d.m123906p("900141");
            AbstractC23647d.m123893c();
            C11603g0.this.f60306Q.m59790QT(true);
            ChatDialogView mo60056iu = C11603g0.this.f60306Q.mo60056iu(174, Integer.valueOf(position));
            if (mo60056iu != null) {
                mo60056iu.m62969ON(new ChatDialogView.InterfaceC11590m() { // from class: com.zing.zalo.ui.chat.i0
                    @Override // com.zing.zalo.p077ui.chat.dialog.ChatDialogView.InterfaceC11590m
                    public final void onDismiss() {
                        C11603g0.g.this.m64576l();
                    }
                });
            } else {
                C11603g0.this.f60306Q.m59790QT(false);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: H4 */
        public boolean mo62042H4() {
            if (C11603g0.this.f60306Q != null && C11603g0.this.f60306Q.m59817SQ()) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: I3 */
        public void mo62043I3(InterfaceC11475g0 interfaceC11475g0) {
            if (!m64581j()) {
                return;
            }
            C17945a0 message = interfaceC11475g0.getMessage();
            if (message.m94929K2().f91016u.equals("recommened.user") || message.m94929K2().f91016u.equals("recommened.vip")) {
                String str = message.m94929K2().f91017v;
                String str2 = message.m94929K2().f91011p;
                String str3 = message.m94929K2().f91013r;
                C20011e c20011e = C20011e.f98374a;
                if (c20011e.m103841b(21) && c20011e.m103841b(22)) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("sourceCall", 21);
                    bundle.putInt("videoSourceCall", 22);
                    bundle.putString("EXTRA_UID", str);
                    bundle.putString("EXTRA_NAME", str2);
                    bundle.putString("EXTRA_AVATAR", str3);
                    C11603g0.this.f60306Q.mo60056iu(172, bundle);
                    C11603g0.this.f60306Q.m60020gQ().mo60832x4(false);
                    return;
                }
                if (c20011e.m103841b(21)) {
                    ContactProfile contactProfile = new ContactProfile(str);
                    contactProfile.f42437s = str2;
                    contactProfile.f42446v = str3;
                    C11603g0.this.f60306Q.mo59614Dk(21, contactProfile);
                    return;
                }
                if (c20011e.m103841b(22)) {
                    ContactProfile contactProfile2 = new ContactProfile(str);
                    contactProfile2.f42437s = str2;
                    contactProfile2.f42446v = str3;
                    C11603g0.this.f60306Q.mo59855Ua(22, contactProfile2);
                }
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: I4 */
        public void mo62044I4(InterfaceC11475g0 interfaceC11475g0, C32106s7 c32106s7, C17391z c17391z) {
            try {
                if (!m64581j()) {
                    return;
                }
                C11603g0.this.f60306Q.m59868VU(c32106s7, c17391z);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: J0 */
        public boolean mo62045J0() {
            if (C11603g0.this.f60306Q != null && C11603g0.this.f60306Q.m60020gQ().mo60583J0()) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: J3 */
        public boolean mo62046J3() {
            if (C11603g0.this.f60306Q != null && C11603g0.this.f60306Q.m59910YQ()) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: J4 */
        public void mo62047J4(C17945a0 c17945a0, C24751d c24751d) {
            String str;
            if (!m64581j()) {
                return;
            }
            if (m64580i()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_perform_action));
                return;
            }
            C11603g0.this.f60306Q.m60177qU(c17945a0, c24751d);
            if (C11603g0.this.f60306Q.m59745NQ()) {
                str = "90014306";
            } else {
                str = "90014316";
            }
            AbstractC23647d.m123897g(str);
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: K0 */
        public void mo62048K0(InterfaceC30793c.b bVar) {
            if (C11603g0.this.m60497k0() != null) {
                C11603g0.this.m60497k0().mo61422K0(bVar);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: K2 */
        public void mo62049K2(InterfaceC30793c.b bVar) {
            if (C11603g0.this.m60497k0() != null) {
                C11603g0.this.m60497k0().mo61423K2(bVar);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: K3 */
        public void mo62050K3(C17945a0 c17945a0) {
            if (!m64581j()) {
                return;
            }
            C11603g0.this.f60306Q.m60020gQ().mo60591K3(c17945a0);
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: K4 */
        public void mo62051K4(InterfaceC11475g0 interfaceC11475g0, String str) {
            int i11;
            try {
                if (!m64581j()) {
                    return;
                }
                if (C11603g0.this.f60306Q.m92676n2() != null) {
                    if (C31944h6.m153518C(C11603g0.this.f60306Q.m60020gQ().mo60663X1()) && !C31944h6.m153543i(str)) {
                        C11603g0.this.f60306Q.m59977dU(str);
                        C2526d.f10270a.m12723o0("csc", C11603g0.this.f60306Q.m60020gQ().mo60638S2());
                    } else {
                        int m40666e = TrackingSource.m40666e();
                        String m40669h = TrackingSource.m40669h(m40666e);
                        C17945a0 message = interfaceC11475g0.getMessage();
                        if (message != null && AbstractC21935u.m114519I(message.mo95039W2())) {
                            i11 = 8;
                        } else if (message != null && message.m94847A6()) {
                            i11 = 7;
                        } else {
                            i11 = 6;
                        }
                        C31944h6.m153526K(C11603g0.this.f60306Q.m92676n2(), str, m40666e, m40669h, i11);
                    }
                }
                C11603g0.this.f60306Q.m60020gQ().mo60832x4(false);
                C11603g0.this.m64507T1(interfaceC11475g0);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: L3 */
        public void mo62052L3(int i11, String str) {
            C31887d9 m155014e;
            try {
                if (!m64581j() || m64580i() || C11603g0.this.f60306Q.mo59988eh() || (m155014e = C32119t6.m155009c().m155014e(i11)) == null) {
                    return;
                }
                C11603g0.this.f60306Q.mo59989ek();
                C11603g0.this.f60306Q.mo60133na();
                if (C11603g0.this.f60306Q.f56846e3 != 1) {
                    C11603g0.this.f60306Q.mo59706Ka(1);
                }
                C11603g0.this.f60306Q.m60020gQ().mo60626Qb(true, m155014e, "", 3);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: L4 */
        public void mo62053L4(InterfaceC11475g0 interfaceC11475g0) {
            C17945a0 message;
            if (m64581j() && (message = interfaceC11475g0.getMessage()) != null && message.m95251s7() && C11603g0.this.f60311V == 1 && C11603g0.this.f60306Q != null) {
                C11603g0.this.f60306Q.m60020gQ().mo60672Yk(message);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: M3 */
        public void mo62054M3(C17945a0 c17945a0) {
            try {
                if (!m64581j()) {
                    return;
                }
                if (m64580i()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_perform_action));
                } else {
                    C11603g0.this.f60306Q.m59744NP(c17945a0);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: M4 */
        public void mo62055M4(InterfaceC11475g0 interfaceC11475g0) {
            if (!C11603g0.this.f60316a0) {
                C11603g0.this.f60316a0 = true;
                try {
                    String str = interfaceC11475g0.getMessage().m94929K2().f91017v;
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new b(str, interfaceC11475g0));
                    TrackingSource m114310H = C21927m.m114302u().m114310H(str);
                    if (m114310H == null) {
                        m114310H = new TrackingSource(-1);
                    }
                    c0766k.mo1578Y4(Integer.parseInt(str), m114310H);
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
                }
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: N3 */
        public void mo62056N3(InterfaceC11475g0 interfaceC11475g0) {
            try {
                if (m64581j() && C11603g0.this.f60306Q != null) {
                    C11603g0.this.f60306Q.m59976dT(interfaceC11475g0.getMessage());
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: N4 */
        public void mo62057N4(InterfaceC11475g0 interfaceC11475g0) {
            try {
                if (!m64581j()) {
                    return;
                }
                if (m64580i()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_perform_action));
                } else if (interfaceC11475g0.getMessage().m95239r4() != null) {
                    if (interfaceC11475g0.getMessage().m95239r4().f91142d != null) {
                        C22033k0.m115006h().m115017q(3, interfaceC11475g0.getMessage(), new a(interfaceC11475g0));
                    }
                    AbstractC23647d.m123906p("49150044");
                    AbstractC23647d.m123893c();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: O3 */
        public void mo62058O3(InterfaceC11475g0 interfaceC11475g0) {
            try {
                if (!m64581j()) {
                    return;
                }
                C17945a0 message = interfaceC11475g0.getMessage();
                if (!message.m94929K2().f91016u.equals("recommened.user") && !message.m94929K2().f91016u.equals("recommened.vip")) {
                    return;
                }
                Conversation conversation = new Conversation(message.m94929K2().f91017v);
                conversation.f42894r = message.m94929K2().f91011p;
                conversation.f42895s = message.m94929K2().f91013r;
                Bundle m140776b = new C27870vb(conversation.f42893q).m140777c(conversation).m140776b();
                m140776b.putString("SOURCE_ACTION", "8902");
                AbstractC23211s7.m119585r(C11603g0.this.f60306Q.m92676n2(), m140776b, conversation, 0, 0);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: P3 */
        public void mo62059P3(InterfaceC11475g0 interfaceC11475g0, C31883d5 c31883d5, String str) {
            try {
                if (!m64581j() || interfaceC11475g0.getMessage() == null) {
                    return;
                }
                C11603g0.this.f60306Q.m59804RU(interfaceC11475g0, c31883d5, str);
                C11603g0.this.f60306Q.m60020gQ().mo60832x4(false);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: Q1 */
        public void mo62060Q1(String str) {
            if (C11603g0.this.f60306Q != null) {
                C11603g0.this.f60306Q.mo59783Q1(str);
            } else {
                ToastUtils.showMess(str);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: Q3 */
        public void mo62061Q3(InterfaceC11475g0 interfaceC11475g0) {
            C17945a0 message;
            if (m64581j() && (message = interfaceC11475g0.getMessage()) != null) {
                C11603g0.this.f60306Q.m60209sU(Collections.singletonList(message));
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: R3 */
        public void mo62062R3(InterfaceC11475g0 interfaceC11475g0) {
            try {
                if (mo62101s4() == 3) {
                    if (interfaceC11475g0 instanceof ChatRowHasCaption) {
                        ((ChatRowHasCaption) interfaceC11475g0).setFullTextInContextMenu(true);
                        C11603g0.this.m10008p();
                    }
                } else if (interfaceC11475g0.getMessage() != null) {
                    interfaceC11475g0.getMessage().m95258t2();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: S */
        public boolean mo62063S(C17945a0 c17945a0) {
            if (C11603g0.this.m60486Y() != null) {
                return C11603g0.this.m60486Y().mo60399S(c17945a0);
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: S2 */
        public String mo62064S2() {
            return C11603g0.this.m64550B1();
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: S3 */
        public void mo62065S3() {
            C31887d9 m155014e;
            try {
                if (!m64581j() || m64580i() || C11603g0.this.f60306Q.mo59988eh() || (m155014e = C32119t6.m155009c().m155014e(1)) == null) {
                    return;
                }
                C11603g0.this.f60306Q.mo59989ek();
                C11603g0.this.f60306Q.mo60133na();
                C11603g0.this.f60306Q.mo59706Ka(1);
                C11603g0.this.f60306Q.m60020gQ().mo60626Qb(true, m155014e, "", null);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: T3 */
        public void mo62066T3(InterfaceC11475g0 interfaceC11475g0) {
            try {
                if (!m64581j()) {
                    return;
                }
                C11603g0.this.f60306Q.m59791QU(interfaceC11475g0.getMessage(), false, "csc_msg_bubble");
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: U3 */
        public void mo62067U3(InterfaceC11475g0 interfaceC11475g0) {
            if (interfaceC11475g0.getMessage() == null) {
                return;
            }
            if (interfaceC11475g0 instanceof ChatRowMultiPhotos) {
                C11603g0.this.f60306Q.m60209sU(((ChatRowMultiPhotos) interfaceC11475g0).getRolledMessagesInGroup());
            } else {
                C11603g0.this.f60306Q.m60209sU(Collections.singletonList(interfaceC11475g0.getMessage()));
            }
            C11603g0.this.m64507T1(interfaceC11475g0);
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: V3 */
        public void mo62068V3(C17945a0 c17945a0, int i11, boolean z11, boolean z12, boolean z13) {
            try {
                if (!m64581j()) {
                    return;
                }
                C11603g0.this.f60306Q.f56793R1.m64812r0(c17945a0, i11 + "", z11, z12, z13);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: W3 */
        public boolean mo62069W3() {
            if ((mo62089j3() && !C11603g0.this.f60308S) || !AbstractC23304d.m120536g().f147981b) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: X3 */
        public void mo62070X3(final View view) {
            final C17945a0 c17945a0;
            if (!m64581j()) {
                return;
            }
            if (m64580i()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_perform_action));
                return;
            }
            if (C11603g0.this.f60306Q.f56789Q1.m153886E() != EnumC18030a.GROUP) {
                C11603g0.this.m64512X1(view);
                return;
            }
            if (view instanceof InterfaceC11475g0) {
                c17945a0 = ((InterfaceC11475g0) view).getMessage();
            } else {
                c17945a0 = null;
            }
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.chat.h0
                @Override // java.lang.Runnable
                public final void run() {
                    C11603g0.g.this.m64578n(c17945a0, view);
                }
            });
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: Y3 */
        public boolean mo62071Y3() {
            if (C11603g0.this.f60306Q != null && C11603g0.this.f60306Q.mo60124n3()) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: Z3 */
        public void mo62072Z3(String str, Rect rect) {
            try {
                if (!m64581j()) {
                    return;
                }
                if (m64580i()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_perform_action));
                } else {
                    C11603g0.this.f60306Q.m59961cT(str, rect);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: a */
        public boolean mo62073a() {
            if (C11603g0.this.f60306Q.m59704KQ() && !C11603g0.this.f60306Q.m92649TI().m93029Q(CodeLockMessageView.class) && !C11603g0.this.f60306Q.f56916w1 && (!ZaloBubbleActivity.m57017B5() || C11603g0.this.f60306Q.mo60184qx())) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: a4 */
        public void mo62074a4(InterfaceC11475g0 interfaceC11475g0) {
            C17945a0 message;
            try {
                if (!m64581j() || (message = interfaceC11475g0.getMessage()) == null) {
                    return;
                }
                if (message.m95022U7()) {
                    C11603g0.this.f60306Q.m60209sU(Collections.singletonList(interfaceC11475g0.getMessage()));
                    C11603g0.this.m64507T1(interfaceC11475g0);
                    return;
                }
                int m95041W4 = message.m95041W4();
                if (m95041W4 == 2) {
                    C11603g0.this.m64534n2(interfaceC11475g0.getMessage());
                    C11603g0.this.m64507T1(interfaceC11475g0);
                } else if (m95041W4 == 3 || m95041W4 == 4) {
                    C11603g0.this.m64538p2(interfaceC11475g0);
                } else if (m95041W4 == 12) {
                    C11603g0.this.m64540q2(interfaceC11475g0);
                } else if (m95041W4 == 22) {
                    C11603g0.this.m64542r2(interfaceC11475g0);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: b */
        public boolean mo62075b() {
            return C11603g0.this.m64547v1();
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x02f7  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x02f5  */
        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: b4 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo62076b4(String str, String str2, int i11, final C17945a0 c17945a0) {
            char c11;
            boolean z11;
            String str3;
            boolean z12;
            String str4 = str2;
            try {
                if (!m64581j()) {
                    return;
                }
                if (m64580i()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_perform_action));
                    return;
                }
                int i12 = 6;
                switch (str.hashCode()) {
                    case -2093215502:
                        if (str.equals("action.groupcall.video")) {
                            c11 = 4;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1266440381:
                        if (str.equals("action.pin.msg.autogen")) {
                            c11 = 0;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -695399429:
                        if (str.equals("action.sticker.ai.open_mp")) {
                            c11 = 6;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -180438662:
                        if (str.equals("action.save.photo.album")) {
                            c11 = 2;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -176308535:
                        if (str.equals("action.set.reminder.msg")) {
                            c11 = 3;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1350516239:
                        if (str.equals("action.open.qrcode.footer")) {
                            c11 = 5;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1562689304:
                        if (str.equals("action.reply.msg.autogen")) {
                            c11 = 1;
                            break;
                        }
                        c11 = 65535;
                        break;
                    default:
                        c11 = 65535;
                        break;
                }
                String str5 = "";
                switch (c11) {
                    case 0:
                        C11603g0.this.f60306Q.m60112mP(c17945a0);
                        return;
                    case 1:
                        C11603g0.this.f60306Q.m60101lT(c17945a0);
                        return;
                    case 2:
                        ToastUtils.m89266n(AbstractC8020f0.str_feature_disabled, new Object[0]);
                        return;
                    case 3:
                        if (!str2.isEmpty()) {
                            JSONObject jSONObject = new JSONObject(str4);
                            if (jSONObject.has("openTimePicker")) {
                                int m96085d = AbstractC18069a.m96085d(jSONObject, "openTimePicker");
                                String m96089h = AbstractC18069a.m96089h(jSONObject, "stringTimeSuggestion");
                                if (jSONObject.has("isFooterLocal") && AbstractC18069a.m96083b(jSONObject, "isFooterLocal")) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                int i13 = 11;
                                if (TextUtils.isEmpty(m96089h)) {
                                    if (z11) {
                                        if (!C11603g0.this.f60306Q.m59745NQ()) {
                                            AbstractC23647d.m123897g("77709016");
                                        } else {
                                            AbstractC23647d.m123897g("77709017");
                                        }
                                        i12 = 11;
                                    } else if (!C11603g0.this.f60306Q.m59745NQ()) {
                                        AbstractC23647d.m123897g("77709002");
                                    } else {
                                        AbstractC23647d.m123897g("77709003");
                                    }
                                    i13 = i12;
                                } else if (z11) {
                                    if (!C11603g0.this.f60306Q.m59745NQ()) {
                                        AbstractC23647d.m123897g("77709016");
                                    } else {
                                        AbstractC23647d.m123897g("77709017");
                                    }
                                } else {
                                    if (!C11603g0.this.f60306Q.m59745NQ()) {
                                        AbstractC23647d.m123897g("77709010");
                                    } else {
                                        AbstractC23647d.m123897g("77709011");
                                    }
                                    str3 = "csc_msg_underline";
                                    i13 = 5;
                                    ChatView chatView = C11603g0.this.f60306Q;
                                    if (m96085d != 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    chatView.m59608DT(c17945a0, z12, i13, m96089h, str3);
                                    C0815e1.m2075D().m2090I(str, m96089h, c17945a0.m95032V6());
                                    return;
                                }
                                str3 = "csc_msg_footer";
                                ChatView chatView2 = C11603g0.this.f60306Q;
                                if (m96085d != 1) {
                                }
                                chatView2.m59608DT(c17945a0, z12, i13, m96089h, str3);
                                C0815e1.m2075D().m2090I(str, m96089h, c17945a0.m95032V6());
                                return;
                            }
                            return;
                        }
                        return;
                    case 4:
                        if (!str2.isEmpty()) {
                            JSONObject jSONObject2 = new JSONObject(str4);
                            if (C11603g0.this.f60306Q != null) {
                                long optLong = jSONObject2.optLong("groupId", 0L);
                                C11603g0.this.f60306Q.m60020gQ().mo60734h8(optLong + "", 9);
                                C11603g0.this.f60306Q.m60020gQ().mo64096Bb(24, "csc_msg_footer", 0, "gr_call_create", false, 2, String.valueOf(optLong));
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        if (c17945a0.m94871D7() && (c17945a0.m94929K2() instanceof C18009w0)) {
                            C11603g0.this.f60306Q.m60191rQ(((C18009w0) c17945a0.m94929K2()).m95791y());
                            return;
                        }
                        return;
                    case 6:
                        if (C3229a.f13790a.m16391e()) {
                            C2520a.f10235a.m12629k("ai_footer");
                            C11603g0.this.m64560e2(-10);
                            return;
                        } else {
                            ToastUtils.m89266n(AbstractC8020f0.str_this_feature_is_not_available, new Object[0]);
                            return;
                        }
                    default:
                        TrackingSource trackingSource = new TrackingSource(36);
                        trackingSource.m40677a("msgType", Integer.valueOf(c17945a0.m95041W4()));
                        trackingSource.m40677a("footerType", Integer.valueOf(i11));
                        C31877d c31877d = new C31877d(trackingSource);
                        if (str.equals("open.save.phonenumber")) {
                            C2526d.m12671v0("csc_msg_footer", C11603g0.this.f60306Q.m60004fQ());
                            if (!(C11603g0.this.f60306Q.m92693xK().m93012K0() instanceof GroupLiveStreamView) && !C11603g0.this.f60306Q.f56905t2) {
                                Bundle bundle = new Bundle();
                                bundle.putInt("action.open.save.phonenumber.openby", 2);
                                c31877d.m153185d(bundle);
                            }
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_save_to_contact_when_live_stream));
                            return;
                        }
                        if (str.equals("action.group.create.poll")) {
                            JSONObject jSONObject3 = new JSONObject(str4);
                            if (jSONObject3.optInt("textFromMsg") == 1) {
                                jSONObject3.put("text", c17945a0.m95019U3());
                                str4 = jSONObject3.toString();
                            }
                        } else {
                            if (!TextUtils.equals(str, "action.query.hide.v2") && !TextUtils.equals(str, "action.query.show.v2") && !TextUtils.equals(str, "action.request.multiaction")) {
                                if (TextUtils.equals(str, "action.open.location")) {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putParcelable("EXTRA_FOOTER_LOG_DATA", ActionLogChatLocation.f55164a.m56653i(c17945a0));
                                    c31877d.m153185d(bundle2);
                                } else if (TextUtils.equals(str, "action.copy.clipboard")) {
                                    C2526d.m12661k("csc_msg_footer", C11603g0.this.f60306Q.m60004fQ());
                                } else if (TextUtils.equals(str, "action.open.invitegroup")) {
                                    c31877d.m153183b("STR_LOG_CHAT_TYPE", C11603g0.this.f60306Q.m60004fQ());
                                }
                            }
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("globalMsgId", c17945a0.m95029V3().m41046j());
                            c31877d.m153185d(bundle3);
                        }
                        if (c17945a0.m95071Z3() != null) {
                            str5 = c17945a0.m95071Z3().m137360e();
                        }
                        C0815e1.m2075D().m2090I(str, str5, c17945a0.m95032V6());
                        C11603g0.this.f60306Q.mo60271wv(str, str4, new AbstractC28207v1.h0() { // from class: com.zing.zalo.ui.chat.k0
                            @Override // vg.AbstractC28207v1.h0, p483rh.InterfaceC25792a.c
                            /* renamed from: a */
                            public final void mo39930a(String str6, String str7) {
                                C11603g0.g.m64575k(C17945a0.this, str6, str7);
                            }
                        }, c31877d);
                        return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: c */
        public boolean mo62077c() {
            return C11603g0.this.f60303N;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: c3 */
        public int mo62078c3() {
            return C11603g0.this.f60306Q.m60020gQ().mo60696c3();
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: c4 */
        public C28769a mo62079c4(MessageId messageId) {
            return C11603g0.this.m60473E0(messageId);
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: d4 */
        public void mo62080d4(String str, String str2, boolean z11) {
            if (!m64581j()) {
                return;
            }
            C11603g0.this.f60306Q.mo59583Br(str, str2, "", true, z11);
            C11603g0.this.f60306Q.m60020gQ().mo60832x4(false);
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: e4 */
        public void mo62081e4(final InterfaceC11475g0 interfaceC11475g0, C20556f c20556f) {
            try {
                if (!m64581j()) {
                    return;
                }
                C17945a0 message = interfaceC11475g0.getMessage();
                if (AbstractC26687h.m137065f(message.mo95039W2(), message.m95238r3())) {
                    AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.chat.j0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C11603g0.g.this.m64579p(interfaceC11475g0);
                        }
                    });
                } else {
                    AbstractC23152n3.m119036c0(C11603g0.this.f60306Q.m92648SI(), c20556f);
                }
                C11603g0.this.f60306Q.m60020gQ().mo60832x4(false);
                if (message.m94929K2() instanceof C17990p0) {
                    ((C17990p0) message.m94929K2()).f91117F = true;
                }
                C11603g0.this.m64507T1(interfaceC11475g0);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: f4 */
        public boolean mo62082f4(String str) {
            return C11603g0.this.f57026x.m17944I0().equals(str);
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: g4 */
        public boolean mo62083g4() {
            if (C11603g0.this.f60306Q != null && C11603g0.this.f60306Q.mo60244v2()) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: h0 */
        public boolean mo62084h0(C17945a0 c17945a0) {
            if (C11603g0.this.m60486Y() != null) {
                return C11603g0.this.m60486Y().mo60402h0(c17945a0);
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: h4 */
        public void mo62085h4(C17945a0 c17945a0) {
            if (m64581j() && C11603g0.this.f60311V == 1 && C11603g0.this.f60306Q != null) {
                C11603g0.this.f60306Q.m59791QU(c17945a0, false, "csc_seenstatus");
            }
        }

        /* renamed from: i */
        public boolean m64580i() {
            if (C11603g0.this.f60306Q != null && (C11603g0.this.f60306Q.m60020gQ().mo60789r6() || C11603g0.this.f60306Q.m60020gQ().mo60839yb())) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: i0 */
        public boolean mo62086i0() {
            return C11603g0.this.f60306Q.m60020gQ().mo60741i0();
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: i1 */
        public void mo62087i1() {
            if (C11603g0.this.m60497k0() != null) {
                C11603g0.this.m60497k0().mo61427i1();
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: i4 */
        public void mo62088i4(InterfaceC11475g0 interfaceC11475g0, C27373c c27373c) {
            try {
                if (m64581j()) {
                    C11603g0.this.m64544s2(interfaceC11475g0, c27373c);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        /* renamed from: j */
        public boolean m64581j() {
            return C11603g0.this.m64487I1();
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: j3 */
        public boolean mo62089j3() {
            if (C11603g0.this.f60306Q != null && C11603g0.this.f60306Q.mo60060j3()) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: j4 */
        public void mo62090j4(View view, URLSpan uRLSpan) {
            if (!m64581j()) {
                return;
            }
            if (!m64580i()) {
                C11603g0.this.m64514Y1(view, uRLSpan);
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_perform_action));
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: k4 */
        public void mo62091k4(ChatRowMultiPhotos chatRowMultiPhotos) {
            try {
                if (!m64581j()) {
                    return;
                }
                if (m64580i()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_perform_action));
                } else {
                    C11603g0.this.f60306Q.m60020gQ().mo60754k9(chatRowMultiPhotos.getListMsgNotUndoInGroup(), "csc_group_msg_btn");
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: l4 */
        public void mo62092l4(ChatRowMultiStickers chatRowMultiStickers) {
            try {
                if (!m64581j()) {
                    return;
                }
                if (m64580i()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_perform_action));
                } else {
                    C11603g0.this.f60306Q.m60020gQ().mo60754k9(chatRowMultiStickers.getListMsgNotUndoInRow(), "csc_group_msg_btn");
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: m4 */
        public void mo62093m4(C3020p0 c3020p0, boolean z11) {
            int i11;
            if (!m64581j()) {
                return;
            }
            if (m64580i()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_perform_action));
                return;
            }
            if (c3020p0 != null) {
                try {
                    Bundle bundle = new Bundle();
                    bundle.putString("fid", c3020p0.f12057p);
                    bundle.putString("ownerId", c3020p0.m14465A());
                    if (z11) {
                        i11 = 12;
                    } else {
                        i11 = 16;
                    }
                    bundle.putString("extra_entry_point_flow", C32002l4.m154265h(ZMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM, i11).m154277l());
                    C11603g0.this.f60306Q.m92693xK().m93069k2(FeedDetailsView.class, bundle, 1, true);
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
                }
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: n4 */
        public void mo62094n4(InterfaceC11475g0 interfaceC11475g0) {
            int i11;
            String str;
            int i12;
            try {
                if (!m64581j()) {
                    return;
                }
                C11603g0.this.f60306Q.m60020gQ().mo60832x4(false);
                if (interfaceC11475g0 instanceof ChatRowMultiPhotos) {
                    C11603g0.this.f60306Q.m60020gQ().mo60622Pi(((ChatRowMultiPhotos) interfaceC11475g0).getPosition(), "csc_msg_button", C11603g0.this.m64569z1(interfaceC11475g0.getPosition()));
                    return;
                }
                if (interfaceC11475g0.getMessage().m94871D7()) {
                    i11 = 4;
                } else if (interfaceC11475g0.getMessage().m95306y8()) {
                    i11 = 5;
                } else if (interfaceC11475g0.getMessage().m95276v6()) {
                    i11 = 3;
                } else {
                    i11 = -1;
                }
                if (interfaceC11475g0.getMessage() != null) {
                    if (interfaceC11475g0.getMessage().m94847A6()) {
                        i12 = 8;
                    } else {
                        i12 = 6;
                    }
                    str = new TrackingSource(i12).m40686z();
                } else {
                    str = "";
                }
                AbstractC19646n0.m102966d0(C11603g0.this.f60306Q.m92676n2(), interfaceC11475g0.getMessage(), false, i11, str, "csc_msg_button", mo62064S2(), C11603g0.this.m64569z1(interfaceC11475g0.getPosition()));
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: o */
        public void mo62095o() {
            if (C11603g0.this.m60486Y() != null) {
                C11603g0.this.m60486Y().mo60407o();
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: o4 */
        public boolean mo62096o4() {
            if (C11603g0.this.f60306Q != null && C11603g0.this.f60306Q.mo60184qx()) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: p4 */
        public void mo62097p4(C17945a0 c17945a0, Point point, boolean z11) {
            String str;
            if (!m64581j()) {
                return;
            }
            if (m64580i()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_perform_action));
                return;
            }
            C11603g0.this.f60306Q.m60193rU(c17945a0, point, z11, true);
            if (C11603g0.this.f60306Q.m59745NQ()) {
                str = "90014300";
            } else {
                str = "90014310";
            }
            AbstractC23647d.m123897g(str);
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: q4 */
        public void mo62098q4(InterfaceC11475g0 interfaceC11475g0) {
            boolean z11;
            int i11;
            String str;
            String str2;
            try {
                if (!m64581j()) {
                    return;
                }
                if (interfaceC11475g0 instanceof ChatRowVideoInline) {
                    C11603g0.this.m64518b2(interfaceC11475g0);
                    return;
                }
                if (interfaceC11475g0.getMessage() != null) {
                    if (C11603g0.this.m60486Y() != null && C11603g0.this.m60486Y().mo60402h0(interfaceC11475g0.getMessage())) {
                        C11603g0.this.m60486Y().mo60407o();
                        return;
                    }
                    int m95041W4 = interfaceC11475g0.getMessage().m95041W4();
                    if (m95041W4 != 0) {
                        int i12 = 4;
                        int i13 = 3;
                        boolean z12 = false;
                        if (m95041W4 != 12) {
                            if (m95041W4 != 25) {
                                if (m95041W4 != 100) {
                                    if (m95041W4 != 3 && m95041W4 != 4) {
                                        if (m95041W4 != 18) {
                                            if (m95041W4 != 19) {
                                                return;
                                            }
                                        } else {
                                            C11603g0.this.m64559d2(interfaceC11475g0.getMessage());
                                            C11603g0.this.m64507T1(interfaceC11475g0);
                                            ActionLogChatLocation.f55164a.m56650d(interfaceC11475g0.getMessage());
                                            return;
                                        }
                                    }
                                } else {
                                    C17945a0 message = interfaceC11475g0.getMessage();
                                    if (message != null && (message.m94929K2() instanceof C17972j0)) {
                                        str2 = ((C17972j0) message.m94929K2()).m95612i();
                                    } else {
                                        str2 = "";
                                    }
                                    if (!TextUtils.isEmpty(str2)) {
                                        SensitiveData sensitiveData = new SensitiveData("clipboard_copy_bank_account_csc", "comm_csc");
                                        if (C8937j0.m47663l(sensitiveData.m35528c())) {
                                            ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119768g(C11603g0.this.f60306Q.m92689tK(), str2, sensitiveData, false);
                                            Snackbar.Companion.m90668c(C11603g0.this.f60306Q.f56793R1.f60408d, AbstractC8020f0.str_mess_copied_account_number, -1).m90648N();
                                            return;
                                        } else {
                                            ToastUtils.showMess(C11603g0.this.f60306Q.m92689tK().getString(AbstractC8020f0.str_sensitive_clipboard_block_title));
                                            return;
                                        }
                                    }
                                    return;
                                }
                            } else {
                                C20024r.m103937c();
                                if (C20024r.m103941j()) {
                                    ToastUtils.m89266n(AbstractC8020f0.str_call_cannot_open_camera_while_in_call, new Object[0]);
                                    return;
                                }
                                if (interfaceC11475g0.getMessage() != null && (interfaceC11475g0.getMessage().m94929K2() instanceof C17999s0)) {
                                    C11603g0.this.f60306Q.mo60094l7(0, false);
                                    String str3 = ((C17999s0) interfaceC11475g0.getMessage().m94929K2()).f91173G;
                                    ZaloView m93012K0 = C11603g0.this.f60306Q.m92693xK().m93012K0();
                                    if ((m93012K0 instanceof GroupLiveStreamView) && ((GroupLiveStreamView) m93012K0).m66457yM(str3)) {
                                        ((GroupLiveStreamView) m93012K0).m66440NM();
                                        return;
                                    }
                                    if (CoreUtility.f89233i.equals(interfaceC11475g0.getMessage().m94862C4()) && !((C17999s0) interfaceC11475g0.getMessage().m94929K2()).f91168B) {
                                        Bundle bundle = new Bundle();
                                        bundle.putString("stream_id", str3);
                                        C11603g0.this.f60306Q.m92693xK().m93069k2(GroupLiveStreamView.class, bundle, 1, true);
                                        return;
                                    } else {
                                        C11603g0.this.f60306Q.m59836TU((ChatRowVideoLiveStream) interfaceC11475g0);
                                        C11603g0.this.f60306Q.m60020gQ().mo60832x4(false);
                                        return;
                                    }
                                }
                                return;
                            }
                        } else {
                            if (interfaceC11475g0.getMessage().m94929K2() != null) {
                                String str4 = interfaceC11475g0.getMessage().m94929K2().f91016u;
                                if (!str4.equals("recommened.user") && !str4.equals("recommened.vip")) {
                                    if (!str4.equals("recommened.link")) {
                                        if (str4.equals("recommened.stickerset")) {
                                            C3245i c3245i = new C3245i(new JSONObject(interfaceC11475g0.getMessage().m94929K2().f91017v));
                                            int m40666e = TrackingSource.m40666e();
                                            AbstractC23152n3.m119066r0(C11603g0.this.f60306Q.m92676n2(), c3245i.f13854b, "", m40666e, TrackingSource.m40669h(m40666e), 0);
                                        } else if (str4.equals("recommened.misscall")) {
                                            if (!((C18013y0) interfaceC11475g0.getMessage().m94929K2()).f91252C.m95615a()) {
                                                return;
                                            }
                                            if (((C18013y0) interfaceC11475g0.getMessage().m94929K2()).f91252C.f91038a == 0) {
                                                z12 = true;
                                            }
                                            if (C11603g0.this.f60306Q != null) {
                                                AbstractC23647d.m123906p("400307");
                                                AbstractC23647d.m123893c();
                                                AbstractC23647d.m123906p("9110");
                                                if (C11603g0.this.f60306Q.m92693xK().m93012K0() instanceof GroupLiveStreamView) {
                                                    ToastUtils.showMess(true, C11603g0.this.f60306Q.m92652XI(AbstractC8020f0.ls_can_not_call_when_live));
                                                    return;
                                                }
                                                C3535c mo60615Oc = C11603g0.this.f60306Q.m60020gQ().mo60615Oc();
                                                if (((C18013y0) interfaceC11475g0.getMessage().m94929K2()).f91252C.f91042e) {
                                                    C11603g0.this.f60306Q.mo59614Dk(53, mo60615Oc.m17971y0().m40996I());
                                                } else if (!C11603g0.this.f60306Q.m60020gQ().mo60837xo()) {
                                                    if (AbstractC23309i.m120999H3() && !z12) {
                                                        C11603g0.this.f60306Q.mo59855Ua(8, mo60615Oc.m17971y0().m40996I());
                                                    }
                                                    C11603g0.this.f60306Q.mo59614Dk(7, mo60615Oc.m17971y0().m40996I());
                                                }
                                                AbstractC23647d.m123893c();
                                            }
                                        } else if (str4.equals("recommened.calltime")) {
                                            if (!((C18013y0) interfaceC11475g0.getMessage().m94929K2()).f91252C.m95615a()) {
                                                return;
                                            }
                                            if (((C18013y0) interfaceC11475g0.getMessage().m94929K2()).f91252C.f91038a == 0) {
                                                z12 = true;
                                            }
                                            if (interfaceC11475g0.getMessage().m95032V6()) {
                                                AbstractC23647d.m123906p("400309");
                                            } else {
                                                AbstractC23647d.m123906p("400308");
                                            }
                                            AbstractC23647d.m123893c();
                                            if (interfaceC11475g0.getMessage().m95032V6()) {
                                                i13 = 5;
                                            }
                                            if (interfaceC11475g0.getMessage().m95032V6()) {
                                                i12 = 6;
                                            }
                                            if (((C18013y0) interfaceC11475g0.getMessage().m94929K2()).f91252C.f91042e) {
                                                if (interfaceC11475g0.getMessage().m95032V6()) {
                                                    i13 = 51;
                                                } else {
                                                    i13 = 52;
                                                }
                                            }
                                            if (C11603g0.this.f60306Q != null) {
                                                if (C11603g0.this.f60306Q.m92693xK().m93012K0() instanceof GroupLiveStreamView) {
                                                    ToastUtils.showMess(true, C11603g0.this.f60306Q.m92652XI(AbstractC8020f0.ls_can_not_call_when_live));
                                                    return;
                                                }
                                                if (AbstractC23309i.m120999H3() && !z12) {
                                                    C11603g0.this.f60306Q.mo59855Ua(i12, C11603g0.this.f60306Q.m60020gQ().mo60615Oc().m17971y0().m40996I());
                                                }
                                                C11603g0.this.f60306Q.mo59614Dk(i13, C11603g0.this.f60306Q.m60020gQ().mo60615Oc().m17971y0().m40996I());
                                            }
                                        } else if (str4.equals("recommened.groupcall")) {
                                            C17975k0 c17975k0 = ((C18013y0) interfaceC11475g0.getMessage().m94929K2()).f91252C;
                                            C11603g0.this.f60306Q.m60020gQ().mo60556E9(c17975k0.f91043f, c17975k0.f91044g, c17975k0.f91046i, 100, c17975k0.f91045h);
                                        }
                                    }
                                }
                                String str5 = interfaceC11475g0.getMessage().m94929K2().f91017v;
                                if (TextUtils.isEmpty(str5) && (interfaceC11475g0.getMessage().m94929K2() instanceof C18013y0) && ((C18013y0) interfaceC11475g0.getMessage().m94929K2()).f91253D != null && (str = ((C18013y0) interfaceC11475g0.getMessage().m94929K2()).f91253D.f91055c) != null) {
                                    str5 = C31943h5.f146766a.m153507i(str, false);
                                }
                                if (TextUtils.isEmpty(str5)) {
                                    ToastUtils.m89266n(AbstractC8020f0.str_contact_info_loading, new Object[0]);
                                    return;
                                }
                                C32002l4 m154284u = C11603g0.this.f60306Q.m60020gQ().mo60722g().m154284u(15);
                                if (AbstractC21935u.m114518H(str5) && !AbstractC25495a.m132086k(str5)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                C17945a0 message2 = interfaceC11475g0.getMessage();
                                if (!str5.equals(CoreUtility.f89233i)) {
                                    if (z11) {
                                        i11 = 292;
                                    } else {
                                        i11 = 32;
                                    }
                                    TrackingSource trackingSource = new TrackingSource(i11);
                                    if (interfaceC11475g0.getMessage().m94847A6()) {
                                        trackingSource.m40678b("shareSource", 1);
                                        trackingSource.m40678b("uidTo", message2.mo95039W2());
                                    } else {
                                        trackingSource.m40678b("shareSource", 0);
                                        trackingSource.m40678b("uidTo", message2.m94862C4());
                                        trackingSource.m40678b("nameHolder", message2.m94854B4());
                                    }
                                    C21927m.m114302u().m114330e0(str5, trackingSource);
                                }
                                new C19171b().m101508a(new C19171b.a(C11603g0.this.f60306Q.m92676n2(), new C26365a.b(str5, m154284u).m135743b(), 0, 1));
                            }
                            C11603g0.this.m64507T1(interfaceC11475g0);
                            return;
                        }
                    }
                    C11603g0.this.m64518b2(interfaceC11475g0);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: r3 */
        public void mo62099r3(C17945a0 c17945a0) {
            if (!m64581j()) {
                return;
            }
            C11603g0.this.f60306Q.m60020gQ().mo60787r3(c17945a0);
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: r4 */
        public void mo62100r4(String str, String str2, String str3) {
            char c11;
            try {
                if (!m64581j()) {
                    return;
                }
                if (m64580i()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_perform_action));
                    return;
                }
                if (C11603g0.this.f60306Q != null && !C11603g0.this.f60306Q.mo60294yp()) {
                    switch (str.hashCode()) {
                        case -1802603850:
                            if (str.equals("action.group.update.notice")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -700316982:
                            if (str.equals("action.group.open.admintool")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 157465136:
                            if (str.equals("action.groupchat.jump.msg")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 188467901:
                            if (str.equals("action.open.profile")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    if (c11 != 0) {
                        if (c11 != 1) {
                            if (c11 != 2) {
                                if (c11 != 3) {
                                    AbstractC23647d.m123897g("10009002");
                                } else {
                                    AbstractC23647d.m123897g("10009005");
                                }
                            } else {
                                AbstractC23647d.m123897g("10009004");
                            }
                        } else {
                            AbstractC23647d.m123897g("10009003");
                        }
                    } else {
                        AbstractC23647d.m123897g("10009001");
                    }
                    C31877d c31877d = new C31877d();
                    if (TextUtils.equals(str, "action.query.hide.v2") || TextUtils.equals(str, "action.query.show.v2") || TextUtils.equals(str, "action.request.multiaction")) {
                        Bundle bundle = new Bundle();
                        bundle.putString("globalMsgId", str3);
                        c31877d.m153185d(bundle);
                    }
                    c31877d.f146421g = "msg_info";
                    C11603g0.this.f60306Q.mo60271wv(str, str2, null, c31877d);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: s4 */
        public int mo62101s4() {
            return C11603g0.this.mo60487Z();
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        public void setMoveTextSelectHandleController(InterfaceC30793c.a aVar) {
            if (C11603g0.this.m60497k0() != null) {
                C11603g0.this.m60497k0().setMoveTextSelectHandleController(aVar);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        public void setOnFirstReleaseAfterSelectingNewTextListener(Runnable runnable) {
            if (C11603g0.this.m60497k0() != null) {
                C11603g0.this.m60497k0().setOnFirstReleaseAfterSelectingNewTextListener(runnable);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: t4 */
        public EnumC18030a mo62102t4() {
            return C11603g0.this.mo60488a0();
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: u4 */
        public boolean mo62103u4() {
            if (C11603g0.this.f60306Q != null && C11603g0.this.f60306Q.m59896XQ()) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: v4 */
        public void mo62104v4(InterfaceC11475g0 interfaceC11475g0) {
            try {
                if (m64581j() && interfaceC11475g0 != null) {
                    Iterator it = ((C28771c) C11603g0.this.f57009B.get(interfaceC11475g0.getPosition())).m143950j().iterator();
                    while (it.hasNext()) {
                        mo62079c4(((C17945a0) it.next()).m95029V3()).f133322r = 3;
                    }
                    C11603g0.this.f60306Q.mo60268wf(true);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: w4 */
        public void mo62105w4(InterfaceC11475g0 interfaceC11475g0) {
            try {
                if (m64581j() && C11603g0.this.f60306Q != null) {
                    C11603g0.this.f60306Q.mo60056iu(160, interfaceC11475g0.getMessage().m94912I2());
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: x4 */
        public boolean mo62106x4() {
            if (C11603g0.this.f60306Q != null && !C11603g0.this.f60306Q.m59962cU()) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: y4 */
        public void mo62107y4(InterfaceC11475g0 interfaceC11475g0) {
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v
        /* renamed from: z4 */
        public void mo62108z4(String str) {
            if (m64581j()) {
                ChatView chatView = C11603g0.this.f60306Q;
                boolean z11 = true;
                if (C11603g0.this.f60311V != 1) {
                    z11 = false;
                }
                chatView.m59987eT(str, z11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.g0$h */
    /* loaded from: classes5.dex */
    class h implements InterfaceC11505n2 {
        h() {
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11505n2
        /* renamed from: A */
        public boolean mo62022A(String str, MessageId messageId) {
            try {
                if (C11603g0.this.m60486Y() != null) {
                    return C11603g0.this.m60486Y().mo60394A(str, messageId);
                }
                return false;
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
                return false;
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11505n2
        /* renamed from: a */
        public void mo62023a(String str, MessageId messageId) {
            try {
                if (C11603g0.this.m64487I1() && C11603g0.this.m60486Y() != null) {
                    C11603g0.this.m60486Y().mo60395O0(0, str, messageId);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11505n2
        /* renamed from: b */
        public void mo62024b(int i11) {
            if (!C11603g0.this.m64487I1()) {
                return;
            }
            if (C23055e5.m118271f()) {
                C11603g0.this.f60306Q.mo60056iu(400, new int[]{i11, 1});
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11505n2
        /* renamed from: c */
        public void mo62025c(int i11) {
            if (!C11603g0.this.m64487I1()) {
                return;
            }
            if (i11 == -10) {
                if (C11603g0.this.f60311V != 1) {
                    return;
                } else {
                    C2520a.f10235a.m12629k("csc");
                }
            }
            C11603g0.this.m64560e2(i11);
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11505n2
        /* renamed from: d */
        public void mo62026d(C29676b c29676b) {
            if (!C11603g0.this.m64487I1()) {
                return;
            }
            C11603g0.this.f60306Q.m60020gQ().mo60652V9(c29676b);
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11505n2
        /* renamed from: e */
        public ViewGroup mo62027e() {
            if (C11603g0.this.f60306Q != null && C11603g0.this.f60306Q.f56793R1 != null) {
                return C11603g0.this.f60306Q.f56793R1.f60408d;
            }
            return null;
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11505n2
        /* renamed from: f */
        public void mo62028f(ChatRow chatRow) {
            try {
                if (!C11603g0.this.m64487I1()) {
                    return;
                }
                if (chatRow != null && chatRow.getMessage() != null && (chatRow.getMessage().m94929K2() instanceof C17949b1)) {
                    C25630b m95397g = ((C17949b1) chatRow.getMessage().m94929K2()).m95397g();
                    if (m95397g == null) {
                        return;
                    }
                    if (C3255n.m16560k()) {
                        int m132427f = m95397g.m132427f();
                        if (C3255n.m16562n().m16580x(m132427f) && C11603g0.this.mo60487Z() == 1) {
                            ((C21272r) C21272r.Companion.m122672a()).m110181j(2);
                            C21270p.m110079C().m110152Z(2, 6, "6_1", m95397g.m132432j());
                            mo62025c(m132427f);
                        } else {
                            mo62024b(m95397g.m132432j());
                        }
                    } else {
                        int m40666e = TrackingSource.m40666e();
                        AbstractC23152n3.m119066r0(C11603g0.this.f60306Q.m92676n2(), m95397g.m132432j(), "", m40666e, TrackingSource.m40669h(m40666e), 1);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11603g0.f60302e0, e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11505n2
        /* renamed from: k */
        public void mo62029k() {
            if (C11603g0.this.m60486Y() != null) {
                C11603g0.this.m60486Y().mo60405k();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.g0$i */
    /* loaded from: classes5.dex */
    class i implements ChatRowWebContent.InterfaceC11446g {
        i() {
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowWebContent.InterfaceC11446g
        /* renamed from: a */
        public void mo61864a(String str, String str2, AbstractC28207v1.h0 h0Var, C17945a0 c17945a0) {
            C31877d c31877d;
            if (!C11603g0.this.m64487I1()) {
                return;
            }
            if (C11603g0.this.f60306Q != null && ((C11603g0.this.f60306Q.m60020gQ().mo60789r6() || C11603g0.this.f60306Q.m60020gQ().mo60839yb()) && !TextUtils.equals(str, "action.open.calendar.event"))) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_perform_action));
                return;
            }
            if (C11603g0.this.f60306Q != null) {
                if (!TextUtils.equals(str, "action.open.rating.call") && !TextUtils.equals(str, "action.query.hide.v2") && !TextUtils.equals(str, "action.query.show.v2") && !TextUtils.equals(str, "action.request.multiaction")) {
                    c31877d = null;
                } else {
                    C31877d c31877d2 = new C31877d();
                    Bundle bundle = new Bundle();
                    bundle.putString("globalMsgId", c17945a0.m95029V3().m41046j());
                    bundle.putString("clientMsgId", c17945a0.m95029V3().m41044h());
                    c31877d2.m153185d(bundle);
                    c31877d = c31877d2;
                }
                C11603g0.this.f60306Q.mo60271wv(str, str2, h0Var, c31877d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.g0$j */
    /* loaded from: classes5.dex */
    public class j extends AbstractRunnableC28185s6 {
        j(AbstractRunnableC28185s6.b bVar, List list, int i11) {
            super(bVar, list, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m64585h() {
            C11603g0.this.m10008p();
        }

        @Override // vg.AbstractRunnableC28185s6
        /* renamed from: c */
        public void mo61137c(ArrayList arrayList) {
            super.mo61137c(arrayList);
            if (arrayList != null && arrayList.size() > 0) {
                C11603g0.this.f60306Q.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.chat.n0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11603g0.j.this.m64585h();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.g0$k */
    /* loaded from: classes5.dex */
    public class k extends ClickableSpan {
        k() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Bundle bundle = new Bundle();
            bundle.putInt(C31877d.f146414i, 1063);
            C31877d c31877d = new C31877d();
            c31877d.m153185d(bundle);
            AbstractC28207v1.m141994i3("action.open.highlightsetting", 3, C11603g0.this.f60306Q.m92676n2(), C11603g0.this.f60306Q, "{\"highlightId\":5}", c31877d);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(C23212s8.m119607o(MainApplication.getAppContext(), AbstractC16781w.LinkColor));
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        }
    }

    public C11603g0(ChatView chatView, C23528a c23528a, int i11, InterfaceC23792b interfaceC23792b) {
        this.f60308S = true;
        this.f60306Q = chatView;
        this.f60305P = c23528a;
        this.f60307R = interfaceC23792b;
        this.f60311V = i11;
        if (i11 == 2 || i11 == 3) {
            this.f60308S = false;
        }
        m64484F1();
    }

    /* renamed from: A1 */
    private ArrayList m64481A1() {
        ArrayList arrayList = new ArrayList();
        try {
            this.f60309T.clear();
            this.f60310U.clear();
            for (int i11 = 0; i11 < this.f57009B.size(); i11++) {
                C28771c c28771c = (C28771c) this.f57009B.get(i11);
                for (int i12 = 0; i12 < c28771c.m143950j().size(); i12++) {
                    C17945a0 m143953m = c28771c.m143953m(i12);
                    if (m143953m != null) {
                        if (!m143953m.m94871D7() && !m143953m.m95306y8()) {
                        }
                        if (!m143953m.m95228p8()) {
                            ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
                            itemAlbumMobile.f42598s0 = new MediaStoreItem(m143953m);
                            itemAlbumMobile.m40515Z(m143953m);
                            if (!TextUtils.isEmpty(itemAlbumMobile.f42607x) || !TextUtils.isEmpty(itemAlbumMobile.f42609y)) {
                                arrayList.add(itemAlbumMobile);
                                this.f60309T.append(arrayList.size() - 1, i11);
                                this.f60310U.append(arrayList.size() - 1, m143953m.m95029V3());
                            }
                        }
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60302e0, e11);
        }
        return arrayList;
    }

    /* renamed from: C1 */
    private String m64482C1() {
        ChatView chatView = this.f60306Q;
        if (chatView != null) {
            return chatView.f72829D0;
        }
        return "";
    }

    /* renamed from: D1 */
    private float m64483D1(InterfaceC11475g0 interfaceC11475g0, C27373c c27373c, C17945a0 c17945a0) {
        if (c27373c.m140221F() > 0 && c27373c.m140272z() > 0) {
            return c27373c.m140221F() / c27373c.m140272z();
        }
        C3979l thumbImageInfo = interfaceC11475g0.getThumbImageInfo();
        if (thumbImageInfo == null) {
            String m140268v = c27373c.m140268v();
            if (!TextUtils.isEmpty(m140268v)) {
                thumbImageInfo = this.f60305P.m123610p(m140268v, C23278z2.m120110a());
            }
        }
        if (thumbImageInfo != null) {
            return thumbImageInfo.m18839c().getWidth() / thumbImageInfo.m18839c().getHeight();
        }
        File m123603i = this.f60305P.m123603i(c17945a0.m95266u2());
        if (m123603i != null) {
            return ChatRowVideo.m61692B4(m123603i, 1.7777778f);
        }
        return 1.7777778f;
    }

    /* renamed from: F1 */
    private void m64484F1() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: v50.mb
            @Override // java.lang.Runnable
            public final void run() {
                C11603g0.this.m64499P1();
            }
        });
    }

    /* renamed from: G1 */
    private void m64485G1() {
        int i11 = this.f60311V;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    this.f57027y = 0;
                    this.f57008A = 0;
                    return;
                }
                return;
            }
            this.f57027y = 0;
            this.f57008A = 1;
            return;
        }
        if (!this.f60306Q.m59745NQ()) {
            C31986k3 c31986k3 = C31986k3.f147083a;
            if (c31986k3.m154106Q1() && c31986k3.m154105P1(this.f57026x.m17944I0()) && c31986k3.m154110T1() && !this.f57026x.m136067l()) {
                this.f57027y = 2;
                this.f57028z = 1;
                this.f57008A = 0;
            }
        }
        this.f57027y = 1;
        this.f57028z = 0;
        this.f57008A = 0;
    }

    /* renamed from: H1 */
    private boolean m64486H1(C17945a0 c17945a0, C17945a0 c17945a02) {
        if (c17945a02 != null && !c17945a02.m95226p6() && !c17945a02.m94899G7() && !c17945a02.m95161i7() && !c17945a02.m95109d6() && !c17945a02.m95031V5() && c17945a02.m94862C4().equals(c17945a0.m94862C4()) && !m60473E0(c17945a0.m95029V3()).f133309e) {
            if (c17945a02.m94872D8()) {
                return c17945a02.m94865C8();
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I1 */
    public boolean m64487I1() {
        if (mo60487Z() != 3) {
            return true;
        }
        return false;
    }

    /* renamed from: J1 */
    private boolean m64488J1() {
        ChatView chatView = this.f60306Q;
        if (chatView != null) {
            return chatView.mo60060j3();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L1 */
    public /* synthetic */ void m64491L1(String str, View view) {
        ChatView chatView = this.f60306Q;
        if (chatView != null) {
            chatView.m60021gT(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M1 */
    public /* synthetic */ void m64493M1(C25301c c25301c, C17945a0 c17945a0) {
        ChatView chatView;
        try {
            if (m64487I1() && (chatView = this.f60306Q) != null && !chatView.mo60294yp()) {
                if (!this.f60306Q.m60020gQ().mo60789r6() && !this.f60306Q.m60020gQ().mo60839yb()) {
                    this.f60306Q.m60020gQ().mo60799t4(c25301c);
                    return;
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_perform_action));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60302e0, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N1 */
    public /* synthetic */ void m64495N1(C17945a0 c17945a0) {
        try {
            if (!m64487I1()) {
                return;
            }
            ChatView chatView = this.f60306Q;
            if (chatView == null || (!chatView.m60020gQ().mo60789r6() && !this.f60306Q.m60020gQ().mo60839yb())) {
                if (c17945a0 != null && c17945a0.m94941L6()) {
                    this.f60306Q.m60020gQ().mo60832x4(false);
                    C17996r0 c17996r0 = (C17996r0) c17945a0.m94929K2();
                    C8967m.m47888f0(this.f60306Q.m92676n2(), c17945a0.m95029V3(), this.f57026x.m17944I0(), c17996r0.f91147B, c17996r0.f91150E, c17996r0.f91149D, 5);
                    return;
                }
                return;
            }
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_perform_action));
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60302e0, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O1 */
    public /* synthetic */ void m64497O1(int i11) {
        if (!this.f60304O) {
            this.f60317b0 = new C20040b(this, i11);
            C25282g c25282g = new C25282g(CoreUtility.f89233i, this);
            this.f60318c0 = c25282g;
            this.f60317b0.m104017g0(c25282g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P1 */
    public /* synthetic */ void m64499P1() {
        final int i11;
        if (mo60488a0() == EnumC18030a.GROUP) {
            i11 = 7;
        } else {
            i11 = 0;
        }
        ZMediaPlayerSettings.VideoConfig m104113g = AbstractC20049k.m104113g(i11);
        if (m104113g != null && m104113g.getPlayInline() == 1) {
            AbstractC19444a.m101695c(new Runnable() { // from class: v50.nb
                @Override // java.lang.Runnable
                public final void run() {
                    C11603g0.this.m64497O1(i11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q1 */
    public /* synthetic */ boolean m64501Q1(AbstractC11316a.e eVar, View view) {
        if (!m64487I1()) {
            return true;
        }
        m64512X1(eVar.f57064b0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R1 */
    public /* synthetic */ boolean m64503R1(AdapterView adapterView, View view, int i11, long j11) {
        if (!m64487I1()) {
            return true;
        }
        m64512X1(adapterView);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S1 */
    public /* synthetic */ void m64505S1(int i11) {
        C31933ga.f146718a.m153476s(i11);
        this.f60306Q.mo59706Ka(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T1 */
    public void m64507T1(InterfaceC11475g0 interfaceC11475g0) {
        C2526d.f10270a.m12705b0(interfaceC11475g0.getMessage(), m64569z1(interfaceC11475g0.getPosition()), "csc_msg_bubble", m64550B1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X1 */
    public void m64512X1(View view) {
        m64514Y1(view, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00da A[Catch: Exception -> 0x0034, TRY_LEAVE, TryCatch #0 {Exception -> 0x0034, blocks: (B:2:0x0000, B:4:0x000d, B:6:0x0013, B:8:0x002c, B:12:0x003a, B:15:0x0043, B:16:0x00d3, B:18:0x00da, B:24:0x0065, B:26:0x0069, B:28:0x006d, B:29:0x0096, B:31:0x009a, B:32:0x00a3, B:34:0x00a7, B:37:0x00ac, B:39:0x00b6, B:40:0x00bc, B:41:0x00ce, B:42:0x00be, B:44:0x00c2, B:45:0x00c9, B:47:0x0075, B:49:0x007b, B:51:0x008b, B:52:0x0090), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: Y1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m64514Y1(View view, URLSpan uRLSpan) {
        int i11;
        int i12;
        int paddingTop;
        int contentTop;
        boolean z11;
        try {
            AbstractC23647d.m123907q("9900", m64482C1());
            boolean z12 = false;
            if (uRLSpan != null && uRLSpan.getURL() != null) {
                String url = uRLSpan.getURL();
                String m153548n = C31944h6.m153548n(url);
                boolean z13 = !TextUtils.isEmpty(m153548n);
                boolean startsWith = url.toLowerCase().startsWith("tel:");
                if (z13 && C31944h6.m153543i(m153548n)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (startsWith) {
                    url = url.substring(4);
                }
                if (z13 || startsWith) {
                    Bundle bundle = new Bundle();
                    bundle.putString("text", url);
                    bundle.putParcelable("span", uRLSpan);
                    bundle.putBoolean("is_link", z13);
                    bundle.putBoolean("EXTRA_FORCE_OPEN_LINK_IN_APP", z11);
                    this.f60306Q.mo60056iu(307, bundle);
                    AbstractC23647d.m123893c();
                    if (this.f60312W == null) {
                        this.f60312W = null;
                        m10008p();
                        return;
                    }
                    return;
                }
            }
            if (this.f60311V == 1) {
                if (view instanceof ChatRowBase) {
                    i11 = ((ChatRowBase) view).getPosition();
                } else if (view.getTag() != null) {
                    String valueOf = String.valueOf(view.getTag());
                    if (valueOf.startsWith(HackyViewPager.VIEW_PAGER_OBJECT_TAG)) {
                        valueOf = valueOf.substring(6);
                    }
                    i11 = Integer.parseInt(valueOf);
                } else {
                    i11 = -1;
                }
                if (view instanceof ChatRowMultiItems) {
                    i12 = ((ChatRowMultiItems) view).getSelectedItemIndex();
                } else {
                    i12 = 0;
                }
                if (!(view instanceof ChatRowUnSupport) && !(view instanceof ChatRowE2eeDecryptedFailed)) {
                    z12 = true;
                }
                int i13 = AbstractC23136l9.m118644C0(view).top;
                if (view instanceof ChatRow) {
                    contentTop = ((ChatRow) view).getBubbleTop();
                } else if (view instanceof ChatRowWebContent) {
                    contentTop = ((ChatRowWebContent) view).getContentTop();
                } else {
                    paddingTop = i13 - view.getPaddingTop();
                    this.f60306Q.m60114mU(i11, i12, z12, paddingTop);
                }
                paddingTop = i13 + contentTop;
                this.f60306Q.m60114mU(i11, i12, z12, paddingTop);
            }
            AbstractC23647d.m123893c();
            if (this.f60312W == null) {
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60302e0, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b2 */
    public void m64518b2(InterfaceC11475g0 interfaceC11475g0) {
        boolean z11;
        boolean z12;
        if (interfaceC11475g0 != null && AbstractC23309i.m122080k3() == 1 && this.f60311V == 1 && (interfaceC11475g0 instanceof ChatRow)) {
            ChatRow chatRow = (ChatRow) interfaceC11475g0.getChatRowView();
            C17945a0 message = chatRow.getMessage();
            boolean z13 = m60473E0(message.m95029V3()).f133312h;
            if (message.m94879E5() && message.m95262t7()) {
                z11 = true;
            } else {
                z11 = false;
            }
            C17945a0 c17945a0 = this.f60312W;
            if (c17945a0 != null && !c17945a0.equals(message)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z13 && !z12 && !z11) {
                return;
            }
            if ((message.m95032V6() && message.m95089b4() != 0) || z11) {
                if (this.f60312W != null || System.currentTimeMillis() - chatRow.f57349P1 > ViewConfiguration.getDoubleTapTimeout()) {
                    chatRow.f57349P1 = System.currentTimeMillis();
                    this.f60313X = true;
                    if (message == this.f60312W || (z13 && z12)) {
                        message = null;
                    }
                    this.f60312W = message;
                    m10008p();
                    if (Build.VERSION.SDK_INT >= 23) {
                        TransitionSet ordering = new TransitionSet().addTransition(new ChangeBounds()).addTransition(AbstractC27730lb.m140770a()).setDuration(150L).setOrdering(0);
                        ordering.addListener((Transition.TransitionListener) new e());
                        TransitionManager.beginDelayedTransition(this.f60306Q.m59974dQ(), ordering);
                    }
                    if (this.f60312W != null && C32037n9.f147516a.m154562z()) {
                        C2526d.f10270a.m12675E(this.f60312W, -1, "csc_msg_bubble", m64550B1());
                    }
                }
            }
        }
    }

    /* renamed from: f2 */
    private void m64522f2(InterfaceC11475g0 interfaceC11475g0, C17945a0 c17945a0) {
        int i11;
        ArrayList<? extends Parcelable> m64481A1 = m64481A1();
        int m64549y1 = m64549y1(c17945a0.m95029V3(), m64481A1);
        if (this.f60306Q.m60020gQ().mo60584Ja()) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("medialist", m64481A1);
        bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 2);
        bundle.putInt("currentIndex", m64549y1);
        bundle.putString("EXTRA_STR_CONVERSATION_ID", c17945a0.mo95039W2());
        bundle.putBoolean("EXTRA_BOL_ENABLE_REACTION", true);
        bundle.putBoolean("extra_is_group", this.f60306Q.m59745NQ());
        bundle.putBoolean("EXTRA_CAN_EDIT_PHOTO", true);
        bundle.putInt("EXTRA_MEDIA_MODE", i11);
        bundle.putString("STR_LOG_CHAT_TYPE", m64550B1());
        if (AbstractC25495a.m132078c(this.f57026x.m17944I0())) {
            bundle.putInt("EXTRA_MY_CLOUD_VIEW_MODE", 0);
        }
        this.f60306Q.m59818SU(interfaceC11475g0, c17945a0.m94983Q3(), bundle, m64549y1, this.f60309T, this.f60310U);
    }

    /* renamed from: g2 */
    private void m64524g2(InterfaceC11475g0 interfaceC11475g0, C17945a0 c17945a0, C17391z c17391z, C27373c c27373c) {
        int i11;
        ArrayList<? extends Parcelable> m64481A1 = m64481A1();
        int m64549y1 = m64549y1(c17945a0.m95029V3(), m64481A1);
        ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) m64481A1.get(m64549y1);
        itemAlbumMobile.f42588m0 = c27373c;
        itemAlbumMobile.f42587l0 = c17391z.m92540e().toString();
        itemAlbumMobile.f42598s0 = new MediaStoreItem(c17945a0);
        if (this.f60306Q.m60020gQ().mo60584Ja()) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("medialist", m64481A1);
        bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 2);
        bundle.putInt("currentIndex", m64549y1);
        bundle.putString("EXTRA_STR_CONVERSATION_ID", c17945a0.mo95039W2());
        bundle.putBoolean("EXTRA_BOL_ENABLE_REACTION", true);
        bundle.putBoolean("extra_is_group", this.f60306Q.m59745NQ());
        bundle.putBoolean("EXTRA_CAN_EDIT_PHOTO", true);
        bundle.putInt("EXTRA_MEDIA_MODE", i11);
        bundle.putString("STR_LOG_CHAT_TYPE", m64550B1());
        if (AbstractC25495a.m132078c(this.f57026x.m17944I0())) {
            bundle.putInt("EXTRA_MY_CLOUD_VIEW_MODE", 0);
        }
        this.f60306Q.m59818SU(interfaceC11475g0, c27373c.m140268v(), bundle, m64549y1, this.f60309T, this.f60310U);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x002d. Please report as an issue. */
    /* renamed from: j2 */
    private void m64528j2(com.zing.zalo.p077ui.chat.AbstractC11316a.e r2, com.zing.zalo.data.chat.model.tabmessage.Conversation r3, int r4) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.chat.C11603g0.m64528j2(com.zing.zalo.ui.chat.a$e, com.zing.zalo.data.chat.model.tabmessage.Conversation, int):void");
    }

    /* renamed from: l2 */
    private void m64531l2(ChatRowBase chatRowBase, int i11) {
        if (chatRowBase != null) {
            chatRowBase.setPositionTag(i11);
        }
    }

    /* renamed from: m1 */
    private void m64532m1(AbstractC11316a.e eVar) {
        eVar.f57040J0.setText(C20380b.m106164c(this.f60306Q.m92689tK(), this.f60306Q, AbstractC23136l9.m118743r0(AbstractC8020f0.str_detail_msg_view_community_hide_seen_status), "message_detail", null));
        eVar.f57040J0.setMovementMethod(new LinkMovementMethod());
        AbstractC23136l9.m118732n1(eVar.f57040J0, AbstractC2810d.zds_ic_hide_solid_24, AbstractC2807a.icon_primary, AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(16.0f));
    }

    /* renamed from: n1 */
    private void m64533n1(AbstractC11316a.e eVar) {
        eVar.f57052P0.setText(AbstractC8020f0.msg_details_e2ee);
        AbstractC23136l9.m118732n1(eVar.f57052P0, AbstractC2810d.zds_ic_lock_solid_16, AbstractC2807a.icon_primary, AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(16.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n2 */
    public void m64534n2(C17945a0 c17945a0) {
        try {
            if (AbstractC23041d2.m118194A(c17945a0.m94983Q3())) {
                List<C17945a0> m60489b0 = m60489b0();
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                int i11 = 0;
                int i12 = 0;
                for (C17945a0 c17945a02 : m60489b0) {
                    if (c17945a02 != null) {
                        ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
                        itemAlbumMobile.m40515Z(c17945a02);
                        arrayList.add(itemAlbumMobile);
                        if (c17945a02 == c17945a0) {
                            i11 = i12;
                        }
                        i12++;
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 2);
                bundle.putParcelableArrayList("medialist", arrayList);
                bundle.putInt("currentIndex", i11);
                bundle.putBoolean("extra_is_group", c17945a0.m94847A6());
                bundle.putString("EXTRA_STR_CONVERSATION_ID", c17945a0.mo95039W2());
                bundle.putBoolean("EXTRA_BOL_ENABLE_REACTION", true);
                this.f60306Q.m59577BU(c17945a0.m94983Q3(), bundle, i11, 1018);
            } else if (!c17945a0.m95032V6() && !C23055e5.m118272g(false) && c17945a0.m95107d3() != 4) {
                ToastUtils.m89262j();
            }
            this.f60306Q.m60020gQ().mo60832x4(false);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60302e0, e11);
        }
    }

    /* renamed from: o1 */
    private void m64535o1(AbstractC11316a.e eVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AbstractC23136l9.m118743r0(AbstractC8020f0.msg_details_non_e2ee) + " ");
        a aVar = new a();
        SpannableString spannableString = new SpannableString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_learn_more));
        spannableString.setSpan(aVar, 0, spannableString.length(), 18);
        spannableStringBuilder.append((CharSequence) spannableString);
        eVar.f57052P0.setText(spannableStringBuilder);
        eVar.f57052P0.setMovementMethod(new LinkMovementMethod());
        AbstractC23136l9.m118732n1(eVar.f57052P0, AbstractC2810d.zds_ic_lock_open_solid_16, AbstractC2807a.icon_primary, AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(16.0f));
    }

    /* renamed from: o2 */
    private void m64536o2(C17945a0 c17945a0) {
        try {
            if (c17945a0.m94950M7() && c17945a0.m94929K2() != null && !TextUtils.isEmpty(c17945a0.m94929K2().f91014s)) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
                itemAlbumMobile.m40515Z(c17945a0);
                arrayList.add(itemAlbumMobile);
                Bundle bundle = new Bundle();
                bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 2);
                bundle.putParcelableArrayList("medialist", arrayList);
                bundle.putInt("currentIndex", 0);
                bundle.putString("EXTRA_STR_CONVERSATION_ID", c17945a0.mo95039W2());
                bundle.putBoolean("EXTRA_BOL_HIDE_LAYOUT_BOTTOM", true);
                bundle.putBoolean("EXTRA_BOL_ENABLE_SHARE", false);
                this.f60306Q.m59577BU(((ItemAlbumMobile) arrayList.get(0)).f42607x, bundle, 0, 1018);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60302e0, e11);
        }
    }

    /* renamed from: p1 */
    private void m64537p1(AbstractC11316a.e eVar, C17945a0 c17945a0) {
        try {
            if (!TextUtils.isEmpty(c17945a0.m95019U3())) {
                eVar.f57035G0.setText(c17945a0.m95019U3());
            } else {
                eVar.f57035G0.setText("");
            }
            if (c17945a0.m95312z3() > 0) {
                TextView textView = eVar.f57035G0;
                textView.setPadding(textView.getPaddingLeft(), c17945a0.m95312z3(), eVar.f57035G0.getPaddingRight(), eVar.f57035G0.getPaddingBottom());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60302e0, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p2 */
    public void m64538p2(InterfaceC11475g0 interfaceC11475g0) {
        try {
            C17945a0 message = interfaceC11475g0.getMessage();
            AbstractC23647d.m123897g("90014401");
            if (interfaceC11475g0 instanceof View) {
                if (AbstractC23041d2.m118194A(message.m94983Q3())) {
                    m64522f2(interfaceC11475g0, message);
                } else if (!message.m95032V6() && !C23055e5.m118271f() && message.m95107d3() != 4) {
                    ToastUtils.m89262j();
                }
            }
            this.f60306Q.m60020gQ().mo60832x4(false);
            m64507T1(interfaceC11475g0);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60302e0, e11);
        }
    }

    /* renamed from: q1 */
    private void m64539q1(AbstractC11316a.e eVar, C17945a0 c17945a0) {
        String str;
        try {
            AbstractC11316a.f fVar = eVar.f57034F0;
            List m94845A3 = c17945a0.m94845A3();
            if (m94845A3 != null) {
                int i11 = 0;
                while (true) {
                    String str2 = "";
                    if (i11 >= fVar.f57092d) {
                        break;
                    }
                    View view = fVar.f57091c[i11];
                    AvatarImageView avatarImageView = fVar.f57089a[i11];
                    RobotoTextView robotoTextView = fVar.f57090b[i11];
                    if (i11 < m94845A3.size()) {
                        final String str3 = m94845A3.get(i11) + "";
                        boolean z11 = true;
                        if (TextUtils.equals(str3, CoreUtility.f89233i)) {
                            ContactProfile contactProfile = AbstractC23304d.f113368c0;
                            String str4 = contactProfile.f42446v;
                            str = contactProfile.f42437s;
                            str2 = str4;
                        } else {
                            ContactProfile m141810d = C28203u6.f131407a.m141810d(str3, new TrackingSource((short) 1005));
                            if (m141810d == null) {
                                str = "";
                                z11 = false;
                            } else {
                                str2 = m141810d.f42446v;
                                str = m141810d.m40383Q(true, false);
                            }
                        }
                        if (z11) {
                            view.setVisibility(0);
                            if (!TextUtils.isEmpty(str2)) {
                                if (C23302b.f113247a.m120523d(str2) && !CoreUtility.f89233i.equals(str3)) {
                                    avatarImageView.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(str), C2343e.m12307a(str3, false)));
                                } else {
                                    ((C23528a) this.f60305P.m123612r(avatarImageView)).m123618x(str2, C23278z2.m120143n());
                                }
                            }
                            robotoTextView.setText(str);
                            view.setOnClickListener(new View.OnClickListener() { // from class: v50.qb
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    C11603g0.this.m64491L1(str3, view2);
                                }
                            });
                        } else {
                            view.setVisibility(4);
                            view.setOnClickListener(null);
                        }
                    } else {
                        view.setVisibility(4);
                        view.setOnClickListener(null);
                    }
                    i11++;
                }
                ArrayList arrayList = new ArrayList();
                AvatarImageView avatarImageView2 = fVar.f57089a[0];
                for (int i12 = 0; i12 < m94845A3.size(); i12++) {
                    String str5 = m94845A3.get(i12) + "";
                    if (!TextUtils.equals(str5, CoreUtility.f89233i) && C28203u6.f131407a.m141811g(str5) == null) {
                        arrayList.add(str5);
                        avatarImageView2 = fVar.f57089a[i12];
                    }
                }
                if (arrayList.size() > 0) {
                    new j(avatarImageView2, arrayList, 1051).m141750b();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("bindGroupDeliverSeenUserView: uids is null");
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60302e0, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q2 */
    public void m64540q2(InterfaceC11475g0 interfaceC11475g0) {
        C17945a0 message = interfaceC11475g0.getMessage();
        if (message.m94929K2() != null) {
            String str = message.m94929K2().f91016u;
            if (str.equals("recommened.msg.game")) {
                m64536o2(message);
                this.f60306Q.m60020gQ().mo60832x4(false);
                return;
            }
            if (str.equals("recommened.link") && (interfaceC11475g0 instanceof ChatRowRecommendLink) && !TextUtils.isEmpty(message.m94929K2().f91013r)) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
                itemAlbumMobile.m40515Z(message);
                arrayList.add(itemAlbumMobile);
                Bundle bundle = new Bundle();
                bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 2);
                bundle.putParcelableArrayList("medialist", arrayList);
                bundle.putInt("currentIndex", 0);
                bundle.putBoolean("extra_is_group", message.m94847A6());
                bundle.putString("EXTRA_STR_CONVERSATION_ID", message.mo95039W2());
                bundle.putBoolean("EXTRA_BOL_ENABLE_REACTION", true);
                this.f60306Q.m60020gQ().mo60832x4(false);
                this.f60306Q.m59818SU(interfaceC11475g0, itemAlbumMobile.f42607x, bundle, 0, null, this.f60310U);
            }
        }
    }

    /* renamed from: r1 */
    private void m64541r1(AbstractC11316a.e eVar) {
        eVar.f57038I0.setText(C20380b.m106164c(this.f60306Q.m92689tK(), this.f60306Q, AbstractC23136l9.m118743r0(AbstractC8020f0.str_detail_msg_view_hide_seen_delivered_status), "message_detail", null));
        eVar.f57038I0.setMovementMethod(new LinkMovementMethod());
        AbstractC23136l9.m118732n1(eVar.f57038I0, AbstractC2810d.zds_ic_hide_solid_24, AbstractC2807a.icon_primary, AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(16.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r2 */
    public void m64542r2(InterfaceC11475g0 interfaceC11475g0) {
        C17945a0 message = interfaceC11475g0.getMessage();
        if ((interfaceC11475g0 instanceof ChatRowFile) && (message.m94929K2() instanceof C17990p0)) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
            itemAlbumMobile.m40515Z(message);
            arrayList.add(itemAlbumMobile);
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 7);
            bundle.putParcelableArrayList("medialist", arrayList);
            bundle.putInt("currentIndex", 0);
            bundle.putInt("EXTRA_MEDIA_MODE", 3);
            bundle.putBoolean("extra_is_group", message.m94847A6());
            bundle.putString("EXTRA_STR_CONVERSATION_ID", message.mo95039W2());
            bundle.putString("STR_LOG_CHAT_TYPE", m64550B1());
            if (AbstractC25495a.m132078c(this.f57026x.m17944I0())) {
                bundle.putInt("EXTRA_MY_CLOUD_VIEW_MODE", 0);
            }
            this.f60306Q.m60020gQ().mo60832x4(false);
            this.f60306Q.m59818SU(interfaceC11475g0, itemAlbumMobile.f42607x, bundle, 0, null, this.f60310U);
            m64507T1(interfaceC11475g0);
        }
    }

    /* renamed from: s1 */
    private void m64543s1(AbstractC11316a.e eVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AbstractC23136l9.m118743r0(AbstractC8020f0.str_detail_msg_view_hide_seen_status_tip) + ". ");
        k kVar = new k();
        SpannableString spannableString = new SpannableString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_change_hide_seen_status_setting));
        spannableString.setSpan(kVar, 0, spannableString.length(), 18);
        spannableStringBuilder.append((CharSequence) spannableString);
        eVar.f57036H0.setText(spannableStringBuilder);
        eVar.f57036H0.setMovementMethod(new LinkMovementMethod());
        AbstractC23136l9.m118732n1(eVar.f57036H0, AbstractC2810d.zds_ic_hide_solid_24, AbstractC2807a.icon_primary, AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(16.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s2 */
    public void m64544s2(InterfaceC11475g0 interfaceC11475g0, C27373c c27373c) {
        boolean z11;
        String str;
        int i11;
        C17945a0 message = interfaceC11475g0.getMessage();
        if (message == null) {
            return;
        }
        if (message.m95022U7()) {
            this.f60306Q.m60209sU(Collections.singletonList(interfaceC11475g0.getMessage()));
            m64507T1(interfaceC11475g0);
            return;
        }
        boolean z12 = interfaceC11475g0 instanceof ChatRowVideoInline;
        if (z12 || (interfaceC11475g0 instanceof ChatRowVideo) || (interfaceC11475g0 instanceof ChatRowMultiPhotos) || (interfaceC11475g0 instanceof ChatRowVideoMask) || (interfaceC11475g0 instanceof ChatRowFile)) {
            if (c27373c != null) {
                float m64483D1 = m64483D1(interfaceC11475g0, c27373c, message);
                String m41044h = message.m95029V3().m41044h();
                if (c27373c.m140253g() != null) {
                    str = c27373c.m140253g();
                } else {
                    str = "";
                }
                String str2 = str;
                String m140220E = c27373c.m140220E();
                String m140268v = c27373c.m140268v();
                int m117875E = AbstractC23006a0.m117875E();
                if (mo60488a0() == EnumC18030a.GROUP) {
                    i11 = 5;
                } else {
                    i11 = 0;
                }
                C17391z c17391z = new C17391z(m41044h, str2, m140220E, "", m140268v, m117875E, false, 9, m64483D1, i11, null, message.mo95039W2(), 0);
                c17391z.f88635r = c27373c.f128950W;
                if (interfaceC11475g0 instanceof ChatRowFile) {
                    this.f60306Q.m59854UU(interfaceC11475g0, c17391z, c27373c);
                } else if (AbstractC23041d2.m118194A(message.m94983Q3()) || !TextUtils.isEmpty(c27373c.m140220E())) {
                    m64524g2(interfaceC11475g0, message, c17391z, c27373c);
                }
            } else if (((interfaceC11475g0 instanceof ChatRowVideoGifInline) || (interfaceC11475g0 instanceof ChatRowMultiPhotos)) && message.m95288w8() && (message.m94929K2() instanceof C17961f1)) {
                C17961f1 c17961f1 = (C17961f1) message.m94929K2();
                C31883d5 c31883d5 = new C31883d5("", c17961f1.m95485k(), c17961f1.m95455I(), c17961f1.m95456J(), c17961f1.m95514z());
                ContactProfile m141809c = C28203u6.f131407a.m141809c(message.m94862C4());
                if (m141809c == null) {
                    m141809c = new ContactProfile(message.m94862C4());
                    m141809c.f42437s = message.m94854B4();
                }
                z11 = false;
                this.f60306Q.m59804RU(interfaceC11475g0, c31883d5, m141809c.m40383Q(true, false));
                this.f60306Q.m60020gQ().mo60832x4(z11);
                if (z12 && m64568x1() != null) {
                    m64568x1().m104019n0(this.f60306Q.m59974dQ(), (C20040b.c) interfaceC11475g0);
                }
            }
            z11 = false;
            this.f60306Q.m60020gQ().mo60832x4(z11);
            if (z12) {
                m64568x1().m104019n0(this.f60306Q.m59974dQ(), (C20040b.c) interfaceC11475g0);
            }
        }
        m64507T1(interfaceC11475g0);
    }

    /* renamed from: t2 */
    private void m64545t2() {
        C26393b m136076v;
        try {
            C0872f m120562A = AbstractC23306f.m120562A();
            if (m120562A.m2530Y(this.f57026x.m17944I0())) {
                ChatView chatView = this.f60306Q;
                if (chatView.f56920x1 && !chatView.f56916w1 && !C20024r.m103941j() && !C7853b.m40052a0().m40133i0() && !this.f60306Q.mo60120mu()) {
                    if (this.f60306Q.mo59728M6() && this.f60306Q.f56860i1.mo87653f()) {
                        return;
                    }
                    if (!this.f60306Q.f56793R1.m64782i1() && !m60486Y().mo60400S0("tip.csc.voice.to.text")) {
                        if (((this.f60311V != 1 || this.f60306Q.mo59727Ly() || this.f60306Q.m60020gQ().mo60741i0()) && (this.f60311V != 2 || !this.f60306Q.mo59727Ly())) || (m136076v = this.f57026x.m136076v()) == null) {
                            return;
                        }
                        for (int i11 = 0; i11 < m136076v.m136016p(); i11++) {
                            C17945a0 c17945a0 = (C17945a0) m136076v.m136006f(i11);
                            if (!c17945a0.m95032V6()) {
                                if (!c17945a0.m95316z8() || c17945a0.m95107d3() != 4) {
                                    if (c17945a0.m95316z8() && c17945a0.m95107d3() == 5 && m120562A.m2524S(c17945a0) && C7853b.m40052a0().m40131h0() && !m60486Y().mo60394A(c17945a0.m94983Q3(), c17945a0.m95029V3())) {
                                        if (C31948ha.m153587d().m153595i() || C31948ha.m153587d().m153596j()) {
                                            C31948ha.m153587d().m153602p();
                                        }
                                        if (!C7853b.m40052a0().m40137k0() && !C7853b.m40052a0().m40140m0()) {
                                            m120562A.m2534d0(c17945a0);
                                            if (AbstractC23041d2.m118194A(c17945a0.m94983Q3())) {
                                                m60486Y().mo60395O0(1, c17945a0.m94983Q3(), c17945a0.m95029V3());
                                                C2546u.f10363a.m12821h(c17945a0, true);
                                                if (c17945a0.m94929K2() instanceof C17964g1) {
                                                    if (!((C17964g1) c17945a0.m94929K2()).m95540r()) {
                                                        ((C17964g1) c17945a0.m94929K2()).m95522C(true);
                                                        ((C17964g1) c17945a0.m94929K2()).m95529J();
                                                        C0824j.m2153b(new d(c17945a0));
                                                        c17945a0.m95111d9();
                                                    }
                                                    C23744a.m124114c().m124116d(6, c17945a0.m95029V3(), c17945a0.mo95039W2());
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                    }
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e11) {
            CoreUtility.m93148a().mo100074a(new Exception("ChatViewAdapter", e11));
        }
    }

    /* renamed from: u2 */
    private void m64546u2(AbstractC11316a.e eVar, C17945a0 c17945a0) {
        try {
            if (eVar.f57037I != null) {
                if (m60473E0(c17945a0.m95029V3()).f133312h) {
                    eVar.f57037I.setVisibility(0);
                } else {
                    eVar.f57037I.setVisibility(8);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60302e0, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v1 */
    public boolean m64547v1() {
        ChatView chatView = this.f60306Q;
        if ((chatView != null && !chatView.mo60060j3()) || this.f60308S) {
            return true;
        }
        return false;
    }

    /* renamed from: v2 */
    private void m64548v2(C28771c c28771c) {
        if (c28771c == null) {
            return;
        }
        try {
            for (C17945a0 c17945a0 : c28771c.m143950j()) {
                if (c17945a0.m95031V5()) {
                    if (c17945a0.m95032V6() && !c17945a0.m95180k8()) {
                        C0814e0.m2056b(c17945a0);
                    }
                    if (m64488J1()) {
                        c17945a0.m94884F1();
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: y1 */
    private int m64549y1(MessageId messageId, List list) {
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (messageId.equals(((ItemAlbumMobile) list.get(i12)).m40496C())) {
                i11 = i12;
            }
        }
        return i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(38:18|19|(1:21)|22|(1:24)|25|(28:30|31|32|33|34|(1:430)(1:38)|39|(1:429)(1:43)|44|(1:428)(1:48)|49|(3:51|(1:370)(1:59)|60)(1:(16:372|(1:374)(1:426)|375|(1:425)(1:381)|(1:424)(1:387)|388|(9:423|397|(5:407|408|(1:418)(1:412)|413|(1:417))|419|408|(1:410)|418|413|(2:415|417))|396|397|(9:399|402|404|407|408|(0)|418|413|(0))|419|408|(0)|418|413|(0))(1:427))|61|(1:63)(1:369)|64|(1:66)|67|68|(8:71|(1:75)|76|(1:78)|79|(2:81|82)(1:84)|83|69)|85|86|(1:88)|89|(1:91)|92|(1:94)(2:98|(1:100)(2:101|(1:103)(2:104|(1:106)(2:107|(1:109)(2:110|(1:112)(2:113|(1:115)(6:116|(4:118|(1:133)(2:122|(1:124)(2:129|(1:131)(1:132)))|125|(1:128))|134|(1:367)(1:138)|139|(4:(2:142|(1:(2:145|(2:147|(2:149|(2:151|(1:153)(3:337|(1:339)|340))(3:341|(1:343)|344))(3:345|(1:347)|348))(1:349))(1:350))(3:351|(1:355)|356))|357|(1:361)|362)(3:363|(1:365)|366))))))))|95|97)|434|31|32|33|34|(1:36)|430|39|(1:41)|429|44|(1:46)|428|49|(0)(0)|61|(0)(0)|64|(0)|67|68|(1:69)|85|86|(0)|89|(0)|92|(0)(0)|95|97) */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x008a, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x01b2, code lost:            mm0.AbstractC23350e.m122776f(com.zing.zalo.p077ui.chat.C11603g0.f60302e0, r0);     */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05fb A[Catch: Exception -> 0x0041, TryCatch #1 {Exception -> 0x0041, blocks: (B:19:0x0033, B:21:0x0039, B:22:0x0045, B:24:0x004b, B:25:0x0052, B:30:0x0068, B:31:0x0071, B:68:0x01b7, B:69:0x01be, B:71:0x01c8, B:73:0x01df, B:75:0x01e9, B:76:0x01ef, B:78:0x01fb, B:79:0x0209, B:81:0x0215, B:83:0x0217, B:86:0x021a, B:88:0x0220, B:89:0x0225, B:91:0x0233, B:92:0x023c, B:94:0x0243, B:95:0x0915, B:98:0x0248, B:100:0x024f, B:101:0x0254, B:103:0x025b, B:104:0x0260, B:106:0x0267, B:107:0x026c, B:109:0x0273, B:110:0x0278, B:112:0x027f, B:113:0x0284, B:115:0x028b, B:116:0x0290, B:118:0x0298, B:120:0x02a0, B:122:0x02a6, B:124:0x02b0, B:125:0x02e6, B:128:0x02f3, B:129:0x02bb, B:131:0x02c5, B:132:0x02d1, B:133:0x02dc, B:134:0x030a, B:136:0x0316, B:139:0x032d, B:153:0x0348, B:154:0x034b, B:155:0x034e, B:156:0x0351, B:157:0x0354, B:159:0x0359, B:160:0x036a, B:162:0x0372, B:164:0x0378, B:166:0x037f, B:168:0x0391, B:169:0x0396, B:170:0x03a7, B:171:0x03bb, B:172:0x03cc, B:173:0x03dd, B:174:0x03f7, B:176:0x03fd, B:177:0x0400, B:178:0x0411, B:180:0x0417, B:181:0x041f, B:183:0x0425, B:186:0x0431, B:191:0x0435, B:192:0x0446, B:194:0x044c, B:196:0x0452, B:197:0x0455, B:198:0x0466, B:199:0x0477, B:201:0x047d, B:202:0x0480, B:203:0x0491, B:205:0x0499, B:207:0x04b1, B:208:0x04b3, B:209:0x04c8, B:211:0x04ce, B:212:0x04d1, B:213:0x04e2, B:215:0x04e8, B:217:0x04ee, B:218:0x04f1, B:219:0x0502, B:221:0x0508, B:222:0x050b, B:223:0x051c, B:225:0x0522, B:226:0x0525, B:228:0x0537, B:230:0x0541, B:234:0x0557, B:235:0x0548, B:237:0x054e, B:239:0x0554, B:244:0x055a, B:245:0x056b, B:246:0x057c, B:248:0x0582, B:250:0x0588, B:251:0x058b, B:252:0x059c, B:254:0x05a2, B:255:0x05a5, B:256:0x05b6, B:258:0x05bc, B:259:0x05bf, B:260:0x05d0, B:261:0x05ea, B:262:0x05fb, B:264:0x0601, B:265:0x0604, B:266:0x0615, B:268:0x061b, B:270:0x0621, B:271:0x0624, B:272:0x0635, B:274:0x063b, B:275:0x063e, B:276:0x064f, B:277:0x0660, B:279:0x0666, B:280:0x0669, B:281:0x067a, B:283:0x0680, B:284:0x0683, B:285:0x0694, B:287:0x069a, B:288:0x069d, B:289:0x06ae, B:291:0x06b4, B:292:0x06b7, B:293:0x06c8, B:295:0x06ce, B:296:0x06d1, B:297:0x06e2, B:299:0x06e8, B:300:0x06eb, B:301:0x06fc, B:303:0x0702, B:304:0x0705, B:305:0x0716, B:306:0x072a, B:307:0x073b, B:308:0x074c, B:309:0x075d, B:311:0x0763, B:312:0x0766, B:313:0x0777, B:315:0x077d, B:316:0x0780, B:317:0x0791, B:319:0x0797, B:320:0x079a, B:321:0x07ab, B:323:0x07b1, B:324:0x07b4, B:325:0x07c5, B:327:0x07cb, B:329:0x07d1, B:330:0x07d4, B:331:0x07e5, B:333:0x07eb, B:335:0x07f1, B:336:0x07f4, B:337:0x0805, B:339:0x080b, B:340:0x080e, B:341:0x081f, B:343:0x0825, B:344:0x0828, B:345:0x0839, B:347:0x083f, B:348:0x0842, B:349:0x0853, B:350:0x08af, B:351:0x08bf, B:353:0x08c5, B:355:0x08cb, B:356:0x08ce, B:357:0x08de, B:359:0x08e4, B:361:0x08ea, B:362:0x08ed, B:363:0x08fd, B:365:0x0903, B:366:0x0906, B:433:0x01b2, B:434:0x006d, B:34:0x0074, B:36:0x0082, B:39:0x008f, B:41:0x0097, B:44:0x00a0, B:46:0x00a8, B:49:0x00b1, B:51:0x00b5, B:53:0x00c3, B:55:0x00c9, B:57:0x00cf, B:60:0x00d8, B:61:0x019c, B:64:0x01a4, B:66:0x01aa, B:67:0x01ae, B:372:0x00e7, B:375:0x0106, B:377:0x010c, B:379:0x0112, B:383:0x011d, B:385:0x0123, B:388:0x012c, B:390:0x013a, B:393:0x0142, B:396:0x0152, B:397:0x0154, B:399:0x0166, B:402:0x016e, B:404:0x0172, B:408:0x017a, B:410:0x0182, B:413:0x0189, B:415:0x018f, B:417:0x0194, B:423:0x014f, B:427:0x019a), top: B:18:0x0033, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x07e5 A[Catch: Exception -> 0x0041, TryCatch #1 {Exception -> 0x0041, blocks: (B:19:0x0033, B:21:0x0039, B:22:0x0045, B:24:0x004b, B:25:0x0052, B:30:0x0068, B:31:0x0071, B:68:0x01b7, B:69:0x01be, B:71:0x01c8, B:73:0x01df, B:75:0x01e9, B:76:0x01ef, B:78:0x01fb, B:79:0x0209, B:81:0x0215, B:83:0x0217, B:86:0x021a, B:88:0x0220, B:89:0x0225, B:91:0x0233, B:92:0x023c, B:94:0x0243, B:95:0x0915, B:98:0x0248, B:100:0x024f, B:101:0x0254, B:103:0x025b, B:104:0x0260, B:106:0x0267, B:107:0x026c, B:109:0x0273, B:110:0x0278, B:112:0x027f, B:113:0x0284, B:115:0x028b, B:116:0x0290, B:118:0x0298, B:120:0x02a0, B:122:0x02a6, B:124:0x02b0, B:125:0x02e6, B:128:0x02f3, B:129:0x02bb, B:131:0x02c5, B:132:0x02d1, B:133:0x02dc, B:134:0x030a, B:136:0x0316, B:139:0x032d, B:153:0x0348, B:154:0x034b, B:155:0x034e, B:156:0x0351, B:157:0x0354, B:159:0x0359, B:160:0x036a, B:162:0x0372, B:164:0x0378, B:166:0x037f, B:168:0x0391, B:169:0x0396, B:170:0x03a7, B:171:0x03bb, B:172:0x03cc, B:173:0x03dd, B:174:0x03f7, B:176:0x03fd, B:177:0x0400, B:178:0x0411, B:180:0x0417, B:181:0x041f, B:183:0x0425, B:186:0x0431, B:191:0x0435, B:192:0x0446, B:194:0x044c, B:196:0x0452, B:197:0x0455, B:198:0x0466, B:199:0x0477, B:201:0x047d, B:202:0x0480, B:203:0x0491, B:205:0x0499, B:207:0x04b1, B:208:0x04b3, B:209:0x04c8, B:211:0x04ce, B:212:0x04d1, B:213:0x04e2, B:215:0x04e8, B:217:0x04ee, B:218:0x04f1, B:219:0x0502, B:221:0x0508, B:222:0x050b, B:223:0x051c, B:225:0x0522, B:226:0x0525, B:228:0x0537, B:230:0x0541, B:234:0x0557, B:235:0x0548, B:237:0x054e, B:239:0x0554, B:244:0x055a, B:245:0x056b, B:246:0x057c, B:248:0x0582, B:250:0x0588, B:251:0x058b, B:252:0x059c, B:254:0x05a2, B:255:0x05a5, B:256:0x05b6, B:258:0x05bc, B:259:0x05bf, B:260:0x05d0, B:261:0x05ea, B:262:0x05fb, B:264:0x0601, B:265:0x0604, B:266:0x0615, B:268:0x061b, B:270:0x0621, B:271:0x0624, B:272:0x0635, B:274:0x063b, B:275:0x063e, B:276:0x064f, B:277:0x0660, B:279:0x0666, B:280:0x0669, B:281:0x067a, B:283:0x0680, B:284:0x0683, B:285:0x0694, B:287:0x069a, B:288:0x069d, B:289:0x06ae, B:291:0x06b4, B:292:0x06b7, B:293:0x06c8, B:295:0x06ce, B:296:0x06d1, B:297:0x06e2, B:299:0x06e8, B:300:0x06eb, B:301:0x06fc, B:303:0x0702, B:304:0x0705, B:305:0x0716, B:306:0x072a, B:307:0x073b, B:308:0x074c, B:309:0x075d, B:311:0x0763, B:312:0x0766, B:313:0x0777, B:315:0x077d, B:316:0x0780, B:317:0x0791, B:319:0x0797, B:320:0x079a, B:321:0x07ab, B:323:0x07b1, B:324:0x07b4, B:325:0x07c5, B:327:0x07cb, B:329:0x07d1, B:330:0x07d4, B:331:0x07e5, B:333:0x07eb, B:335:0x07f1, B:336:0x07f4, B:337:0x0805, B:339:0x080b, B:340:0x080e, B:341:0x081f, B:343:0x0825, B:344:0x0828, B:345:0x0839, B:347:0x083f, B:348:0x0842, B:349:0x0853, B:350:0x08af, B:351:0x08bf, B:353:0x08c5, B:355:0x08cb, B:356:0x08ce, B:357:0x08de, B:359:0x08e4, B:361:0x08ea, B:362:0x08ed, B:363:0x08fd, B:365:0x0903, B:366:0x0906, B:433:0x01b2, B:434:0x006d, B:34:0x0074, B:36:0x0082, B:39:0x008f, B:41:0x0097, B:44:0x00a0, B:46:0x00a8, B:49:0x00b1, B:51:0x00b5, B:53:0x00c3, B:55:0x00c9, B:57:0x00cf, B:60:0x00d8, B:61:0x019c, B:64:0x01a4, B:66:0x01aa, B:67:0x01ae, B:372:0x00e7, B:375:0x0106, B:377:0x010c, B:379:0x0112, B:383:0x011d, B:385:0x0123, B:388:0x012c, B:390:0x013a, B:393:0x0142, B:396:0x0152, B:397:0x0154, B:399:0x0166, B:402:0x016e, B:404:0x0172, B:408:0x017a, B:410:0x0182, B:413:0x0189, B:415:0x018f, B:417:0x0194, B:423:0x014f, B:427:0x019a), top: B:18:0x0033, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0182 A[Catch: Exception -> 0x008a, TryCatch #0 {Exception -> 0x008a, blocks: (B:34:0x0074, B:36:0x0082, B:39:0x008f, B:41:0x0097, B:44:0x00a0, B:46:0x00a8, B:49:0x00b1, B:51:0x00b5, B:53:0x00c3, B:55:0x00c9, B:57:0x00cf, B:60:0x00d8, B:61:0x019c, B:64:0x01a4, B:66:0x01aa, B:67:0x01ae, B:372:0x00e7, B:375:0x0106, B:377:0x010c, B:379:0x0112, B:383:0x011d, B:385:0x0123, B:388:0x012c, B:390:0x013a, B:393:0x0142, B:396:0x0152, B:397:0x0154, B:399:0x0166, B:402:0x016e, B:404:0x0172, B:408:0x017a, B:410:0x0182, B:413:0x0189, B:415:0x018f, B:417:0x0194, B:423:0x014f, B:427:0x019a), top: B:33:0x0074, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x018f A[Catch: Exception -> 0x008a, TryCatch #0 {Exception -> 0x008a, blocks: (B:34:0x0074, B:36:0x0082, B:39:0x008f, B:41:0x0097, B:44:0x00a0, B:46:0x00a8, B:49:0x00b1, B:51:0x00b5, B:53:0x00c3, B:55:0x00c9, B:57:0x00cf, B:60:0x00d8, B:61:0x019c, B:64:0x01a4, B:66:0x01aa, B:67:0x01ae, B:372:0x00e7, B:375:0x0106, B:377:0x010c, B:379:0x0112, B:383:0x011d, B:385:0x0123, B:388:0x012c, B:390:0x013a, B:393:0x0142, B:396:0x0152, B:397:0x0154, B:399:0x0166, B:402:0x016e, B:404:0x0172, B:408:0x017a, B:410:0x0182, B:413:0x0189, B:415:0x018f, B:417:0x0194, B:423:0x014f, B:427:0x019a), top: B:33:0x0074, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5 A[Catch: Exception -> 0x008a, TryCatch #0 {Exception -> 0x008a, blocks: (B:34:0x0074, B:36:0x0082, B:39:0x008f, B:41:0x0097, B:44:0x00a0, B:46:0x00a8, B:49:0x00b1, B:51:0x00b5, B:53:0x00c3, B:55:0x00c9, B:57:0x00cf, B:60:0x00d8, B:61:0x019c, B:64:0x01a4, B:66:0x01aa, B:67:0x01ae, B:372:0x00e7, B:375:0x0106, B:377:0x010c, B:379:0x0112, B:383:0x011d, B:385:0x0123, B:388:0x012c, B:390:0x013a, B:393:0x0142, B:396:0x0152, B:397:0x0154, B:399:0x0166, B:402:0x016e, B:404:0x0172, B:408:0x017a, B:410:0x0182, B:413:0x0189, B:415:0x018f, B:417:0x0194, B:423:0x014f, B:427:0x019a), top: B:33:0x0074, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01aa A[Catch: Exception -> 0x008a, TryCatch #0 {Exception -> 0x008a, blocks: (B:34:0x0074, B:36:0x0082, B:39:0x008f, B:41:0x0097, B:44:0x00a0, B:46:0x00a8, B:49:0x00b1, B:51:0x00b5, B:53:0x00c3, B:55:0x00c9, B:57:0x00cf, B:60:0x00d8, B:61:0x019c, B:64:0x01a4, B:66:0x01aa, B:67:0x01ae, B:372:0x00e7, B:375:0x0106, B:377:0x010c, B:379:0x0112, B:383:0x011d, B:385:0x0123, B:388:0x012c, B:390:0x013a, B:393:0x0142, B:396:0x0152, B:397:0x0154, B:399:0x0166, B:402:0x016e, B:404:0x0172, B:408:0x017a, B:410:0x0182, B:413:0x0189, B:415:0x018f, B:417:0x0194, B:423:0x014f, B:427:0x019a), top: B:33:0x0074, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c8 A[Catch: Exception -> 0x0041, TryCatch #1 {Exception -> 0x0041, blocks: (B:19:0x0033, B:21:0x0039, B:22:0x0045, B:24:0x004b, B:25:0x0052, B:30:0x0068, B:31:0x0071, B:68:0x01b7, B:69:0x01be, B:71:0x01c8, B:73:0x01df, B:75:0x01e9, B:76:0x01ef, B:78:0x01fb, B:79:0x0209, B:81:0x0215, B:83:0x0217, B:86:0x021a, B:88:0x0220, B:89:0x0225, B:91:0x0233, B:92:0x023c, B:94:0x0243, B:95:0x0915, B:98:0x0248, B:100:0x024f, B:101:0x0254, B:103:0x025b, B:104:0x0260, B:106:0x0267, B:107:0x026c, B:109:0x0273, B:110:0x0278, B:112:0x027f, B:113:0x0284, B:115:0x028b, B:116:0x0290, B:118:0x0298, B:120:0x02a0, B:122:0x02a6, B:124:0x02b0, B:125:0x02e6, B:128:0x02f3, B:129:0x02bb, B:131:0x02c5, B:132:0x02d1, B:133:0x02dc, B:134:0x030a, B:136:0x0316, B:139:0x032d, B:153:0x0348, B:154:0x034b, B:155:0x034e, B:156:0x0351, B:157:0x0354, B:159:0x0359, B:160:0x036a, B:162:0x0372, B:164:0x0378, B:166:0x037f, B:168:0x0391, B:169:0x0396, B:170:0x03a7, B:171:0x03bb, B:172:0x03cc, B:173:0x03dd, B:174:0x03f7, B:176:0x03fd, B:177:0x0400, B:178:0x0411, B:180:0x0417, B:181:0x041f, B:183:0x0425, B:186:0x0431, B:191:0x0435, B:192:0x0446, B:194:0x044c, B:196:0x0452, B:197:0x0455, B:198:0x0466, B:199:0x0477, B:201:0x047d, B:202:0x0480, B:203:0x0491, B:205:0x0499, B:207:0x04b1, B:208:0x04b3, B:209:0x04c8, B:211:0x04ce, B:212:0x04d1, B:213:0x04e2, B:215:0x04e8, B:217:0x04ee, B:218:0x04f1, B:219:0x0502, B:221:0x0508, B:222:0x050b, B:223:0x051c, B:225:0x0522, B:226:0x0525, B:228:0x0537, B:230:0x0541, B:234:0x0557, B:235:0x0548, B:237:0x054e, B:239:0x0554, B:244:0x055a, B:245:0x056b, B:246:0x057c, B:248:0x0582, B:250:0x0588, B:251:0x058b, B:252:0x059c, B:254:0x05a2, B:255:0x05a5, B:256:0x05b6, B:258:0x05bc, B:259:0x05bf, B:260:0x05d0, B:261:0x05ea, B:262:0x05fb, B:264:0x0601, B:265:0x0604, B:266:0x0615, B:268:0x061b, B:270:0x0621, B:271:0x0624, B:272:0x0635, B:274:0x063b, B:275:0x063e, B:276:0x064f, B:277:0x0660, B:279:0x0666, B:280:0x0669, B:281:0x067a, B:283:0x0680, B:284:0x0683, B:285:0x0694, B:287:0x069a, B:288:0x069d, B:289:0x06ae, B:291:0x06b4, B:292:0x06b7, B:293:0x06c8, B:295:0x06ce, B:296:0x06d1, B:297:0x06e2, B:299:0x06e8, B:300:0x06eb, B:301:0x06fc, B:303:0x0702, B:304:0x0705, B:305:0x0716, B:306:0x072a, B:307:0x073b, B:308:0x074c, B:309:0x075d, B:311:0x0763, B:312:0x0766, B:313:0x0777, B:315:0x077d, B:316:0x0780, B:317:0x0791, B:319:0x0797, B:320:0x079a, B:321:0x07ab, B:323:0x07b1, B:324:0x07b4, B:325:0x07c5, B:327:0x07cb, B:329:0x07d1, B:330:0x07d4, B:331:0x07e5, B:333:0x07eb, B:335:0x07f1, B:336:0x07f4, B:337:0x0805, B:339:0x080b, B:340:0x080e, B:341:0x081f, B:343:0x0825, B:344:0x0828, B:345:0x0839, B:347:0x083f, B:348:0x0842, B:349:0x0853, B:350:0x08af, B:351:0x08bf, B:353:0x08c5, B:355:0x08cb, B:356:0x08ce, B:357:0x08de, B:359:0x08e4, B:361:0x08ea, B:362:0x08ed, B:363:0x08fd, B:365:0x0903, B:366:0x0906, B:433:0x01b2, B:434:0x006d, B:34:0x0074, B:36:0x0082, B:39:0x008f, B:41:0x0097, B:44:0x00a0, B:46:0x00a8, B:49:0x00b1, B:51:0x00b5, B:53:0x00c3, B:55:0x00c9, B:57:0x00cf, B:60:0x00d8, B:61:0x019c, B:64:0x01a4, B:66:0x01aa, B:67:0x01ae, B:372:0x00e7, B:375:0x0106, B:377:0x010c, B:379:0x0112, B:383:0x011d, B:385:0x0123, B:388:0x012c, B:390:0x013a, B:393:0x0142, B:396:0x0152, B:397:0x0154, B:399:0x0166, B:402:0x016e, B:404:0x0172, B:408:0x017a, B:410:0x0182, B:413:0x0189, B:415:0x018f, B:417:0x0194, B:423:0x014f, B:427:0x019a), top: B:18:0x0033, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0220 A[Catch: Exception -> 0x0041, TryCatch #1 {Exception -> 0x0041, blocks: (B:19:0x0033, B:21:0x0039, B:22:0x0045, B:24:0x004b, B:25:0x0052, B:30:0x0068, B:31:0x0071, B:68:0x01b7, B:69:0x01be, B:71:0x01c8, B:73:0x01df, B:75:0x01e9, B:76:0x01ef, B:78:0x01fb, B:79:0x0209, B:81:0x0215, B:83:0x0217, B:86:0x021a, B:88:0x0220, B:89:0x0225, B:91:0x0233, B:92:0x023c, B:94:0x0243, B:95:0x0915, B:98:0x0248, B:100:0x024f, B:101:0x0254, B:103:0x025b, B:104:0x0260, B:106:0x0267, B:107:0x026c, B:109:0x0273, B:110:0x0278, B:112:0x027f, B:113:0x0284, B:115:0x028b, B:116:0x0290, B:118:0x0298, B:120:0x02a0, B:122:0x02a6, B:124:0x02b0, B:125:0x02e6, B:128:0x02f3, B:129:0x02bb, B:131:0x02c5, B:132:0x02d1, B:133:0x02dc, B:134:0x030a, B:136:0x0316, B:139:0x032d, B:153:0x0348, B:154:0x034b, B:155:0x034e, B:156:0x0351, B:157:0x0354, B:159:0x0359, B:160:0x036a, B:162:0x0372, B:164:0x0378, B:166:0x037f, B:168:0x0391, B:169:0x0396, B:170:0x03a7, B:171:0x03bb, B:172:0x03cc, B:173:0x03dd, B:174:0x03f7, B:176:0x03fd, B:177:0x0400, B:178:0x0411, B:180:0x0417, B:181:0x041f, B:183:0x0425, B:186:0x0431, B:191:0x0435, B:192:0x0446, B:194:0x044c, B:196:0x0452, B:197:0x0455, B:198:0x0466, B:199:0x0477, B:201:0x047d, B:202:0x0480, B:203:0x0491, B:205:0x0499, B:207:0x04b1, B:208:0x04b3, B:209:0x04c8, B:211:0x04ce, B:212:0x04d1, B:213:0x04e2, B:215:0x04e8, B:217:0x04ee, B:218:0x04f1, B:219:0x0502, B:221:0x0508, B:222:0x050b, B:223:0x051c, B:225:0x0522, B:226:0x0525, B:228:0x0537, B:230:0x0541, B:234:0x0557, B:235:0x0548, B:237:0x054e, B:239:0x0554, B:244:0x055a, B:245:0x056b, B:246:0x057c, B:248:0x0582, B:250:0x0588, B:251:0x058b, B:252:0x059c, B:254:0x05a2, B:255:0x05a5, B:256:0x05b6, B:258:0x05bc, B:259:0x05bf, B:260:0x05d0, B:261:0x05ea, B:262:0x05fb, B:264:0x0601, B:265:0x0604, B:266:0x0615, B:268:0x061b, B:270:0x0621, B:271:0x0624, B:272:0x0635, B:274:0x063b, B:275:0x063e, B:276:0x064f, B:277:0x0660, B:279:0x0666, B:280:0x0669, B:281:0x067a, B:283:0x0680, B:284:0x0683, B:285:0x0694, B:287:0x069a, B:288:0x069d, B:289:0x06ae, B:291:0x06b4, B:292:0x06b7, B:293:0x06c8, B:295:0x06ce, B:296:0x06d1, B:297:0x06e2, B:299:0x06e8, B:300:0x06eb, B:301:0x06fc, B:303:0x0702, B:304:0x0705, B:305:0x0716, B:306:0x072a, B:307:0x073b, B:308:0x074c, B:309:0x075d, B:311:0x0763, B:312:0x0766, B:313:0x0777, B:315:0x077d, B:316:0x0780, B:317:0x0791, B:319:0x0797, B:320:0x079a, B:321:0x07ab, B:323:0x07b1, B:324:0x07b4, B:325:0x07c5, B:327:0x07cb, B:329:0x07d1, B:330:0x07d4, B:331:0x07e5, B:333:0x07eb, B:335:0x07f1, B:336:0x07f4, B:337:0x0805, B:339:0x080b, B:340:0x080e, B:341:0x081f, B:343:0x0825, B:344:0x0828, B:345:0x0839, B:347:0x083f, B:348:0x0842, B:349:0x0853, B:350:0x08af, B:351:0x08bf, B:353:0x08c5, B:355:0x08cb, B:356:0x08ce, B:357:0x08de, B:359:0x08e4, B:361:0x08ea, B:362:0x08ed, B:363:0x08fd, B:365:0x0903, B:366:0x0906, B:433:0x01b2, B:434:0x006d, B:34:0x0074, B:36:0x0082, B:39:0x008f, B:41:0x0097, B:44:0x00a0, B:46:0x00a8, B:49:0x00b1, B:51:0x00b5, B:53:0x00c3, B:55:0x00c9, B:57:0x00cf, B:60:0x00d8, B:61:0x019c, B:64:0x01a4, B:66:0x01aa, B:67:0x01ae, B:372:0x00e7, B:375:0x0106, B:377:0x010c, B:379:0x0112, B:383:0x011d, B:385:0x0123, B:388:0x012c, B:390:0x013a, B:393:0x0142, B:396:0x0152, B:397:0x0154, B:399:0x0166, B:402:0x016e, B:404:0x0172, B:408:0x017a, B:410:0x0182, B:413:0x0189, B:415:0x018f, B:417:0x0194, B:423:0x014f, B:427:0x019a), top: B:18:0x0033, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0233 A[Catch: Exception -> 0x0041, TryCatch #1 {Exception -> 0x0041, blocks: (B:19:0x0033, B:21:0x0039, B:22:0x0045, B:24:0x004b, B:25:0x0052, B:30:0x0068, B:31:0x0071, B:68:0x01b7, B:69:0x01be, B:71:0x01c8, B:73:0x01df, B:75:0x01e9, B:76:0x01ef, B:78:0x01fb, B:79:0x0209, B:81:0x0215, B:83:0x0217, B:86:0x021a, B:88:0x0220, B:89:0x0225, B:91:0x0233, B:92:0x023c, B:94:0x0243, B:95:0x0915, B:98:0x0248, B:100:0x024f, B:101:0x0254, B:103:0x025b, B:104:0x0260, B:106:0x0267, B:107:0x026c, B:109:0x0273, B:110:0x0278, B:112:0x027f, B:113:0x0284, B:115:0x028b, B:116:0x0290, B:118:0x0298, B:120:0x02a0, B:122:0x02a6, B:124:0x02b0, B:125:0x02e6, B:128:0x02f3, B:129:0x02bb, B:131:0x02c5, B:132:0x02d1, B:133:0x02dc, B:134:0x030a, B:136:0x0316, B:139:0x032d, B:153:0x0348, B:154:0x034b, B:155:0x034e, B:156:0x0351, B:157:0x0354, B:159:0x0359, B:160:0x036a, B:162:0x0372, B:164:0x0378, B:166:0x037f, B:168:0x0391, B:169:0x0396, B:170:0x03a7, B:171:0x03bb, B:172:0x03cc, B:173:0x03dd, B:174:0x03f7, B:176:0x03fd, B:177:0x0400, B:178:0x0411, B:180:0x0417, B:181:0x041f, B:183:0x0425, B:186:0x0431, B:191:0x0435, B:192:0x0446, B:194:0x044c, B:196:0x0452, B:197:0x0455, B:198:0x0466, B:199:0x0477, B:201:0x047d, B:202:0x0480, B:203:0x0491, B:205:0x0499, B:207:0x04b1, B:208:0x04b3, B:209:0x04c8, B:211:0x04ce, B:212:0x04d1, B:213:0x04e2, B:215:0x04e8, B:217:0x04ee, B:218:0x04f1, B:219:0x0502, B:221:0x0508, B:222:0x050b, B:223:0x051c, B:225:0x0522, B:226:0x0525, B:228:0x0537, B:230:0x0541, B:234:0x0557, B:235:0x0548, B:237:0x054e, B:239:0x0554, B:244:0x055a, B:245:0x056b, B:246:0x057c, B:248:0x0582, B:250:0x0588, B:251:0x058b, B:252:0x059c, B:254:0x05a2, B:255:0x05a5, B:256:0x05b6, B:258:0x05bc, B:259:0x05bf, B:260:0x05d0, B:261:0x05ea, B:262:0x05fb, B:264:0x0601, B:265:0x0604, B:266:0x0615, B:268:0x061b, B:270:0x0621, B:271:0x0624, B:272:0x0635, B:274:0x063b, B:275:0x063e, B:276:0x064f, B:277:0x0660, B:279:0x0666, B:280:0x0669, B:281:0x067a, B:283:0x0680, B:284:0x0683, B:285:0x0694, B:287:0x069a, B:288:0x069d, B:289:0x06ae, B:291:0x06b4, B:292:0x06b7, B:293:0x06c8, B:295:0x06ce, B:296:0x06d1, B:297:0x06e2, B:299:0x06e8, B:300:0x06eb, B:301:0x06fc, B:303:0x0702, B:304:0x0705, B:305:0x0716, B:306:0x072a, B:307:0x073b, B:308:0x074c, B:309:0x075d, B:311:0x0763, B:312:0x0766, B:313:0x0777, B:315:0x077d, B:316:0x0780, B:317:0x0791, B:319:0x0797, B:320:0x079a, B:321:0x07ab, B:323:0x07b1, B:324:0x07b4, B:325:0x07c5, B:327:0x07cb, B:329:0x07d1, B:330:0x07d4, B:331:0x07e5, B:333:0x07eb, B:335:0x07f1, B:336:0x07f4, B:337:0x0805, B:339:0x080b, B:340:0x080e, B:341:0x081f, B:343:0x0825, B:344:0x0828, B:345:0x0839, B:347:0x083f, B:348:0x0842, B:349:0x0853, B:350:0x08af, B:351:0x08bf, B:353:0x08c5, B:355:0x08cb, B:356:0x08ce, B:357:0x08de, B:359:0x08e4, B:361:0x08ea, B:362:0x08ed, B:363:0x08fd, B:365:0x0903, B:366:0x0906, B:433:0x01b2, B:434:0x006d, B:34:0x0074, B:36:0x0082, B:39:0x008f, B:41:0x0097, B:44:0x00a0, B:46:0x00a8, B:49:0x00b1, B:51:0x00b5, B:53:0x00c3, B:55:0x00c9, B:57:0x00cf, B:60:0x00d8, B:61:0x019c, B:64:0x01a4, B:66:0x01aa, B:67:0x01ae, B:372:0x00e7, B:375:0x0106, B:377:0x010c, B:379:0x0112, B:383:0x011d, B:385:0x0123, B:388:0x012c, B:390:0x013a, B:393:0x0142, B:396:0x0152, B:397:0x0154, B:399:0x0166, B:402:0x016e, B:404:0x0172, B:408:0x017a, B:410:0x0182, B:413:0x0189, B:415:0x018f, B:417:0x0194, B:423:0x014f, B:427:0x019a), top: B:18:0x0033, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0243 A[Catch: Exception -> 0x0041, TryCatch #1 {Exception -> 0x0041, blocks: (B:19:0x0033, B:21:0x0039, B:22:0x0045, B:24:0x004b, B:25:0x0052, B:30:0x0068, B:31:0x0071, B:68:0x01b7, B:69:0x01be, B:71:0x01c8, B:73:0x01df, B:75:0x01e9, B:76:0x01ef, B:78:0x01fb, B:79:0x0209, B:81:0x0215, B:83:0x0217, B:86:0x021a, B:88:0x0220, B:89:0x0225, B:91:0x0233, B:92:0x023c, B:94:0x0243, B:95:0x0915, B:98:0x0248, B:100:0x024f, B:101:0x0254, B:103:0x025b, B:104:0x0260, B:106:0x0267, B:107:0x026c, B:109:0x0273, B:110:0x0278, B:112:0x027f, B:113:0x0284, B:115:0x028b, B:116:0x0290, B:118:0x0298, B:120:0x02a0, B:122:0x02a6, B:124:0x02b0, B:125:0x02e6, B:128:0x02f3, B:129:0x02bb, B:131:0x02c5, B:132:0x02d1, B:133:0x02dc, B:134:0x030a, B:136:0x0316, B:139:0x032d, B:153:0x0348, B:154:0x034b, B:155:0x034e, B:156:0x0351, B:157:0x0354, B:159:0x0359, B:160:0x036a, B:162:0x0372, B:164:0x0378, B:166:0x037f, B:168:0x0391, B:169:0x0396, B:170:0x03a7, B:171:0x03bb, B:172:0x03cc, B:173:0x03dd, B:174:0x03f7, B:176:0x03fd, B:177:0x0400, B:178:0x0411, B:180:0x0417, B:181:0x041f, B:183:0x0425, B:186:0x0431, B:191:0x0435, B:192:0x0446, B:194:0x044c, B:196:0x0452, B:197:0x0455, B:198:0x0466, B:199:0x0477, B:201:0x047d, B:202:0x0480, B:203:0x0491, B:205:0x0499, B:207:0x04b1, B:208:0x04b3, B:209:0x04c8, B:211:0x04ce, B:212:0x04d1, B:213:0x04e2, B:215:0x04e8, B:217:0x04ee, B:218:0x04f1, B:219:0x0502, B:221:0x0508, B:222:0x050b, B:223:0x051c, B:225:0x0522, B:226:0x0525, B:228:0x0537, B:230:0x0541, B:234:0x0557, B:235:0x0548, B:237:0x054e, B:239:0x0554, B:244:0x055a, B:245:0x056b, B:246:0x057c, B:248:0x0582, B:250:0x0588, B:251:0x058b, B:252:0x059c, B:254:0x05a2, B:255:0x05a5, B:256:0x05b6, B:258:0x05bc, B:259:0x05bf, B:260:0x05d0, B:261:0x05ea, B:262:0x05fb, B:264:0x0601, B:265:0x0604, B:266:0x0615, B:268:0x061b, B:270:0x0621, B:271:0x0624, B:272:0x0635, B:274:0x063b, B:275:0x063e, B:276:0x064f, B:277:0x0660, B:279:0x0666, B:280:0x0669, B:281:0x067a, B:283:0x0680, B:284:0x0683, B:285:0x0694, B:287:0x069a, B:288:0x069d, B:289:0x06ae, B:291:0x06b4, B:292:0x06b7, B:293:0x06c8, B:295:0x06ce, B:296:0x06d1, B:297:0x06e2, B:299:0x06e8, B:300:0x06eb, B:301:0x06fc, B:303:0x0702, B:304:0x0705, B:305:0x0716, B:306:0x072a, B:307:0x073b, B:308:0x074c, B:309:0x075d, B:311:0x0763, B:312:0x0766, B:313:0x0777, B:315:0x077d, B:316:0x0780, B:317:0x0791, B:319:0x0797, B:320:0x079a, B:321:0x07ab, B:323:0x07b1, B:324:0x07b4, B:325:0x07c5, B:327:0x07cb, B:329:0x07d1, B:330:0x07d4, B:331:0x07e5, B:333:0x07eb, B:335:0x07f1, B:336:0x07f4, B:337:0x0805, B:339:0x080b, B:340:0x080e, B:341:0x081f, B:343:0x0825, B:344:0x0828, B:345:0x0839, B:347:0x083f, B:348:0x0842, B:349:0x0853, B:350:0x08af, B:351:0x08bf, B:353:0x08c5, B:355:0x08cb, B:356:0x08ce, B:357:0x08de, B:359:0x08e4, B:361:0x08ea, B:362:0x08ed, B:363:0x08fd, B:365:0x0903, B:366:0x0906, B:433:0x01b2, B:434:0x006d, B:34:0x0074, B:36:0x0082, B:39:0x008f, B:41:0x0097, B:44:0x00a0, B:46:0x00a8, B:49:0x00b1, B:51:0x00b5, B:53:0x00c3, B:55:0x00c9, B:57:0x00cf, B:60:0x00d8, B:61:0x019c, B:64:0x01a4, B:66:0x01aa, B:67:0x01ae, B:372:0x00e7, B:375:0x0106, B:377:0x010c, B:379:0x0112, B:383:0x011d, B:385:0x0123, B:388:0x012c, B:390:0x013a, B:393:0x0142, B:396:0x0152, B:397:0x0154, B:399:0x0166, B:402:0x016e, B:404:0x0172, B:408:0x017a, B:410:0x0182, B:413:0x0189, B:415:0x018f, B:417:0x0194, B:423:0x014f, B:427:0x019a), top: B:18:0x0033, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0248 A[Catch: Exception -> 0x0041, TryCatch #1 {Exception -> 0x0041, blocks: (B:19:0x0033, B:21:0x0039, B:22:0x0045, B:24:0x004b, B:25:0x0052, B:30:0x0068, B:31:0x0071, B:68:0x01b7, B:69:0x01be, B:71:0x01c8, B:73:0x01df, B:75:0x01e9, B:76:0x01ef, B:78:0x01fb, B:79:0x0209, B:81:0x0215, B:83:0x0217, B:86:0x021a, B:88:0x0220, B:89:0x0225, B:91:0x0233, B:92:0x023c, B:94:0x0243, B:95:0x0915, B:98:0x0248, B:100:0x024f, B:101:0x0254, B:103:0x025b, B:104:0x0260, B:106:0x0267, B:107:0x026c, B:109:0x0273, B:110:0x0278, B:112:0x027f, B:113:0x0284, B:115:0x028b, B:116:0x0290, B:118:0x0298, B:120:0x02a0, B:122:0x02a6, B:124:0x02b0, B:125:0x02e6, B:128:0x02f3, B:129:0x02bb, B:131:0x02c5, B:132:0x02d1, B:133:0x02dc, B:134:0x030a, B:136:0x0316, B:139:0x032d, B:153:0x0348, B:154:0x034b, B:155:0x034e, B:156:0x0351, B:157:0x0354, B:159:0x0359, B:160:0x036a, B:162:0x0372, B:164:0x0378, B:166:0x037f, B:168:0x0391, B:169:0x0396, B:170:0x03a7, B:171:0x03bb, B:172:0x03cc, B:173:0x03dd, B:174:0x03f7, B:176:0x03fd, B:177:0x0400, B:178:0x0411, B:180:0x0417, B:181:0x041f, B:183:0x0425, B:186:0x0431, B:191:0x0435, B:192:0x0446, B:194:0x044c, B:196:0x0452, B:197:0x0455, B:198:0x0466, B:199:0x0477, B:201:0x047d, B:202:0x0480, B:203:0x0491, B:205:0x0499, B:207:0x04b1, B:208:0x04b3, B:209:0x04c8, B:211:0x04ce, B:212:0x04d1, B:213:0x04e2, B:215:0x04e8, B:217:0x04ee, B:218:0x04f1, B:219:0x0502, B:221:0x0508, B:222:0x050b, B:223:0x051c, B:225:0x0522, B:226:0x0525, B:228:0x0537, B:230:0x0541, B:234:0x0557, B:235:0x0548, B:237:0x054e, B:239:0x0554, B:244:0x055a, B:245:0x056b, B:246:0x057c, B:248:0x0582, B:250:0x0588, B:251:0x058b, B:252:0x059c, B:254:0x05a2, B:255:0x05a5, B:256:0x05b6, B:258:0x05bc, B:259:0x05bf, B:260:0x05d0, B:261:0x05ea, B:262:0x05fb, B:264:0x0601, B:265:0x0604, B:266:0x0615, B:268:0x061b, B:270:0x0621, B:271:0x0624, B:272:0x0635, B:274:0x063b, B:275:0x063e, B:276:0x064f, B:277:0x0660, B:279:0x0666, B:280:0x0669, B:281:0x067a, B:283:0x0680, B:284:0x0683, B:285:0x0694, B:287:0x069a, B:288:0x069d, B:289:0x06ae, B:291:0x06b4, B:292:0x06b7, B:293:0x06c8, B:295:0x06ce, B:296:0x06d1, B:297:0x06e2, B:299:0x06e8, B:300:0x06eb, B:301:0x06fc, B:303:0x0702, B:304:0x0705, B:305:0x0716, B:306:0x072a, B:307:0x073b, B:308:0x074c, B:309:0x075d, B:311:0x0763, B:312:0x0766, B:313:0x0777, B:315:0x077d, B:316:0x0780, B:317:0x0791, B:319:0x0797, B:320:0x079a, B:321:0x07ab, B:323:0x07b1, B:324:0x07b4, B:325:0x07c5, B:327:0x07cb, B:329:0x07d1, B:330:0x07d4, B:331:0x07e5, B:333:0x07eb, B:335:0x07f1, B:336:0x07f4, B:337:0x0805, B:339:0x080b, B:340:0x080e, B:341:0x081f, B:343:0x0825, B:344:0x0828, B:345:0x0839, B:347:0x083f, B:348:0x0842, B:349:0x0853, B:350:0x08af, B:351:0x08bf, B:353:0x08c5, B:355:0x08cb, B:356:0x08ce, B:357:0x08de, B:359:0x08e4, B:361:0x08ea, B:362:0x08ed, B:363:0x08fd, B:365:0x0903, B:366:0x0906, B:433:0x01b2, B:434:0x006d, B:34:0x0074, B:36:0x0082, B:39:0x008f, B:41:0x0097, B:44:0x00a0, B:46:0x00a8, B:49:0x00b1, B:51:0x00b5, B:53:0x00c3, B:55:0x00c9, B:57:0x00cf, B:60:0x00d8, B:61:0x019c, B:64:0x01a4, B:66:0x01aa, B:67:0x01ae, B:372:0x00e7, B:375:0x0106, B:377:0x010c, B:379:0x0112, B:383:0x011d, B:385:0x0123, B:388:0x012c, B:390:0x013a, B:393:0x0142, B:396:0x0152, B:397:0x0154, B:399:0x0166, B:402:0x016e, B:404:0x0172, B:408:0x017a, B:410:0x0182, B:413:0x0189, B:415:0x018f, B:417:0x0194, B:423:0x014f, B:427:0x019a), top: B:18:0x0033, inners: #0 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        C17945a0 m143954n;
        int i12;
        View view;
        boolean z11;
        ChatView chatView;
        int mo10005m = mo10005m(i11);
        m64488J1();
        if (i11 == 0 && this.f60311V == 1) {
            this.f60306Q.m60099lP(true);
        }
        if ((abstractC1876c0 instanceof AbstractC11316a.d) && this.f60311V == 1) {
            ChatView chatView2 = this.f60306Q;
            if (chatView2.f56781O1) {
                chatView2.f56811V3.run();
            }
        }
        if (abstractC1876c0 instanceof AbstractC11316a.e) {
            final AbstractC11316a.e eVar = (AbstractC11316a.e) abstractC1876c0;
            try {
                View view2 = eVar.f7784p;
                if (view2 instanceof ChatRow) {
                    this.f60314Y.add((ChatRow) view2);
                }
                View view3 = eVar.f7784p;
                if (view3 instanceof ChatRowWebContent) {
                    this.f60315Z.add((ChatRowWebContent) view3);
                }
                int m60491e0 = i11 - m60491e0();
                C28771c c28771c = (C28771c) m60492f0(m60491e0);
                int m143952l = c28771c.m143952l();
                if (m143952l != 2 && m143952l != 3) {
                    m143954n = c28771c.m143951k();
                    eVar.f57039J = m60491e0;
                    C28769a m60473E0 = m60473E0(m143954n.m95029V3());
                    m60473E0.f133316l = mo60487Z() != 1 && c28771c.m143960t();
                    m60473E0.f133317m = mo60487Z() != 1 && c28771c.m143961u();
                    m60473E0.f133318n = mo60487Z() != 1 && c28771c.m143963w();
                    if (m60491e0 != 0) {
                        C3535c m2634q = AbstractC23306f.m120584H0().m2634q(m143954n.mo95039W2());
                        m60473E0.f133309e = m2634q != null && m2634q.m136045K() && (!c28771c.m143964x() || c28771c.m143959s() == 1);
                        m60473E0.f133311g = true;
                        m60473E0.f133321q = !m143954n.m95032V6();
                    } else if (m60491e0 > 0) {
                        C28771c c28771c2 = (C28771c) m60492f0(m60491e0 - 1);
                        boolean z12 = m143954n.m94974P4() - c28771c2.m143954n().m94974P4() > 1800000;
                        boolean z13 = !c28771c.m143964x() && c28771c2.m143964x() && c28771c2.m143959s() > 1;
                        boolean z14 = z13 && m143954n.m94872D8() && !m143954n.m94865C8();
                        C28771c c28771c3 = (C28771c) m60492f0(m60491e0 + 1);
                        if ((!c28771c.m143964x() || c28771c.m143959s() <= 1 || c28771c3 == null || c28771c3.m143964x()) && !z14 && (z12 || z13)) {
                            m60473E0.f133309e = true;
                            boolean m95261t6 = c28771c2.m143951k().m95261t6();
                            if (m64486H1(m143954n, c28771c2.m143951k()) && !m143954n.m95226p6() && !m95261t6 && !m60473E0.f133316l && !m60473E0.f133317m) {
                                z11 = false;
                                m60473E0.f133311g = z11;
                                m60473E0.f133321q = m143954n.m95032V6() && m60473E0.f133311g;
                                if (this.f60311V == 1 && m60491e0 == this.f57025w - 1) {
                                    this.f60306Q.m60099lP(false);
                                }
                            }
                            z11 = true;
                            m60473E0.f133311g = z11;
                            m60473E0.f133321q = m143954n.m95032V6() && m60473E0.f133311g;
                            if (this.f60311V == 1) {
                                this.f60306Q.m60099lP(false);
                            }
                        }
                        m60473E0.f133309e = false;
                        boolean m95261t62 = c28771c2.m143951k().m95261t6();
                        if (m64486H1(m143954n, c28771c2.m143951k())) {
                            z11 = false;
                            m60473E0.f133311g = z11;
                            m60473E0.f133321q = m143954n.m95032V6() && m60473E0.f133311g;
                            if (this.f60311V == 1) {
                            }
                        }
                        z11 = true;
                        m60473E0.f133311g = z11;
                        m60473E0.f133321q = m143954n.m95032V6() && m60473E0.f133311g;
                        if (this.f60311V == 1) {
                        }
                    } else {
                        m60473E0.f133309e = false;
                    }
                    m60473E0.f133312h = m60491e0 != this.f57025w - 1;
                    chatView = this.f60306Q;
                    if (chatView != null) {
                        m60473E0.f133308d = chatView.f56896r1;
                    }
                    m64562i2();
                    C3554v m60131nQ = this.f60306Q.m60131nQ();
                    for (i12 = 0; i12 < c28771c.m143950j().size(); i12++) {
                        C17945a0 m143953m = c28771c.m143953m(i12);
                        C28769a m60473E02 = m60473E0(m143953m.m95029V3());
                        m60473E02.f133313i = false;
                        m60473E02.f133314j = false;
                        m60473E02.f133315k = false;
                        m60473E02.f133328x = null;
                        if (m60131nQ != null && m143953m.m95135f9(m60131nQ.m18061c())) {
                            m60473E02.f133314j = true;
                            m60473E02.f133328x = m60131nQ.f15021j;
                        }
                        if (this.f60306Q.m59802RQ(m143953m.m95029V3())) {
                            m60473E02.f133313i = true;
                            m60473E02.f133329y = this.f60306Q.m60020gQ().mo60762ln(m143953m);
                        }
                        if (this.f60306Q.m59789QQ(m143953m.m95029V3())) {
                            m60473E02.f133315k = true;
                        }
                    }
                    if (m143954n.m95144g8()) {
                        this.f60306Q.m60266wP();
                    }
                    m143954n.m95282w1();
                    m64528j2(eVar, this.f57024v, mo10005m);
                    view = eVar.f7784p;
                    if (view instanceof ChatRow) {
                        ((ChatRow) view).setSourceAction(m64482C1());
                    }
                    if (m143954n.m95041W4() != -5) {
                        m64532m1(eVar);
                    } else if (m143954n.m95041W4() == -2) {
                        m64537p1(eVar, m143954n);
                    } else if (m143954n.m95041W4() == -1) {
                        m64539q1(eVar, m143954n);
                    } else if (m143954n.m95041W4() == -3) {
                        m64543s1(eVar);
                    } else if (m143954n.m95041W4() == -4) {
                        m64541r1(eVar);
                    } else if (m143954n.m95041W4() == -6) {
                        m64533n1(eVar);
                    } else if (m143954n.m95041W4() == -7) {
                        m64535o1(eVar);
                    } else {
                        if (this.f57024v.m41013q()) {
                            C31973j5 m41001e = this.f57024v.m41001e(false);
                            if (m41001e != null && m41001e.m153753c0()) {
                                if (m41001e.m153780q0(m143954n.m94862C4())) {
                                    m60473E0(m143954n.m95029V3()).f133319o = 1;
                                } else if (m41001e.m153744V(m143954n.m94862C4())) {
                                    m60473E0(m143954n.m95029V3()).f133319o = 2;
                                } else {
                                    m60473E0(m143954n.m95029V3()).f133319o = 0;
                                }
                            } else {
                                m60473E0(m143954n.m95029V3()).f133319o = 0;
                            }
                            int[] m119486d = AbstractC23188q6.m119486d();
                            int length = m119486d.length;
                            if (AbstractC23309i.m120887E2() == 1 && length > 0) {
                                m60473E0(m143954n.m95029V3()).f133307c = m119486d[(int) (Long.parseLong(m143954n.m94862C4()) % length)];
                            }
                        }
                        m60473E0(m143954n.m95029V3()).f133327w = mo10005m == 14 && this.f57019L.containsValue(Long.valueOf(m143954n.m95029V3().m41045i()));
                        if (mo10005m != 0) {
                            if (mo10005m != 1) {
                                if (mo10005m == 2) {
                                    if (m143954n.m95032V6() && !m143954n.m95180k8()) {
                                        C0814e0.m2056b(m143954n);
                                    }
                                    m64531l2(eVar.f57045M, m60491e0);
                                    eVar.f57045M.setMessage(c28771c);
                                    AbstractC23136l9.m118744r1(eVar.f57045M, 0);
                                } else if (mo10005m == 14) {
                                    m64531l2(eVar.f57063a0, m60491e0);
                                    eVar.f57063a0.setMessage(c28771c);
                                    AbstractC23136l9.m118744r1(eVar.f57063a0, 0);
                                } else if (mo10005m == 18) {
                                    eVar.f57064b0.m60897e(m143954n);
                                    AbstractC23136l9.m118744r1(eVar.f57064b0, 0);
                                    eVar.f57064b0.m60883n(m143954n, m60473E0(m143954n.m95029V3()).f133310f);
                                    eVar.f57064b0.m60884p(this.f60305P, m143954n, this.f60306Q.m92676n2(), C23278z2.m120127f1(), m64547v1());
                                    eVar.f57064b0.setViewTag(String.valueOf(m60491e0));
                                    eVar.f57064b0.setTagPosition(m60491e0);
                                    eVar.f57064b0.setOnLongClickAction(new View.OnLongClickListener() { // from class: v50.ob
                                        @Override // android.view.View.OnLongClickListener
                                        public final boolean onLongClick(View view4) {
                                            boolean m64501Q1;
                                            m64501Q1 = C11603g0.this.m64501Q1(eVar, view4);
                                            return m64501Q1;
                                        }
                                    });
                                    eVar.f57064b0.setOnListItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: v50.pb
                                        @Override // android.widget.AdapterView.OnItemLongClickListener
                                        public final boolean onItemLongClick(AdapterView adapterView, View view4, int i13, long j11) {
                                            boolean m64503R1;
                                            m64503R1 = C11603g0.this.m64503R1(adapterView, view4, i13, j11);
                                            return m64503R1;
                                        }
                                    });
                                    eVar.f57064b0.setRichMessageListener(new c());
                                } else if (mo10005m == 53) {
                                    if (m143954n.m95043W6()) {
                                        C0814e0.m2056b(m143954n);
                                    }
                                    m64531l2(eVar.f57078p0, m60491e0);
                                    eVar.f57078p0.setMessage(c28771c);
                                    AbstractC23136l9.m118744r1(eVar.f57078p0, 0);
                                } else if (mo10005m == 76) {
                                    if (m143954n.m95043W6()) {
                                        C0814e0.m2056b(m143954n);
                                    }
                                    m64531l2(eVar.f57048N0, m60491e0);
                                    eVar.f57048N0.setMessage(c28771c);
                                    AbstractC23136l9.m118744r1(eVar.f57048N0, 0);
                                } else if (mo10005m != 77) {
                                    switch (mo10005m) {
                                        case 4:
                                            if (m143954n.m95032V6() && !m143954n.m95180k8()) {
                                                C0814e0.m2056b(m143954n);
                                            }
                                            m64531l2(eVar.f57047N, m60491e0);
                                            eVar.f57047N.setMessage(c28771c);
                                            AbstractC23136l9.m118744r1(eVar.f57047N, 0);
                                            break;
                                        case 5:
                                            if (m143954n.m95032V6() && !m143954n.m95180k8()) {
                                                C0814e0.m2056b(m143954n);
                                            }
                                            m64531l2(eVar.f57049O, m60491e0);
                                            eVar.f57049O.setMessage(c28771c);
                                            AbstractC23136l9.m118744r1(eVar.f57049O, 0);
                                            break;
                                        case 6:
                                            if (m143954n.m95043W6()) {
                                                C0814e0.m2056b(m143954n);
                                            }
                                            m64531l2(eVar.f57051P, m60491e0);
                                            eVar.f57051P.setMessage(c28771c);
                                            AbstractC23136l9.m118744r1(eVar.f57051P, 0);
                                            break;
                                        case 7:
                                            if (m143954n.m95043W6()) {
                                                C0814e0.m2056b(m143954n);
                                            }
                                            m64531l2(eVar.f57053Q, m60491e0);
                                            eVar.f57053Q.setMessage(c28771c);
                                            AbstractC23136l9.m118744r1(eVar.f57053Q, 0);
                                            break;
                                        case 8:
                                            if (m143954n.m95043W6()) {
                                                C0814e0.m2056b(m143954n);
                                            }
                                            m64531l2(eVar.f57054R, m60491e0);
                                            eVar.f57054R.setMessage(c28771c);
                                            AbstractC23136l9.m118744r1(eVar.f57054R, 0);
                                            break;
                                        case 9:
                                            if (m143954n.m95043W6()) {
                                                C0814e0.m2056b(m143954n);
                                            }
                                            m64531l2(eVar.f57055S, m60491e0);
                                            eVar.f57055S.setMessage(c28771c);
                                            AbstractC23136l9.m118744r1(eVar.f57055S, 0);
                                            break;
                                        case 10:
                                            m64531l2(eVar.f57059W, m60491e0);
                                            eVar.f57059W.setMessage(c28771c);
                                            AbstractC23136l9.m118744r1(eVar.f57059W, 0);
                                            break;
                                        case 11:
                                            m64531l2(eVar.f57061Y, m60491e0);
                                            eVar.f57061Y.setMessage(c28771c);
                                            AbstractC23136l9.m118744r1(eVar.f57061Y, 0);
                                            break;
                                        case 12:
                                            m64531l2(eVar.f57062Z, m60491e0);
                                            eVar.f57062Z.setMessage(c28771c);
                                            AbstractC23136l9.m118744r1(eVar.f57062Z, 0);
                                            break;
                                        default:
                                            switch (mo10005m) {
                                                case 20:
                                                    break;
                                                case 21:
                                                    m64531l2(eVar.f57086x0, m60491e0);
                                                    eVar.f57086x0.setMessage(c28771c);
                                                    AbstractC23136l9.m118744r1(eVar.f57086x0, 0);
                                                    m64548v2(c28771c);
                                                    break;
                                                case 22:
                                                    if (m143954n.m95043W6()) {
                                                        C0814e0.m2056b(m143954n);
                                                    }
                                                    m64531l2(eVar.f57067e0, m60491e0);
                                                    eVar.f57067e0.setMessage(c28771c);
                                                    AbstractC23136l9.m118744r1(eVar.f57067e0, 0);
                                                    break;
                                                case 23:
                                                    if (m143954n.m95043W6()) {
                                                        C0814e0.m2056b(m143954n);
                                                    }
                                                    m64531l2(eVar.f57071i0, m60491e0);
                                                    eVar.f57071i0.setMessage(c28771c);
                                                    AbstractC23136l9.m118744r1(eVar.f57071i0, 0);
                                                    break;
                                                case 24:
                                                    if (m143954n.m95043W6()) {
                                                        C0814e0.m2056b(m143954n);
                                                    }
                                                    m64531l2(eVar.f57072j0, m60491e0);
                                                    eVar.f57072j0.setMessage(c28771c);
                                                    AbstractC23136l9.m118744r1(eVar.f57072j0, 0);
                                                    break;
                                                case 25:
                                                    if (m143954n.m95043W6()) {
                                                        C0814e0.m2056b(m143954n);
                                                    }
                                                    m64531l2(eVar.f57068f0, m60491e0);
                                                    eVar.f57068f0.setMessage(c28771c);
                                                    AbstractC23136l9.m118744r1(eVar.f57068f0, 0);
                                                    break;
                                                case 26:
                                                    if (m143954n.m95043W6()) {
                                                        C0814e0.m2056b(m143954n);
                                                    }
                                                    m64531l2(eVar.f57069g0, m60491e0);
                                                    eVar.f57069g0.setMessage(c28771c);
                                                    AbstractC23136l9.m118744r1(eVar.f57069g0, 0);
                                                    break;
                                                default:
                                                    switch (mo10005m) {
                                                        case 29:
                                                            if (m143954n.m95043W6()) {
                                                                C0814e0.m2056b(m143954n);
                                                            }
                                                            m64531l2(eVar.f57073k0, m60491e0);
                                                            eVar.f57073k0.setMessage(c28771c);
                                                            AbstractC23136l9.m118744r1(eVar.f57073k0, 0);
                                                            break;
                                                        case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                                                            if (m143954n.m95043W6()) {
                                                                C0814e0.m2056b(m143954n);
                                                            }
                                                            m64531l2(eVar.f57074l0, m60491e0);
                                                            eVar.f57074l0.setMessage(c28771c);
                                                            AbstractC23136l9.m118744r1(eVar.f57074l0, 0);
                                                            break;
                                                        case 31:
                                                            m64531l2(eVar.f57066d0, m60491e0);
                                                            eVar.f57066d0.setMessage(c28771c);
                                                            AbstractC23136l9.m118744r1(eVar.f57066d0, 0);
                                                            break;
                                                        case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                                            if (m143954n.m95043W6()) {
                                                                C0814e0.m2056b(m143954n);
                                                            }
                                                            m64531l2(eVar.f57065c0, m60491e0);
                                                            eVar.f57065c0.setMessage(c28771c);
                                                            AbstractC23136l9.m118744r1(eVar.f57065c0, 0);
                                                            break;
                                                        case 33:
                                                            if (m143954n.m95032V6() && !m143954n.m95180k8()) {
                                                                C0814e0.m2056b(m143954n);
                                                            }
                                                            m64531l2(eVar.f57076n0, m60491e0);
                                                            eVar.f57076n0.setMessage(c28771c);
                                                            AbstractC23136l9.m118744r1(eVar.f57076n0, 0);
                                                            break;
                                                        case 34:
                                                            if (m143954n.m95043W6()) {
                                                                C0814e0.m2056b(m143954n);
                                                            }
                                                            m64531l2(eVar.f57077o0, m60491e0);
                                                            eVar.f57077o0.setMessage(c28771c);
                                                            AbstractC23136l9.m118744r1(eVar.f57077o0, 0);
                                                            break;
                                                        case 35:
                                                            m64531l2(eVar.f57080r0, m60491e0);
                                                            eVar.f57080r0.setMessage(c28771c);
                                                            AbstractC23136l9.m118744r1(eVar.f57080r0, 0);
                                                            break;
                                                        case 36:
                                                            eVar.f57084v0.m60897e(m143954n);
                                                            eVar.f57084v0.setViewTag(Integer.valueOf(m60491e0));
                                                            eVar.f57084v0.setChatContent(m143954n);
                                                            eVar.f57084v0.setTagPosition(m60491e0);
                                                            break;
                                                        default:
                                                            switch (mo10005m) {
                                                                case 39:
                                                                    break;
                                                                case 40:
                                                                    break;
                                                                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                                                                    if (m143954n.m95043W6()) {
                                                                        C0814e0.m2056b(m143954n);
                                                                    }
                                                                    m64531l2(eVar.f57056T, m60491e0);
                                                                    eVar.f57056T.setMessage(c28771c);
                                                                    AbstractC23136l9.m118744r1(eVar.f57056T, 0);
                                                                    break;
                                                                case 42:
                                                                    if (m143954n.m95043W6()) {
                                                                        C0814e0.m2056b(m143954n);
                                                                    }
                                                                    m64531l2(eVar.f57057U, m60491e0);
                                                                    eVar.f57057U.setMessage(c28771c);
                                                                    AbstractC23136l9.m118744r1(eVar.f57057U, 0);
                                                                    break;
                                                                case 43:
                                                                    if (m143954n.m95032V6() && m143954n.m94977P7()) {
                                                                        C0814e0.m2056b(m143954n);
                                                                    }
                                                                    m64531l2(eVar.f57058V, m60491e0);
                                                                    eVar.f57058V.setMessage(c28771c);
                                                                    AbstractC23136l9.m118744r1(eVar.f57058V, 0);
                                                                    break;
                                                                case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                                                                    m64531l2(eVar.f57033E0, m60491e0);
                                                                    eVar.f57033E0.setMessage(c28771c);
                                                                    AbstractC23136l9.m118744r1(eVar.f57033E0, 0);
                                                                    break;
                                                                default:
                                                                    switch (mo10005m) {
                                                                        case 56:
                                                                            for (int i13 = 0; i13 < c28771c.m143950j().size(); i13++) {
                                                                                C17945a0 m143953m2 = c28771c.m143953m(i13);
                                                                                if (m143953m2 != null && m143954n.m95032V6() && !m143954n.m95180k8()) {
                                                                                    C0814e0.m2056b(m143953m2);
                                                                                }
                                                                            }
                                                                            m64531l2(eVar.f57081s0, m60491e0);
                                                                            eVar.f57081s0.setMessage(c28771c);
                                                                            AbstractC23136l9.m118744r1(eVar.f57081s0, 0);
                                                                            break;
                                                                        case 57:
                                                                            if (m143954n.m95043W6()) {
                                                                                C0814e0.m2056b(m143954n);
                                                                            }
                                                                            eVar.f57083u0.setPositionTag(m60491e0);
                                                                            eVar.f57083u0.setMessage(c28771c);
                                                                            AbstractC23136l9.m118744r1(eVar.f57083u0, 0);
                                                                            break;
                                                                        case 58:
                                                                            if (m143954n.m95043W6()) {
                                                                                C0814e0.m2056b(m143954n);
                                                                            }
                                                                            m64531l2(eVar.f57082t0, m60491e0);
                                                                            eVar.f57082t0.setMessage(c28771c);
                                                                            AbstractC23136l9.m118744r1(eVar.f57082t0, 0);
                                                                            break;
                                                                        case 59:
                                                                            if (m143954n.m95032V6() && !m143954n.m95180k8()) {
                                                                                C0814e0.m2056b(m143954n);
                                                                            }
                                                                            m64531l2(eVar.f57079q0, m60491e0);
                                                                            eVar.f57079q0.setMessage(c28771c);
                                                                            AbstractC23136l9.m118744r1(eVar.f57079q0, 0);
                                                                            break;
                                                                        case 60:
                                                                            if (m143954n.m95043W6()) {
                                                                                C0814e0.m2056b(m143954n);
                                                                            }
                                                                            m64531l2(eVar.f57070h0, m60491e0);
                                                                            eVar.f57070h0.setMessage(c28771c);
                                                                            AbstractC23136l9.m118744r1(eVar.f57070h0, 0);
                                                                            break;
                                                                        case 61:
                                                                            C17969i0 m94929K2 = m143954n.m94929K2();
                                                                            if (m94929K2 instanceof C17952c1) {
                                                                                eVar.f57087y0.m60869p0(AbstractC23136l9.m118742r(40.0f), ChatRow.f57193H5, AbstractC23136l9.m118742r(40.0f), m60473E0(m143954n.m95029V3()).f133312h ? ChatRow.f57211Q5 : 0);
                                                                                eVar.f57087y0.setData((C17952c1) m94929K2);
                                                                                eVar.f57087y0.setListener(this.f60319d0);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 62:
                                                                        case 63:
                                                                            if (m143954n.m95043W6()) {
                                                                                C0814e0.m2056b(m143954n);
                                                                            }
                                                                            m64531l2(eVar.f57088z0, m60491e0);
                                                                            eVar.f57088z0.setMessage(c28771c);
                                                                            AbstractC23136l9.m118744r1(eVar.f57088z0, 0);
                                                                            break;
                                                                        case 64:
                                                                            m64531l2(eVar.f57042K0, m60491e0);
                                                                            eVar.f57042K0.setMessage(c28771c);
                                                                            AbstractC23136l9.m118744r1(eVar.f57042K0, 0);
                                                                            break;
                                                                        case 65:
                                                                            if (m143954n.m95032V6() && !m143954n.m95180k8()) {
                                                                                C0814e0.m2056b(m143954n);
                                                                            }
                                                                            m64531l2(eVar.f57029A0, m60491e0);
                                                                            eVar.f57029A0.setMessage(c28771c);
                                                                            AbstractC23136l9.m118744r1(eVar.f57029A0, 0);
                                                                            break;
                                                                        case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                                                                            if (m143954n.m95032V6()) {
                                                                                for (C17945a0 c17945a0 : c28771c.m143950j()) {
                                                                                    if (!m143954n.m95180k8()) {
                                                                                        C0814e0.m2056b(c17945a0);
                                                                                    }
                                                                                }
                                                                            }
                                                                            m64531l2(eVar.f57044L0, m60491e0);
                                                                            eVar.f57044L0.setMessage(c28771c);
                                                                            AbstractC23136l9.m118744r1(eVar.f57044L0, 0);
                                                                            break;
                                                                        case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                                                                            if (m143954n.m95043W6()) {
                                                                                C0814e0.m2056b(m143954n);
                                                                            }
                                                                            m64531l2(eVar.f57075m0, m60491e0);
                                                                            eVar.f57075m0.setMessage(c28771c);
                                                                            AbstractC23136l9.m118744r1(eVar.f57075m0, 0);
                                                                            break;
                                                                        case 68:
                                                                            eVar.f57085w0.m60897e(m143954n);
                                                                            eVar.f57085w0.setViewTag(Integer.valueOf(m60491e0));
                                                                            eVar.f57085w0.setChatContent(m143954n);
                                                                            eVar.f57085w0.setTagPosition(m60491e0);
                                                                            break;
                                                                        case 69:
                                                                            m64531l2(eVar.f57046M0, m60491e0);
                                                                            eVar.f57046M0.setMessage(c28771c);
                                                                            AbstractC23136l9.m118744r1(eVar.f57046M0, 0);
                                                                            break;
                                                                        case 70:
                                                                            m64531l2(eVar.f57060X, m60491e0);
                                                                            eVar.f57060X.setMessage(c28771c);
                                                                            AbstractC23136l9.m118744r1(eVar.f57060X, 0);
                                                                            break;
                                                                        case 71:
                                                                            m64531l2(eVar.f57030B0, m60491e0);
                                                                            eVar.f57030B0.setMessage(c28771c);
                                                                            AbstractC23136l9.m118744r1(eVar.f57030B0, 0);
                                                                            m64548v2(c28771c);
                                                                            break;
                                                                        case 72:
                                                                            if (m143954n.m95041W4() == 51 && ((m143954n.m95168j3() == -1 || m143954n.m95168j3() == -6) && this.f60307R.mo124314i() - m143954n.m94974P4() > 1209600000)) {
                                                                                C31986k3.f147083a.m154112U2(m143954n);
                                                                            }
                                                                            m64531l2(eVar.f57031C0, m60491e0);
                                                                            eVar.f57031C0.setMessage(c28771c);
                                                                            AbstractC23136l9.m118744r1(eVar.f57031C0, 0);
                                                                            break;
                                                                        case 73:
                                                                            m64531l2(eVar.f57032D0, m60491e0);
                                                                            eVar.f57032D0.setMessage(c28771c);
                                                                            AbstractC23136l9.m118744r1(eVar.f57032D0, 0);
                                                                            break;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                                } else {
                                    if (m143954n.m95043W6()) {
                                        C0814e0.m2056b(m143954n);
                                    }
                                    m64531l2(eVar.f57050O0, m60491e0);
                                    eVar.f57050O0.setMessage(c28771c);
                                    AbstractC23136l9.m118744r1(eVar.f57050O0, 0);
                                }
                            }
                            if (m143954n.m95032V6() && !m143954n.m95180k8()) {
                                C0814e0.m2056b(m143954n);
                            }
                            m64531l2(eVar.f57043L, m60491e0);
                            eVar.f57043L.setMessage(c28771c);
                            AbstractC23136l9.m118744r1(eVar.f57043L, 0);
                        } else {
                            if (m143954n.m95043W6()) {
                                C0814e0.m2056b(m143954n);
                            }
                            m64531l2(eVar.f57041K, m60491e0);
                            eVar.f57041K.setMessage(c28771c);
                            AbstractC23136l9.m118744r1(eVar.f57041K, 0);
                        }
                    }
                    m64546u2(eVar, m143954n);
                }
                m143954n = c28771c.m143954n();
                eVar.f57039J = m60491e0;
                C28769a m60473E03 = m60473E0(m143954n.m95029V3());
                m60473E03.f133316l = mo60487Z() != 1 && c28771c.m143960t();
                m60473E03.f133317m = mo60487Z() != 1 && c28771c.m143961u();
                m60473E03.f133318n = mo60487Z() != 1 && c28771c.m143963w();
                if (m60491e0 != 0) {
                }
                m60473E03.f133312h = m60491e0 != this.f57025w - 1;
                chatView = this.f60306Q;
                if (chatView != null) {
                }
                m64562i2();
                C3554v m60131nQ2 = this.f60306Q.m60131nQ();
                while (i12 < c28771c.m143950j().size()) {
                }
                if (m143954n.m95144g8()) {
                }
                m143954n.m95282w1();
                m64528j2(eVar, this.f57024v, mo10005m);
                view = eVar.f7784p;
                if (view instanceof ChatRow) {
                }
                if (m143954n.m95041W4() != -5) {
                }
                m64546u2(eVar, m143954n);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f60302e0, e11);
            }
        }
    }

    /* renamed from: B1 */
    public String m64550B1() {
        ChatView chatView = this.f60306Q;
        if (chatView != null) {
            return chatView.m60004fQ();
        }
        return "0";
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        RecyclerView.AbstractC1876c0 m60484W = m60484W(viewGroup.getContext(), i11, viewGroup);
        if (i11 == 50) {
            this.f60306Q.f56775M1 = (ChatEmptyView) m60484W.f7784p;
        }
        return m60484W;
    }

    /* renamed from: E1 */
    public boolean m64551E1() {
        return this.f60312W != null;
    }

    /* renamed from: K1 */
    public boolean m64552K1() {
        if (!this.f60313X) {
            return false;
        }
        this.f60313X = false;
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.AbstractC11316a
    /* renamed from: R */
    public InterfaceC11530v mo60479R() {
        return new g();
    }

    @Override // com.zing.zalo.p077ui.chat.AbstractC11316a
    /* renamed from: S */
    public ChatRow.InterfaceC11339n mo60480S() {
        return new f();
    }

    @Override // com.zing.zalo.p077ui.chat.AbstractC11316a
    /* renamed from: T */
    public ChatRowEcard.InterfaceC11352a mo60481T() {
        return new ChatRowEcard.InterfaceC11352a() { // from class: v50.rb
            @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowEcard.InterfaceC11352a
            /* renamed from: a */
            public final void mo61201a(C25301c c25301c, C17945a0 c17945a0) {
                C11603g0.this.m64493M1(c25301c, c17945a0);
            }
        };
    }

    @Override // com.zing.zalo.p077ui.chat.AbstractC11316a
    /* renamed from: U */
    public ChatRowLiveLocation.InterfaceC11371c mo60482U() {
        return new ChatRowLiveLocation.InterfaceC11371c() { // from class: v50.tb
            @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowLiveLocation.InterfaceC11371c
            /* renamed from: a */
            public final void mo61452a(C17945a0 c17945a0) {
                C11603g0.this.m64495N1(c17945a0);
            }
        };
    }

    /* renamed from: U1 */
    public void m64553U1(MessageId messageId) {
        try {
            List m60494h0 = m60494h0();
            int i11 = 0;
            List list = null;
            boolean z11 = false;
            int i12 = 0;
            int i13 = -1;
            while (i11 < m60494h0.size()) {
                List m143955o = ((C28771c) m60494h0.get(i11)).m143955o();
                if (m143955o != list) {
                    if (z11) {
                        break;
                    }
                    Iterator it = m143955o.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((C17945a0) it.next()).m95135f9(messageId)) {
                            i13 = i11 + m60491e0();
                            z11 = true;
                            i12 = 1;
                            break;
                        }
                    }
                } else if (z11) {
                    i12++;
                }
                i11++;
                list = m143955o;
            }
            if (z11) {
                m10013u(i13, i12);
            }
            if (!z11) {
                m10008p();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60302e0, e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.AbstractC11316a
    /* renamed from: V */
    public InterfaceC11505n2 mo60483V() {
        return new h();
    }

    /* renamed from: V1 */
    public void m64554V1() {
        this.f60304O = true;
        if (m64568x1() != null) {
            m64568x1().m104003N();
        }
    }

    /* renamed from: W1 */
    public boolean m64555W1(int i11, KeyEvent keyEvent) {
        if (m64568x1() != null) {
            return m64568x1().m104004O(i11, keyEvent);
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.AbstractC11316a
    /* renamed from: X */
    public ChatRowWebContent.InterfaceC11446g mo60485X() {
        return new i();
    }

    @Override // com.zing.zalo.p077ui.chat.AbstractC11316a
    /* renamed from: Z */
    public int mo60487Z() {
        return this.f60311V;
    }

    /* renamed from: Z1 */
    public void m64556Z1() {
        this.f60303N = false;
        if (m64568x1() != null) {
            m64568x1().m104005P();
        }
        Iterator it = this.f60315Z.iterator();
        while (it.hasNext()) {
            ((ChatRowWebContent) it.next()).m61850h0();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.AbstractC11316a
    /* renamed from: a0 */
    protected EnumC18030a mo60488a0() {
        return this.f60306Q.f56789Q1.m153886E();
    }

    /* renamed from: a2 */
    public void m64557a2() {
        this.f60303N = true;
        if (m64568x1() != null) {
            m64568x1().m104006Q();
        }
        Iterator it = this.f60315Z.iterator();
        while (it.hasNext()) {
            ((ChatRowWebContent) it.next()).m61851k0();
        }
    }

    /* renamed from: c2 */
    public void m64558c2() {
        if (m64568x1() != null) {
            m64568x1().m104009T();
        }
    }

    /* renamed from: d2 */
    void m64559d2(C17945a0 c17945a0) {
        try {
            if (c17945a0.m94929K2() instanceof C18002t0) {
                AbstractC23647d.m123907q("917820", m64482C1());
                AbstractC23152n3.m119042f0(this.f60306Q.m92648SI(), c17945a0.m94929K2().f91015t, ((C18002t0) c17945a0.m94929K2()).f91181B.m153170b(), ((C18002t0) c17945a0.m94929K2()).f91181B.m153169a());
                AbstractC23647d.m123893c();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f60302e0, e11);
        }
    }

    /* renamed from: e2 */
    public void m64560e2(final int i11) {
        ChatView chatView = this.f60306Q;
        if (chatView != null) {
            chatView.f56779N2.post(new Runnable() { // from class: v50.sb
                @Override // java.lang.Runnable
                public final void run() {
                    C11603g0.this.m64505S1(i11);
                }
            });
        }
    }

    /* renamed from: h2 */
    public void m64561h2() {
        m64565t1();
        m10008p();
    }

    /* renamed from: i2 */
    public void m64562i2() {
        ChatView chatView = this.f60306Q;
        if (chatView != null) {
            if (chatView.m60020gQ().mo60546Cc()) {
                if (!this.f60306Q.f56917w2.get()) {
                    this.f60306Q.f56917w2.set(true);
                    return;
                }
                return;
            }
            m64545t2();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.AbstractC11316a
    /* renamed from: j0 */
    protected String mo60496j0() {
        int mo60487Z = mo60487Z();
        if (mo60487Z != 2) {
            if (mo60487Z != 3) {
                return C28020b3.f130648a.m141208y("CHAT_VIEW_", this.f60306Q.m92676n2());
            }
            return C28020b3.f130648a.m141208y("CONTEXT_MENU_", this.f60306Q.m92676n2());
        }
        return C28020b3.f130648a.m141208y("CHAT_DETAILS_", this.f60306Q.m92676n2());
    }

    /* renamed from: k2 */
    public void m64563k2(C3535c c3535c) {
        this.f57026x = c3535c;
        this.f57024v = c3535c.m17971y0();
        AbstractC25280e abstractC25280e = this.f60318c0;
        if (abstractC25280e != null) {
            abstractC25280e.m130840r(this.f57026x.m17944I0());
        }
    }

    @Override // com.zing.zalo.p077ui.chat.AbstractC11316a
    /* renamed from: l0 */
    protected int mo60498l0() {
        return this.f60306Q.m60020gQ().mo60607N6();
    }

    /* renamed from: m2 */
    public void m64564m2(boolean z11) {
        this.f60308S = z11;
    }

    /* renamed from: t1 */
    public void m64565t1() {
        m60478Q();
        if (this.f57026x != null) {
            this.f57025w = m60494h0().size();
            m64485G1();
        } else {
            this.f57025w = 0;
        }
    }

    /* renamed from: u1 */
    public void m64566u1() {
        this.f60312W = null;
    }

    /* renamed from: w1 */
    public void m64567w1() {
        Iterator it = this.f60314Y.iterator();
        while (it.hasNext()) {
            ((ChatRow) it.next()).m61023T2();
        }
        Iterator it2 = this.f60315Z.iterator();
        while (it2.hasNext()) {
            ((ChatRowWebContent) it2.next()).m61848f0();
        }
    }

    /* renamed from: x1 */
    public C20040b m64568x1() {
        return this.f60317b0;
    }

    /* renamed from: z1 */
    public int m64569z1(int i11) {
        return (this.f57025w - i11) - 1;
    }
}

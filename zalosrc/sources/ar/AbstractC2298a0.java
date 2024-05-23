package ar;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import bo.C3020p0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.feed.mvp.socialmemory.SocialMemoryView;
import com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.zviews.EditFeedView;
import com.zing.zalo.p077ui.zviews.FeedDetailsView;
import com.zing.zalo.p077ui.zviews.ImageCommentView;
import com.zing.zalo.p077ui.zviews.QuickCreateGroupView;
import com.zing.zalo.p077ui.zviews.ShareMemoryView;
import com.zing.zalo.p077ui.zviews.TagsListView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.animation.AnimationTarget;
import hf0.C20043e;
import i40.C20275e;
import is.AbstractC20826v0;
import me0.AbstractC23118k2;
import me0.AbstractC23152n3;
import p354n3.C23528a;
import p542ub.InterfaceC27218a;
import p716zh.C32002l4;
import v50.C27870vb;

/* renamed from: ar.a0 */
/* loaded from: classes4.dex */
public abstract class AbstractC2298a0 {
    /* renamed from: a */
    private static Bundle m12149a(C2310k c2310k) {
        Bundle bundle = new Bundle();
        if (c2310k != null) {
            bundle.putParcelableArrayList("medialist", c2310k.m12219j());
            bundle.putInt("currentIndex", c2310k.m12214e());
            bundle.putInt("BOL_EXTRA_FROM_COMMENT_PHOTO", c2310k.m12213d());
            bundle.putString("userId", c2310k.m12222m());
            bundle.putString("EXTRA_COMMENT_ITEM", c2310k.m12212c());
            bundle.putString("EXTRA_COMMENT_FEED_OWNER_ID", c2310k.m12216g());
            bundle.putInt("EXTRA_INT_SUB_TITLE_MODE", c2310k.m12221l());
            bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", c2310k.m12218i());
            bundle.putBoolean("previewUploadPhoto", c2310k.m12225p());
            bundle.putBoolean("hideImageFunction", c2310k.m12224o());
            bundle.putBoolean("showLimitMenu", c2310k.m12227r());
            bundle.putBoolean("BOL_FROM_IMAGE_COMMENT", c2310k.m12223n());
            bundle.putBoolean("EXTRA_SHOULD_PREVENT_SCREENSHOT", c2310k.m12226q());
            bundle.putString("feedId", c2310k.m12215f());
            bundle.putString("EXTRA_SCREEN_MUSIC_IDENTIFIER", c2310k.m12220k());
        }
        return bundle;
    }

    /* renamed from: b */
    public static void m12150b(AbstractC2325z abstractC2325z, InterfaceC27218a interfaceC27218a, int i11, ImageView imageView, C23528a c23528a, C20275e c20275e) {
        if (abstractC2325z != null && interfaceC27218a != null) {
            int i12 = abstractC2325z.f9817a;
            if (i12 != 8) {
                if (i12 == 9 && (abstractC2325z instanceof C2323x)) {
                    C2323x c2323x = (C2323x) abstractC2325z;
                    Bundle bundle = new Bundle();
                    bundle.putInt("EXTRA_INT_REQUEST_CODE", i11);
                    bundle.putBoolean("EXTRA_BOOL_HIDE_FEED_CONTROL_LAYOUT", c2323x.m12278e());
                    C20043e.m104032w(interfaceC27218a, c2323x.m12277d().f42594q0, AbstractC20826v0.m108789V(c2323x.m12277d().f42594q0), 1, bundle, c2323x.m12276c());
                    return;
                }
                return;
            }
            if (abstractC2325z instanceof C2310k) {
                C2310k c2310k = (C2310k) abstractC2325z;
                interfaceC27218a.mo35556V(imageView, c2310k.m12217h(), m12149a(c2310k), c20275e, i11);
            }
        }
    }

    /* renamed from: c */
    public static void m12151c(AbstractC2325z abstractC2325z, InterfaceC27218a interfaceC27218a, int i11, AnimationTarget animationTarget, C23528a c23528a, C20275e c20275e) {
        if (abstractC2325z != null && interfaceC27218a != null && abstractC2325z.f9817a == 8 && (abstractC2325z instanceof C2310k)) {
            C2310k c2310k = (C2310k) abstractC2325z;
            interfaceC27218a.mo35551H2(animationTarget, c2310k.m12217h(), m12149a(c2310k), c20275e, i11);
        }
    }

    /* renamed from: d */
    public static void m12152d(AbstractC2325z abstractC2325z, C17487o0 c17487o0, int i11) {
        Intent m84986jM;
        if (abstractC2325z != null && c17487o0 != null) {
            int i12 = abstractC2325z.f9817a;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 15) {
                            if (i12 != 16) {
                                switch (i12) {
                                    case 10:
                                        if (abstractC2325z instanceof C2301c) {
                                            C2301c c2301c = (C2301c) abstractC2325z;
                                            Bundle bundle = new Bundle();
                                            bundle.putString("EXTRA_FEED_ID", c2301c.m12161e());
                                            bundle.putString("EXTRA_FEED_CONTENT_JSON", AbstractC20826v0.m108827p(c2301c.m12160d()).toString());
                                            bundle.putString("EXTRA_ENTRY_POINT_CHAIN", c2301c.m12159c().m154277l());
                                            c17487o0.m93066i2(EditFeedView.class, bundle, i11, 1, true);
                                            return;
                                        }
                                        return;
                                    case 11:
                                        if (abstractC2325z instanceof C2312m) {
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putStringArrayList("STR_EXTRA_SELECTED_UIDS", ((C2312m) abstractC2325z).m12248c());
                                            c17487o0.m93069k2(QuickCreateGroupView.class, bundle2, 1, true);
                                            return;
                                        }
                                        return;
                                    case 12:
                                        if (abstractC2325z instanceof C2321v) {
                                            C2321v c2321v = (C2321v) abstractC2325z;
                                            C3020p0 m12268c = c2321v.m12268c();
                                            ItemAlbumMobile m12269d = c2321v.m12269d();
                                            if (c2321v.m12270e()) {
                                                m84986jM = TagsListView.m84987kM(m12269d.f42595r, m12269d.f42593q, m12269d.f42599t, m12269d.m40501J());
                                            } else {
                                                m84986jM = TagsListView.m84986jM(m12268c.f12057p, m12268c.f12058q, m12268c.f12022B.f12280b, m12268c.f12059r.f11956a, false);
                                            }
                                            c17487o0.m93066i2(TagsListView.class, m84986jM.getExtras(), i11, 2, true);
                                            return;
                                        }
                                        return;
                                    case 13:
                                        if (abstractC2325z instanceof C2314o) {
                                            C2314o c2314o = (C2314o) abstractC2325z;
                                            Bundle bundle3 = new Bundle();
                                            bundle3.putString("memory_entry_attachment", c2314o.m12253d());
                                            if (!TextUtils.isEmpty(c2314o.m12252c())) {
                                                bundle3.putString("entry_point_chain", c2314o.m12252c());
                                            }
                                            c17487o0.m93066i2(ShareMemoryView.class, bundle3, i11, 1, true);
                                            return;
                                        }
                                        return;
                                    default:
                                        return;
                                }
                            }
                            if (abstractC2325z instanceof C2320u) {
                                C2320u c2320u = (C2320u) abstractC2325z;
                                String m12266c = c2320u.m12266c();
                                int m12265b = c2320u.m12265b();
                                Bundle bundle4 = new Bundle();
                                bundle4.putString("EXTRA_REQUESTED_STORY_ID", m12266c);
                                bundle4.putInt("EXTRA_SOURCE_OPEN_FROM", m12265b);
                                c17487o0.m93066i2(StoryArchiveView.class, bundle4, i11, 1, true);
                                return;
                            }
                            return;
                        }
                        if (abstractC2325z instanceof C2316q) {
                            C32002l4 m12258c = ((C2316q) abstractC2325z).m12258c();
                            Bundle bundle5 = new Bundle();
                            if (m12258c != null) {
                                bundle5.putString("entry_point_chain", m12258c.m154277l());
                            }
                            c17487o0.m93066i2(SocialMemoryView.class, bundle5, i11, 1, true);
                            return;
                        }
                        return;
                    }
                    if (abstractC2325z instanceof C2297a) {
                        C2297a c2297a = (C2297a) abstractC2325z;
                        if (c2297a.m12143f()) {
                            Bundle m140776b = new C27870vb(c2297a.m12140c().mo2478b()).m140780g(c2297a.m12140c()).m140776b();
                            m140776b.putString("groupId", c2297a.m12141d().m153781r());
                            m140776b.putString("groupName", c2297a.m12141d().m153793y());
                            c17487o0.m93069k2(ChatView.class, m140776b, 1, true);
                            return;
                        }
                        Bundle m140776b2 = new C27870vb(c2297a.m12140c().mo2478b()).m140780g(c2297a.m12140c()).m140776b();
                        if (!TextUtils.isEmpty(c2297a.m12142e())) {
                            m140776b2.putString("SOURCE_ACTION", "7802");
                        }
                        c17487o0.m93069k2(ChatView.class, m140776b2, 1, true);
                        return;
                    }
                    return;
                }
                if (abstractC2325z instanceof C2308i) {
                    C2308i c2308i = (C2308i) abstractC2325z;
                    Bundle bundle6 = new Bundle();
                    bundle6.putString("userId", c2308i.m12202i());
                    bundle6.putString("picid", c2308i.m12200g());
                    bundle6.putLong("extra_notification_id", c2308i.m12199f());
                    if (!TextUtils.isEmpty(c2308i.m12197d())) {
                        bundle6.putString("extra_feed_id", c2308i.m12197d());
                    }
                    if (!TextUtils.isEmpty(c2308i.m12198e())) {
                        bundle6.putString("extra_highlight_comment_id", c2308i.m12198e());
                    }
                    bundle6.putInt("fromSrc", c2308i.m12201h());
                    bundle6.putString("extra_entry_point_flow", c2308i.m12196c());
                    c17487o0.m93066i2(ImageCommentView.class, bundle6, i11, 1, true);
                    return;
                }
                return;
            }
            if (abstractC2325z instanceof C2304e) {
                C2304e c2304e = (C2304e) abstractC2325z;
                Bundle bundle7 = new Bundle();
                if (!TextUtils.isEmpty(c2304e.m12169d())) {
                    bundle7.putString("fid", c2304e.m12169d());
                }
                if (!TextUtils.isEmpty(c2304e.m12172g())) {
                    bundle7.putString("ownerId", c2304e.m12172g());
                }
                bundle7.putLong("extra_notification_id", c2304e.m12171f());
                bundle7.putInt("fromSrc", c2304e.m12173h());
                bundle7.putString("extra_entry_point_flow", c2304e.m12168c());
                if (!TextUtils.isEmpty(c2304e.m12170e())) {
                    bundle7.putString("extra_highlight_comment_id", c2304e.m12170e());
                }
                c17487o0.m93066i2(FeedDetailsView.class, bundle7, i11, 1, true);
            }
        }
    }

    /* renamed from: e */
    public static void m12153e(AbstractC2325z abstractC2325z, InterfaceC27218a interfaceC27218a, Context context, int i11) {
        if (abstractC2325z != null && interfaceC27218a != null) {
            int i12 = abstractC2325z.f9817a;
            if (i12 != 3) {
                if (i12 != 4) {
                    if (i12 == 5 && (abstractC2325z instanceof C2306g)) {
                        C2306g c2306g = (C2306g) abstractC2325z;
                        int m12182c = c2306g.m12182c();
                        if (m12182c != 1) {
                            if (m12182c != 2) {
                                if (m12182c == 3) {
                                    if (!TextUtils.isEmpty(c2306g.m12186g())) {
                                        AbstractC23118k2.m118590c(context, c2306g.m12186g(), c2306g.m12183d(), AbstractC23118k2.m118596i(), c2306g.m12185f(), 82, "", "", c2306g.m12187h(), "");
                                        return;
                                    } else {
                                        if (c2306g.m12183d() > 0) {
                                            AbstractC23118k2.m118600m(context, c2306g.m12183d(), c2306g.m12187h(), "");
                                            return;
                                        }
                                        return;
                                    }
                                }
                                return;
                            }
                            if (!TextUtils.isEmpty(c2306g.m12184e())) {
                                AbstractC23118k2.m118602o(context, c2306g.m12184e(), c2306g.m12187h(), "");
                                return;
                            }
                            return;
                        }
                        AbstractC23118k2.m118600m(context, c2306g.m12183d(), c2306g.m12187h(), "");
                        return;
                    }
                    return;
                }
                if (abstractC2325z instanceof C2318s) {
                    AbstractC23152n3.m119066r0(interfaceC27218a, ((C2318s) abstractC2325z).m12262c(), "", 0, "", 8);
                    return;
                }
                return;
            }
            if (abstractC2325z instanceof C2300b0) {
                String m12155c = ((C2300b0) abstractC2325z).m12155c();
                try {
                    ZaloWebView.m87103hS(interfaceC27218a, m12155c);
                } catch (ActivityNotFoundException unused) {
                    AbstractC23152n3.m119048i0(context, m12155c);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }
}

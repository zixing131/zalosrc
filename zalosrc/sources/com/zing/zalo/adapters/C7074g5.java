package com.zing.zalo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import bo.C3000l0;
import bo.C3020p0;
import bo.InterfaceC2946a1;
import com.zing.p058v4.view.AbstractC6881a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.FeedContentMessagePopup;
import com.zing.zalo.feed.components.FeedItemBase;
import com.zing.zalo.feed.components.FeedItemBaseModuleView;
import com.zing.zalo.feed.components.FeedItemLinkModulesView;
import com.zing.zalo.feed.components.FeedItemMemory;
import com.zing.zalo.feed.components.FeedItemPhotoModuleView;
import com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView;
import com.zing.zalo.feed.components.FeedItemStickerModulesView;
import com.zing.zalo.feed.components.FeedItemTextModuleView;
import com.zing.zalo.feed.components.FeedItemVideo;
import com.zing.zalo.social.controls.InterfaceC10867f;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import p361nb.AbstractC23647d;

/* renamed from: com.zing.zalo.adapters.g5 */
/* loaded from: classes3.dex */
public class C7074g5 extends AbstractC6881a {

    /* renamed from: r */
    ArrayList f38666r;

    /* renamed from: s */
    private InterfaceC10867f f38667s;

    /* renamed from: t */
    private final Context f38668t;

    /* renamed from: u */
    private final LayoutInflater f38669u;

    /* renamed from: com.zing.zalo.adapters.g5$a */
    /* loaded from: classes3.dex */
    class a implements View.OnTouchListener {

        /* renamed from: p */
        boolean f38670p = false;

        /* renamed from: q */
        int f38671q = 0;

        /* renamed from: r */
        final /* synthetic */ b f38672r;

        a(b bVar) {
            this.f38672r = bVar;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action == 2) {
                    this.f38670p = true;
                }
            } else if (this.f38670p) {
                this.f38670p = false;
                if (this.f38671q != this.f38672r.f38675b.getScrollY()) {
                    this.f38671q = this.f38672r.f38675b.getScrollY();
                    AbstractC23647d.m123897g("49140002");
                }
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.adapters.g5$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        public FrameLayout f38674a;

        /* renamed from: b */
        public ScrollView f38675b;
    }

    public C7074g5(Context context, ArrayList arrayList, InterfaceC10867f interfaceC10867f) {
        this.f38667s = interfaceC10867f;
        this.f38668t = context;
        this.f38666r = new ArrayList(arrayList);
        this.f38669u = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: d */
    public void mo35332d(ViewGroup viewGroup, int i11, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        ArrayList arrayList = this.f38666r;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: k */
    public Object mo35339k(ViewGroup viewGroup, int i11) {
        b bVar;
        View inflate;
        View view = null;
        try {
            bVar = new b();
            inflate = this.f38669u.inflate(AbstractC7409c0.popupmsg_feed_item, (ViewGroup) null);
        } catch (Exception e11) {
            e = e11;
        }
        try {
            bVar.f38674a = (FrameLayout) inflate.findViewById(AbstractC6918a0.attachment_containter);
            ScrollView scrollView = (ScrollView) inflate.findViewById(AbstractC6918a0.scrollview);
            bVar.f38675b = scrollView;
            scrollView.setOnTouchListener(new a(bVar));
            inflate.setTag(bVar);
            FeedContentMessagePopup feedContentMessagePopup = (FeedContentMessagePopup) this.f38666r.get(i11);
            if (feedContentMessagePopup != null) {
                bVar.f38674a.setBackgroundResource(AbstractC16803z.rectangle_white);
                C3020p0 c3020p0 = feedContentMessagePopup.f42531p;
                C3000l0 c3000l0 = feedContentMessagePopup.f42532q;
                InterfaceC2946a1 interfaceC2946a1 = feedContentMessagePopup.f42533r;
                int m14327d0 = c3000l0.m14327d0(c3020p0.f12057p);
                int i12 = c3020p0.f12058q;
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 6) {
                                if (i12 != 7) {
                                    if (i12 != 17) {
                                        if (i12 != 22) {
                                            if (i12 != 24) {
                                            }
                                        } else {
                                            FeedItemMemory feedItemMemory = new FeedItemMemory(this.f38668t);
                                            feedItemMemory.mo43688p(this.f38668t, 4);
                                            FeedItemBase.m43679x(feedItemMemory, c3000l0);
                                            FeedItemBase.m43657B(feedItemMemory, c3000l0, m14327d0, true, this.f38667s);
                                            FeedItemBase.m43658C(feedItemMemory, c3000l0);
                                            FeedItemBase.m43660F(feedItemMemory, c3000l0, m14327d0, this.f38668t, null, this.f38667s, false, null);
                                            feedItemMemory.m43837W(c3020p0, false);
                                            bVar.f38674a.addView(feedItemMemory);
                                        }
                                    } else {
                                        FeedItemVideo feedItemVideo = new FeedItemVideo(this.f38668t);
                                        feedItemVideo.mo43688p(this.f38668t, 4);
                                        FeedItemBase.m43679x(feedItemVideo, c3000l0);
                                        FeedItemBase.m43657B(feedItemVideo, c3000l0, m14327d0, false, this.f38667s);
                                        FeedItemBase.m43658C(feedItemVideo, c3000l0);
                                        FeedItemBase.m43660F(feedItemVideo, c3000l0, m14327d0, this.f38668t, null, this.f38667s, false, null);
                                        feedItemVideo.mo43897w0(c3000l0, m14327d0, false, this.f38668t, this.f38667s, null);
                                        bVar.f38674a.addView(feedItemVideo);
                                    }
                                }
                                FeedItemLinkModulesView feedItemLinkModulesView = new FeedItemLinkModulesView(this.f38668t);
                                feedItemLinkModulesView.mo43705j0(this.f38668t, 4);
                                FeedItemBaseModuleView.m43693l0(feedItemLinkModulesView, c3000l0);
                                feedItemLinkModulesView.m43696Y(c3000l0, m14327d0, false, null, this.f38667s);
                                feedItemLinkModulesView.m43800B0(c3000l0, m14327d0, this.f38668t, false, null, this.f38667s);
                                bVar.f38674a.addView(feedItemLinkModulesView);
                            } else {
                                FeedItemStickerModulesView feedItemStickerModulesView = new FeedItemStickerModulesView(this.f38668t);
                                feedItemStickerModulesView.mo43705j0(this.f38668t, 4);
                                FeedItemBaseModuleView.m43693l0(feedItemStickerModulesView, c3000l0);
                                feedItemStickerModulesView.m43696Y(c3000l0, m14327d0, false, null, this.f38667s);
                                feedItemStickerModulesView.m44092o0(c3000l0, m14327d0, false, null, "POPUP_MESSAGE_SEND_FEED");
                                bVar.f38674a.addView(feedItemStickerModulesView);
                            }
                        } else {
                            FeedItemPhotoMultiModuleView feedItemPhotoMultiModuleView = new FeedItemPhotoMultiModuleView(this.f38668t);
                            feedItemPhotoMultiModuleView.mo43705j0(this.f38668t, 4);
                            FeedItemBaseModuleView.m43693l0(feedItemPhotoMultiModuleView, c3000l0);
                            feedItemPhotoMultiModuleView.m43696Y(c3000l0, 0, false, null, null);
                            feedItemPhotoMultiModuleView.m43697a0(c3000l0);
                            feedItemPhotoMultiModuleView.mo43698b0(c3000l0, 0, this.f38668t, null, null, false, null, true);
                            feedItemPhotoMultiModuleView.m43984n1(3, m14327d0, c3000l0, m14327d0, null, false, 0, null, null);
                            feedItemPhotoMultiModuleView.m43700e0();
                            feedItemPhotoMultiModuleView.m43882z0(interfaceC2946a1);
                            feedItemPhotoMultiModuleView.setFeedMusicCallback(null);
                            bVar.f38674a.addView(feedItemPhotoMultiModuleView);
                        }
                    } else {
                        FeedItemPhotoModuleView feedItemPhotoModuleView = new FeedItemPhotoModuleView(this.f38668t);
                        feedItemPhotoModuleView.mo43705j0(this.f38668t, 4);
                        FeedItemBaseModuleView.m43693l0(feedItemPhotoModuleView, c3000l0);
                        feedItemPhotoModuleView.m43696Y(c3000l0, 0, false, null, null);
                        feedItemPhotoModuleView.m43697a0(c3000l0);
                        feedItemPhotoModuleView.mo43698b0(c3000l0, 0, this.f38668t, null, null, false, null, true);
                        feedItemPhotoModuleView.setScaleOption(c3020p0);
                        feedItemPhotoModuleView.m43936W0(c3000l0, 0, i11, null, false, null, null);
                        feedItemPhotoModuleView.m43700e0();
                        feedItemPhotoModuleView.m43882z0(interfaceC2946a1);
                        feedItemPhotoModuleView.setFeedMusicCallback(null);
                        bVar.f38674a.addView(feedItemPhotoModuleView);
                    }
                } else {
                    FeedItemTextModuleView feedItemTextModuleView = new FeedItemTextModuleView(this.f38668t);
                    feedItemTextModuleView.mo43705j0(this.f38668t, 4);
                    FeedItemBaseModuleView.m43693l0(feedItemTextModuleView, c3000l0);
                    feedItemTextModuleView.m43696Y(c3000l0, m14327d0, false, null, this.f38667s);
                    feedItemTextModuleView.mo43698b0(c3000l0, m14327d0, this.f38668t, null, this.f38667s, false, null, false);
                    bVar.f38674a.addView(feedItemTextModuleView);
                }
                viewGroup.addView(inflate, -1, -1);
                return inflate;
            }
            return inflate;
        } catch (Exception e12) {
            e = e12;
            view = inflate;
            AbstractC20110a.m104539h(e);
            return view;
        }
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: l */
    public boolean mo35340l(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: w */
    public void m36109w(ArrayList arrayList) {
        this.f38666r = new ArrayList(arrayList);
    }
}

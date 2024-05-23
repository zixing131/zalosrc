package p458qr;

import android.view.View;
import bo.C3020p0;
import com.zing.zalo.feed.components.FeedItemBiography;
import com.zing.zalo.feed.components.FeedItemLinkModulesView;
import com.zing.zalo.feed.components.FeedItemMemory;
import com.zing.zalo.feed.components.FeedItemOAVideo;
import com.zing.zalo.feed.components.FeedItemPhotoModuleView;
import com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView;
import com.zing.zalo.feed.components.FeedItemSocialAlbum;
import com.zing.zalo.feed.components.FeedItemStickerModulesView;
import com.zing.zalo.feed.components.FeedItemSuggestOA;
import com.zing.zalo.feed.components.FeedItemTextModuleView;
import com.zing.zalo.feed.components.FeedItemVideo;
import com.zing.zalo.feed.components.FeedItemZaloVideoContainerView;
import no.C23910c;
import p615wn.C29106b;
import p615wn.C29107c;
import p615wn.C29108d;
import p615wn.C29109e;

/* renamed from: qr.j */
/* loaded from: classes4.dex */
public abstract class AbstractC25477j {
    /* renamed from: a */
    public static C29106b m131961a(C23910c c23910c) {
        boolean z11;
        boolean z12;
        C29106b c29106b;
        int i11;
        if (c23910c == null) {
            return null;
        }
        C3020p0 c3020p0 = c23910c.f115539b;
        boolean z13 = false;
        if (c3020p0 != null && c3020p0.m14498b0()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c3020p0 != null && ((c3020p0.f12058q == 7 && c3020p0.m14480I()) || (i11 = c3020p0.f12058q) == 17 || i11 == 24)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c3020p0 != null && c3020p0.f12058q == 23) {
            z13 = true;
        }
        if (z11) {
            C29108d c29108d = new C29108d(c23910c.f115538a, c23910c.f115539b);
            c29108d.f134949k = c23910c.f115553p;
            c29108d.f134950l = c23910c.f115552o;
            c29106b = c29108d;
        } else if (z12) {
            C29109e c29109e = new C29109e(c23910c.f115538a, c23910c.f115539b);
            c29109e.f134951k = c23910c.f115554q;
            c29109e.f134952l = c23910c.f115555r;
            c29106b = c29109e;
        } else if (z13) {
            C29107c c29107c = new C29107c(c23910c.f115538a, c23910c.f115539b);
            c29107c.f134947k = c23910c.f115554q;
            c29107c.f134948l = c23910c.f115555r;
            c29106b = c29107c;
        } else {
            c29106b = new C29106b(c23910c.f115538a, c23910c.f115539b);
        }
        c29106b.f134942f = c23910c.f115548k;
        c29106b.f134940d = c23910c.f115545h;
        c29106b.f134941e = c23910c.f115546i;
        c29106b.f134939c = c23910c.f115544g;
        c29106b.f134943g = c23910c.f115549l;
        c29106b.f134944h = c23910c.f115550m;
        c29106b.f134945i = c23910c.f115551n;
        c29106b.f134946j = c23910c.f115556s;
        return c29106b;
    }

    /* renamed from: b */
    public static View m131962b(C23910c c23910c, View view, int i11) {
        C3020p0 c3020p0;
        if (c23910c == null || (c3020p0 = c23910c.f115539b) == null) {
            return null;
        }
        int i12 = c3020p0.f12058q;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 6) {
                        if (i12 != 7) {
                            if (i12 != 17) {
                                if (i12 != 108) {
                                    switch (i12) {
                                        case 21:
                                            if (view instanceof FeedItemBiography) {
                                                return view;
                                            }
                                            FeedItemBiography feedItemBiography = new FeedItemBiography(c23910c.f115544g);
                                            feedItemBiography.mo43688p(c23910c.f115544g, 4);
                                            return feedItemBiography;
                                        case 22:
                                            if (view instanceof FeedItemMemory) {
                                                return view;
                                            }
                                            FeedItemMemory feedItemMemory = new FeedItemMemory(c23910c.f115544g);
                                            feedItemMemory.mo43688p(c23910c.f115544g, 4);
                                            return feedItemMemory;
                                        case 23:
                                            if (view instanceof FeedItemSocialAlbum) {
                                                return view;
                                            }
                                            FeedItemSocialAlbum feedItemSocialAlbum = new FeedItemSocialAlbum(c23910c.f115544g);
                                            feedItemSocialAlbum.mo43688p(c23910c.f115544g, 4);
                                            return feedItemSocialAlbum;
                                        case 24:
                                            if (view instanceof FeedItemZaloVideoContainerView) {
                                                return view;
                                            }
                                            FeedItemZaloVideoContainerView feedItemZaloVideoContainerView = new FeedItemZaloVideoContainerView(c23910c.f115544g);
                                            feedItemZaloVideoContainerView.m44300a(c23910c.f115544g, 4);
                                            return feedItemZaloVideoContainerView;
                                        default:
                                            return null;
                                    }
                                }
                                if (view instanceof FeedItemSuggestOA) {
                                    return view;
                                }
                                FeedItemSuggestOA feedItemSuggestOA = new FeedItemSuggestOA(c23910c.f115544g);
                                feedItemSuggestOA.mo43688p(c23910c.f115544g, 4);
                                return feedItemSuggestOA;
                            }
                            if (view instanceof FeedItemVideo) {
                                return view;
                            }
                            FeedItemVideo feedItemVideo = new FeedItemVideo(c23910c.f115544g);
                            feedItemVideo.mo43688p(c23910c.f115544g, 4);
                            return feedItemVideo;
                        }
                        if (c3020p0.m14480I()) {
                            if (view instanceof FeedItemOAVideo) {
                                return view;
                            }
                            FeedItemOAVideo feedItemOAVideo = new FeedItemOAVideo(c23910c.f115544g);
                            feedItemOAVideo.mo43688p(c23910c.f115544g, 4);
                            return feedItemOAVideo;
                        }
                        if (view instanceof FeedItemLinkModulesView) {
                            return view;
                        }
                        FeedItemLinkModulesView feedItemLinkModulesView = new FeedItemLinkModulesView(c23910c.f115544g);
                        feedItemLinkModulesView.mo43705j0(c23910c.f115544g, 4);
                        return feedItemLinkModulesView;
                    }
                    if (view instanceof FeedItemStickerModulesView) {
                        return view;
                    }
                    FeedItemStickerModulesView feedItemStickerModulesView = new FeedItemStickerModulesView(c23910c.f115544g);
                    feedItemStickerModulesView.mo43705j0(c23910c.f115544g, 4);
                    return feedItemStickerModulesView;
                }
                if (view instanceof FeedItemPhotoMultiModuleView) {
                    if (c23910c.f115557t) {
                        ((FeedItemPhotoMultiModuleView) view).m43981e1();
                    }
                    return view;
                }
                FeedItemPhotoMultiModuleView feedItemPhotoMultiModuleView = new FeedItemPhotoMultiModuleView(c23910c.f115544g);
                feedItemPhotoMultiModuleView.mo43705j0(c23910c.f115544g, 4);
                return feedItemPhotoMultiModuleView;
            }
            if (view instanceof FeedItemPhotoModuleView) {
                if (c23910c.f115557t) {
                    ((FeedItemPhotoModuleView) view).m43935U0();
                }
                return view;
            }
            FeedItemPhotoModuleView feedItemPhotoModuleView = new FeedItemPhotoModuleView(c23910c.f115544g);
            feedItemPhotoModuleView.mo43705j0(c23910c.f115544g, 4);
            return feedItemPhotoModuleView;
        }
        if (view instanceof FeedItemTextModuleView) {
            return view;
        }
        FeedItemTextModuleView feedItemTextModuleView = new FeedItemTextModuleView(c23910c.f115544g);
        feedItemTextModuleView.mo43705j0(c23910c.f115544g, 4);
        return feedItemTextModuleView;
    }
}

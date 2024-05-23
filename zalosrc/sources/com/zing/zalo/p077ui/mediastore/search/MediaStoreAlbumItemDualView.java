package com.zing.zalo.p077ui.mediastore.search;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ci.C3508j;
import com.zing.zalo.p077ui.mediastore.collection.MediaStoreCollectionItemView;
import com.zing.zalo.p077ui.mediastore.search.MediaStoreAlbumItemDualView;
import fn0.AbstractC19074t;

/* loaded from: classes6.dex */
public final class MediaStoreAlbumItemDualView extends LinearLayout {

    /* renamed from: p */
    private MediaStoreCollectionItemView[] f64448p;

    /* renamed from: q */
    private InterfaceC12385a f64449q;

    /* renamed from: r */
    private boolean f64450r;

    /* renamed from: com.zing.zalo.ui.mediastore.search.MediaStoreAlbumItemDualView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC12385a {
        /* renamed from: a */
        void mo36886a(C3508j c3508j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaStoreAlbumItemDualView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f64448p = new MediaStoreCollectionItemView[2];
        m69624f(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m69622d(MediaStoreAlbumItemDualView mediaStoreAlbumItemDualView, C3508j c3508j, View view) {
        AbstractC19074t.m100208f(mediaStoreAlbumItemDualView, "this$0");
        InterfaceC12385a interfaceC12385a = mediaStoreAlbumItemDualView.f64449q;
        if (interfaceC12385a != null) {
            interfaceC12385a.mo36886a(c3508j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m69623e(MediaStoreAlbumItemDualView mediaStoreAlbumItemDualView, C3508j c3508j, View view) {
        AbstractC19074t.m100208f(mediaStoreAlbumItemDualView, "this$0");
        InterfaceC12385a interfaceC12385a = mediaStoreAlbumItemDualView.f64449q;
        if (interfaceC12385a != null) {
            interfaceC12385a.mo36886a(c3508j);
        }
    }

    /* renamed from: f */
    private final void m69624f(Context context) {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.5f;
        MediaStoreCollectionItemView mediaStoreCollectionItemView = new MediaStoreCollectionItemView(context, 4);
        mediaStoreCollectionItemView.setGravity(17);
        addView(mediaStoreCollectionItemView, layoutParams);
        this.f64448p[0] = mediaStoreCollectionItemView;
        MediaStoreCollectionItemView mediaStoreCollectionItemView2 = new MediaStoreCollectionItemView(context, 4);
        mediaStoreCollectionItemView2.setGravity(17);
        addView(mediaStoreCollectionItemView2, layoutParams);
        this.f64448p[1] = mediaStoreCollectionItemView2;
    }

    /* renamed from: c */
    public final void m69625c(final C3508j c3508j, final C3508j c3508j2, boolean z11) {
        this.f64450r = z11;
        if (c3508j != null) {
            MediaStoreCollectionItemView mediaStoreCollectionItemView = this.f64448p[0];
            if (mediaStoreCollectionItemView != null) {
                mediaStoreCollectionItemView.setVisibility(0);
                mediaStoreCollectionItemView.m69432c(c3508j, this.f64450r);
                mediaStoreCollectionItemView.m69435i();
                mediaStoreCollectionItemView.setOnClickListener(new View.OnClickListener() { // from class: d80.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MediaStoreAlbumItemDualView.m69622d(MediaStoreAlbumItemDualView.this, c3508j, view);
                    }
                });
            }
        } else {
            MediaStoreCollectionItemView mediaStoreCollectionItemView2 = this.f64448p[0];
            if (mediaStoreCollectionItemView2 != null) {
                mediaStoreCollectionItemView2.setVisibility(4);
                mediaStoreCollectionItemView2.setOnClickListener(null);
            }
        }
        if (c3508j2 != null) {
            MediaStoreCollectionItemView mediaStoreCollectionItemView3 = this.f64448p[1];
            if (mediaStoreCollectionItemView3 != null) {
                mediaStoreCollectionItemView3.setVisibility(0);
                mediaStoreCollectionItemView3.m69432c(c3508j2, this.f64450r);
                mediaStoreCollectionItemView3.m69435i();
                mediaStoreCollectionItemView3.setOnClickListener(new View.OnClickListener() { // from class: d80.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MediaStoreAlbumItemDualView.m69623e(MediaStoreAlbumItemDualView.this, c3508j2, view);
                    }
                });
                return;
            }
            return;
        }
        MediaStoreCollectionItemView mediaStoreCollectionItemView4 = this.f64448p[1];
        if (mediaStoreCollectionItemView4 != null) {
            mediaStoreCollectionItemView4.setVisibility(4);
            mediaStoreCollectionItemView4.setOnClickListener(null);
        }
    }

    public final void setListener(InterfaceC12385a interfaceC12385a) {
        this.f64449q = interfaceC12385a;
    }
}

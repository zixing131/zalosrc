package com.zing.zalo.feed.components;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import bo.C3000l0;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.social.controls.InterfaceC10867f;
import java.util.ArrayList;
import java.util.List;
import p615wn.C29106b;
import p615wn.C29108d;

/* loaded from: classes4.dex */
public class FeedItemSuggestOA extends FeedItemSuggestMultiBase {

    /* renamed from: c1 */
    private FeedItemSuggestHeader f44821c1;

    /* renamed from: d1 */
    private View.OnClickListener f44822d1;

    /* renamed from: e1 */
    private View.OnClickListener f44823e1;

    public FeedItemSuggestOA(Context context) {
        super(context);
    }

    /* renamed from: Q */
    public void m44146Q(C3000l0 c3000l0, boolean z11, Context context, InterfaceC10867f interfaceC10867f) {
        try {
            FeedItemSuggestHeader feedItemSuggestHeader = this.f44821c1;
            if (feedItemSuggestHeader != null) {
                feedItemSuggestHeader.m44137b(c3000l0, 0, z11, interfaceC10867f);
                this.f44821c1.m44138c(context, c3000l0, 0, interfaceC10867f);
                this.f44821c1.setOnProfileClickListener(this.f44822d1);
                this.f44821c1.setOnSuggestLocationClickListener(this.f44823e1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    public List<Integer> getArrIdsListCallback() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(12);
        arrayList.add(13);
        return arrayList;
    }

    @Override // com.zing.zalo.feed.components.FeedItemSuggestMultiBase
    protected int getContentWidth() {
        return this.f44808a1 ? FeedItemSuggestMultiBase.f44799b1 - (this.f44800S0 * 2) : this.f44802U0;
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    /* renamed from: j */
    public void mo43686j(C29106b c29106b) {
        if (c29106b instanceof C29108d) {
            setFeedContent(c29106b.f134937a);
            m44146Q(c29106b.f134937a, c29106b.f134940d, c29106b.f134939c, c29106b.f134942f);
            C29108d c29108d = (C29108d) c29106b;
            int i11 = c29108d.f134949k;
            m44141P(c29106b.f134939c, c29106b.f134937a, c29106b.f134940d, null, i11, c29106b.f134941e);
            getPager().addOnPageChangeListener(c29108d.f134950l);
            getPager().setCurrentItem(i11);
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemSuggestMultiBase, com.zing.zalo.feed.components.FeedItemSuggestBase, com.zing.zalo.feed.components.FeedItemBase
    /* renamed from: p */
    public void mo43688p(Context context, int i11) {
        try {
            setType(2);
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
            if (i11 == 4) {
                layoutInflater.inflate(AbstractC7409c0.feed_item_suggest_multi_items_detail, this);
                FeedItemSuggestHeader feedItemSuggestHeader = (FeedItemSuggestHeader) findViewById(AbstractC6918a0.feedItemSuggestHeader);
                this.f44821c1 = feedItemSuggestHeader;
                feedItemSuggestHeader.m44136a(context, 4);
            } else {
                layoutInflater.inflate(AbstractC7409c0.feed_item_suggest_multi_items_content, this);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo43688p(context, i11);
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    public void setListListener(SparseArray<View.OnClickListener> sparseArray) {
        setOnProfileClickListenner(sparseArray.get(12));
        setOnLocationClickListener(sparseArray.get(13));
    }

    public void setOnLocationClickListener(View.OnClickListener onClickListener) {
        this.f44823e1 = onClickListener;
    }

    public void setOnProfileClickListenner(View.OnClickListener onClickListener) {
        this.f44822d1 = onClickListener;
    }

    public FeedItemSuggestOA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

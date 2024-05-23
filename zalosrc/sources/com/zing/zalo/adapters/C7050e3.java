package com.zing.zalo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.zing.p058v4.view.AbstractC6881a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* renamed from: com.zing.zalo.adapters.e3 */
/* loaded from: classes.dex */
public class C7050e3 extends AbstractC6881a {

    /* renamed from: r */
    View.OnClickListener f38539r;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m36028x(View view) {
        View.OnClickListener onClickListener = this.f38539r;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: d */
    public void mo35332d(ViewGroup viewGroup, int i11, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        return 1000;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: k */
    public Object mo35339k(ViewGroup viewGroup, int i11) {
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(AbstractC7409c0.item_intro_login, viewGroup, false);
        View findViewById = inflate.findViewById(AbstractC6918a0.layoutContent);
        ImageView imageView = (ImageView) inflate.findViewById(AbstractC6918a0.imgIntro);
        TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.tvTitleIntro);
        TextView textView2 = (TextView) inflate.findViewById(AbstractC6918a0.tvDesIntro);
        ImageView imageView2 = (ImageView) inflate.findViewById(AbstractC6918a0.imgIconZalo);
        int i12 = i11 % 5;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            imageView2.setVisibility(0);
                            findViewById.setVisibility(8);
                            imageView.setVisibility(8);
                            textView.setVisibility(8);
                            textView2.setVisibility(8);
                        }
                    } else {
                        imageView.setImageDrawable(C23212s8.m119609q(context, AbstractC16781w.slide4));
                        textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_slide_4));
                        textView2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_slide_4));
                    }
                } else {
                    imageView.setImageDrawable(C23212s8.m119609q(context, AbstractC16781w.slide3));
                    textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_slide_3));
                    textView2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_slide_3));
                }
            } else {
                imageView.setImageDrawable(C23212s8.m119609q(context, AbstractC16781w.slide2));
                textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_slide_2));
                textView2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_slide_2));
            }
        } else {
            imageView.setImageDrawable(C23212s8.m119609q(context, AbstractC16781w.slide1));
            textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_slide_1));
            textView2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_slide_1));
        }
        viewGroup.addView(inflate);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.d3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7050e3.this.m36028x(view);
            }
        });
        return inflate;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: l */
    public boolean mo35340l(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: y */
    public void m36029y(View.OnClickListener onClickListener) {
        this.f38539r = onClickListener;
    }
}

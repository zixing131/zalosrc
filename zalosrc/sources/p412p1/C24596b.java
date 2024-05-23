package p412p1;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p1.b */
/* loaded from: classes2.dex */
public class C24596b extends AbstractC24595a {

    /* renamed from: b */
    private Context f118366b;

    /* renamed from: c */
    private Uri f118367c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C24596b(AbstractC24595a abstractC24595a, Context context, Uri uri) {
        super(abstractC24595a);
        this.f118366b = context;
        this.f118367c = uri;
    }

    @Override // p412p1.AbstractC24595a
    /* renamed from: a */
    public boolean mo128085a() {
        try {
            return DocumentsContract.deleteDocument(this.f118366b.getContentResolver(), this.f118367c);
        } catch (Exception unused) {
            return false;
        }
    }
}

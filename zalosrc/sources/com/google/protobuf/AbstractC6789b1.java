package com.google.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.b1 */
/* loaded from: classes3.dex */
public abstract class AbstractC6789b1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.b1$a */
    /* loaded from: classes3.dex */
    public static class a implements b {

        /* renamed from: a */
        final /* synthetic */ AbstractC6799f f37246a;

        a(AbstractC6799f abstractC6799f) {
            this.f37246a = abstractC6799f;
        }

        @Override // com.google.protobuf.AbstractC6789b1.b
        /* renamed from: a */
        public byte mo34737a(int i11) {
            return this.f37246a.mo34798e(i11);
        }

        @Override // com.google.protobuf.AbstractC6789b1.b
        public int size() {
            return this.f37246a.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.b1$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        byte mo34737a(int i11);

        int size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m34734a(AbstractC6799f abstractC6799f) {
        return m34735b(new a(abstractC6799f));
    }

    /* renamed from: b */
    static String m34735b(b bVar) {
        StringBuilder sb2 = new StringBuilder(bVar.size());
        for (int i11 = 0; i11 < bVar.size(); i11++) {
            byte mo34737a = bVar.mo34737a(i11);
            if (mo34737a != 34) {
                if (mo34737a != 39) {
                    if (mo34737a != 92) {
                        switch (mo34737a) {
                            case 7:
                                sb2.append("\\a");
                                break;
                            case 8:
                                sb2.append("\\b");
                                break;
                            case 9:
                                sb2.append("\\t");
                                break;
                            case 10:
                                sb2.append("\\n");
                                break;
                            case 11:
                                sb2.append("\\v");
                                break;
                            case 12:
                                sb2.append("\\f");
                                break;
                            case 13:
                                sb2.append("\\r");
                                break;
                            default:
                                if (mo34737a >= 32 && mo34737a <= 126) {
                                    sb2.append((char) mo34737a);
                                    break;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((mo34737a >>> 6) & 3) + 48));
                                    sb2.append((char) (((mo34737a >>> 3) & 7) + 48));
                                    sb2.append((char) ((mo34737a & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m34736c(String str) {
        return m34734a(AbstractC6799f.m34795k(str));
    }
}

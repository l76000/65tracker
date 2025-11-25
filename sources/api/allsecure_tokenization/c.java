package buslogic.app.api.allsecure_tokenization;

import android.content.Context;
import buslogic.app.api.allsecure_tokenization.InvalidParameterException;
import buslogic.app.api.allsecure_tokenization.TokenizationApiException;
import buslogic.beogradplus.R;
import java.net.URL;
import kotlin.jvm.internal.l0;
import okhttp3.h0;
import okhttp3.j0;
import okhttp3.o0;
import okhttp3.p0;
import okhttp3.v;
import okhttp3.y;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TokenizationApi */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9682a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9683b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9684c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9685d;

    /* renamed from: e  reason: collision with root package name */
    public final h0 f9686e;

    /* compiled from: TokenizationApi */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f9687a;

        /* renamed from: b  reason: collision with root package name */
        public String f9688b;

        /* renamed from: c  reason: collision with root package name */
        public String f9689c;

        /* renamed from: d  reason: collision with root package name */
        public h0 f9690d;

        /* renamed from: e  reason: collision with root package name */
        public Context f9691e;

        public final c a() {
            if (this.f9687a != null) {
                if (this.f9690d == null) {
                    this.f9690d = new h0();
                }
                if (this.f9688b == null) {
                    this.f9688b = "https://asxgw.paymentsandbox.cloud";
                }
                if (this.f9689c == null) {
                    this.f9689c = "https://secure.asxgw.com";
                }
                return new c(this.f9690d, this.f9687a, this.f9688b, this.f9689c, this.f9691e);
            }
            throw new IllegalArgumentException("integrationKey needs to be defined");
        }
    }

    public c(h0 h0Var, String str, String str2, String str3, Context context) {
        this.f9686e = h0Var;
        this.f9683b = str;
        this.f9684c = str2;
        this.f9685d = str3;
        this.f9682a = context;
    }

    public static b a() {
        return new b();
    }

    public final void b(JSONObject jSONObject) {
        InvalidParameterException.c cVar;
        InvalidParameterException.a aVar;
        InvalidParameterException.b bVar;
        if (jSONObject != null) {
            InvalidParameterException.b bVar2 = null;
            if (jSONObject.has("pan")) {
                cVar = InvalidParameterException.c.valueOf(jSONObject.getJSONArray("pan").getString(0));
            } else {
                cVar = null;
            }
            if (jSONObject.has("cvv")) {
                aVar = InvalidParameterException.a.valueOf(jSONObject.getJSONArray("cvv").getString(0));
            } else {
                aVar = null;
            }
            if (jSONObject.has("month")) {
                bVar = InvalidParameterException.b.valueOf(jSONObject.getJSONArray("month").getString(0));
            } else {
                bVar = null;
            }
            if (jSONObject.has("year")) {
                bVar2 = InvalidParameterException.b.valueOf(jSONObject.getJSONArray("year").getString(0));
            }
            throw new InvalidParameterException(cVar, aVar, bVar, bVar2);
        }
        throw new TokenizationApiException(TokenizationApiException.a.invalid_response, this.f9682a.getString(R.string.allsecure_payment_error_messages_missing));
    }

    public final b c(a aVar, boolean z9) {
        String str;
        o0 e10;
        String str2 = "";
        h0 h0Var = this.f9686e;
        Context context = this.f9682a;
        if (aVar != null) {
            URL url = new URL(this.f9684c + "/integrated/getTokenizationKey/" + this.f9683b);
            j0.a aVar2 = new j0.a();
            l0.p(url, "url");
            y.b bVar = y.f38660k;
            String url2 = url.toString();
            l0.o(url2, "url.toString()");
            bVar.getClass();
            y c10 = y.b.c(url2);
            l0.p(c10, "url");
            aVar2.f38490a = c10;
            try {
                e10 = h0Var.a(aVar2.b()).e();
                if (e10.c()) {
                    p0 p0Var = e10.U;
                    if (p0Var != null) {
                        JSONObject jSONObject = new JSONObject(p0Var.m());
                        if (jSONObject.has("tokenizationKey")) {
                            str = jSONObject.getString("tokenizationKey");
                            e10.close();
                            URL url3 = new URL(this.f9685d + "/v1/" + str + "/tokenize/creditcard");
                            j0.a aVar3 = new j0.a();
                            l0.p(url3, "url");
                            y.b bVar2 = y.f38660k;
                            String url4 = url3.toString();
                            l0.o(url4, "url.toString()");
                            bVar2.getClass();
                            y c11 = y.b.c(url4);
                            l0.p(c11, "url");
                            aVar3.f38490a = c11;
                            v.a aVar4 = new v.a();
                            if (!z9) {
                                str2 = aVar.f9673b;
                            }
                            aVar4.a("cardHolder", str2);
                            aVar4.a("month", String.valueOf(aVar.f9675d));
                            aVar4.a("year", String.valueOf(aVar.f9676e));
                            String str3 = aVar.f9672a;
                            String str4 = aVar.f9674c;
                            if (str4 == null || str4.isEmpty()) {
                                aVar4.a("panonly", str3);
                            } else {
                                aVar4.a("pan", str3);
                                aVar4.a("cvv", str4);
                            }
                            aVar3.f(aVar4.b());
                            o0 e11 = h0Var.a(aVar3.b()).e();
                            int i10 = e11.R;
                            if (i10 == 401 || i10 == 418) {
                                throw new TokenizationApiException(TokenizationApiException.a.invalid_token_key, context.getString(R.string.allsecure_payment_invalid_token_key));
                            }
                            try {
                                if (e11.c()) {
                                    p0 p0Var2 = e11.U;
                                    if (p0Var2 != null) {
                                        JSONObject jSONObject2 = new JSONObject(p0Var2.m());
                                        if (!jSONObject2.has("success")) {
                                            throw new TokenizationApiException(TokenizationApiException.a.invalid_response, context.getString(R.string.allsecure_payment_expected_success_in_response));
                                        } else if (!jSONObject2.getBoolean("success")) {
                                            b(jSONObject2.getJSONObject("errors"));
                                            throw null;
                                        } else if (!jSONObject2.has("token") || !jSONObject2.has("fingerprint")) {
                                            throw new TokenizationApiException(TokenizationApiException.a.invalid_response, context.getString(R.string.allsecure_payment_expected_token_and_fingerprint_in_response));
                                        } else {
                                            String string = jSONObject2.getString("token");
                                            String string2 = jSONObject2.getString("fingerprint");
                                            JSONObject jSONObject3 = jSONObject2.getJSONObject("creditcard");
                                            if (string == null || string2 == null) {
                                                throw new TokenizationApiException(TokenizationApiException.a.invalid_response, context.getString(R.string.allsecure_payment_expected_token_and_fingerprint_in_response));
                                            }
                                            b bVar3 = new b(string, jSONObject3.getString("lastFourDigits"), jSONObject3.getString("cardType"), jSONObject3.getString("expirationMonth"), jSONObject3.getString("expirationYear"));
                                            e11.close();
                                            return bVar3;
                                        }
                                    } else {
                                        throw new TokenizationApiException(TokenizationApiException.a.invalid_response, context.getString(R.string.allsecure_payment_empty_response_body));
                                    }
                                } else {
                                    TokenizationApiException.a aVar5 = TokenizationApiException.a.invalid_response;
                                    throw new TokenizationApiException(aVar5, context.getString(R.string.allsecure_payment_unexpected_response_code) + ": " + i10);
                                }
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        } else {
                            throw new TokenizationApiException(TokenizationApiException.a.invalid_response, context.getString(R.string.allsecure_payment_missing_tokenization_key_in_response));
                        }
                    } else {
                        throw new TokenizationApiException(TokenizationApiException.a.invalid_response, context.getString(R.string.allsecure_payment_empty_response_body));
                    }
                } else {
                    throw new TokenizationApiException(TokenizationApiException.a.invalid_public_integration_key, context.getString(R.string.allsecure_payment_invalid_public_integration_key));
                }
            } catch (JSONException e12) {
                e12.printStackTrace();
                str = str2;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            throw new IllegalArgumentException("cardData must not be null");
        }
        throw th;
        throw th;
    }
}

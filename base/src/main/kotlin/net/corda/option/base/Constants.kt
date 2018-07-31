package net.corda.option.base

import net.corda.core.contracts.Amount
import net.corda.core.identity.CordaX500Name
import net.corda.finance.EUR
import java.time.Instant

val ORACLE_NAME = CordaX500Name("Oracle", "New York","US")
// TODO: Move towards generating a price for each date based on a seed.
val DUMMY_CURRENT_DATE = Instant.parse("2017-07-03T10:15:30.00Z")!!
val OPTION_CURRENCY = EUR
val RISK_FREE_RATE = 0.01

val COMPANY_STOCK_1 = "USD"

val COMPANY_AMOUNT_1 = Amount(300, OPTION_CURRENCY)

val COMPANY_VOLATILITY_1 = 0.40

val KNOWN_SPOTS = listOf(
        SpotPrice(COMPANY_STOCK_1, DUMMY_CURRENT_DATE, COMPANY_AMOUNT_1)
)
val KNOWN_VOLATILITIES = listOf(
        Volatility(COMPANY_STOCK_1, DUMMY_CURRENT_DATE, COMPANY_VOLATILITY_1)
)
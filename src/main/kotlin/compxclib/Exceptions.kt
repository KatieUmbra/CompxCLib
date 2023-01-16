package compxclib

class IllegalConversionArgument(message: String): Exception(message)

class ConversionRangeOutsideOfBounds(message: String): Exception(message)

class InvalidComparison(message: String): Exception(message)

class InvalidToken(message: String): Exception(message)

class NumberLexerNotInitialized(message: String): Exception(message)

class InvalidOperatorCall(message: String): Exception(message)